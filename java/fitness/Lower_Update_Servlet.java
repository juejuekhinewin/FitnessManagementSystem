package fitness;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lower_Update_Servlet
 */
@WebServlet("/Lower_Update_Servlet")
public class Lower_Update_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String Name,Age,Email,Phone,Pay,Weight;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lower_Update_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        try
        {
           
           Name = request.getParameter("name");
           Age = request.getParameter("age");
           Email= request.getParameter("email");
           Phone = request.getParameter("phoneno");
           Pay= request.getParameter("payment");
           Weight = request.getParameter("weight");
           
           Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
           Statement stmt = conn.createStatement();
       
           
           String que="update lowerbody_membership set name='"+Name+"'"+
					", age='"+Age+"'"+
					", email='"+Email+"'"+
					", phone_number='"+Phone+"'"+
					", payments='"+Pay+"'"+
					", weight='"+Weight+"'"+
					" where name='"+Name+"'";
           
			int i =stmt.executeUpdate(que);
			if(i>0)
				request.setAttribute("message","Successfully Updated!");
			else
				request.setAttribute("message", "Fail Updated!");
			
			conn.close();
			stmt.close();
		   
	        request.getRequestDispatcher("display.jsp").include(request, response);

	        request.getRequestDispatcher("LowerBody_Display.jsp").include(request,response);
		
			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
