package fitness;

import java.io.IOException;

import javax.servlet.ServletContextListener;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Cardio_Update_Servlet
 */
@WebServlet("/Cardio_Update_Servlet")
public class Cardio_Update_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cardio_Update_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		PreparedStatement ps = null;
		
		String name=request.getParameter("name");
	    String age=request.getParameter("age");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phoneno");
	    String payment=request.getParameter("payment");
	    String weight=request.getParameter("weight");
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
			Statement st=conn.createStatement();
			
		 String sql="update cardio_membership set name='"+name+"'"+
					", age='"+age+"'"+
					", email='"+email+"'"+
					", phone_number='"+phone+"'"+
					", payments='"+payment+"'"+
					", weight='"+weight+"'"+
					" where name='"+name+"'";
			
			int i =st.executeUpdate(sql);
			if(i>0)
				request.setAttribute("message","Successfully Updated!");
			else
				request.setAttribute("message", "Fail Updated!");
		
			
		    conn.close();
			st.close();
		   
	        request.getRequestDispatcher("display.jsp").include(request, response);

	        request.getRequestDispatcher("Cardio_Display.jsp").include(request,response);
		
			 
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
