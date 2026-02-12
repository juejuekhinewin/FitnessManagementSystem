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
 * Servlet implementation class OneYear_Update_Servlet
 */
@WebServlet("/OneYear_Update_Servlet")
public class OneYear_Update_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OneYear_Update_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {

			String name=request.getParameter("name");
		    String email=request.getParameter("email");
		    String phone=request.getParameter("phoneno");
		    String address=request.getParameter("address");
		    String weight=request.getParameter("weight");
		    String height=request.getParameter("height");
		    String pay=request.getParameter("payment");
		    

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb", "root", "");
			Statement st = conn.createStatement();
			System.out.print("Database Connected");
			
			String sql="update oneyearpackage set name='"+name+"'"+
					", email='"+email+"'"+
					", phone_no='"+phone+"'"+
					", address='"+address+"'"+
					", weight='"+weight+"'"+
					", height='"+height+"'"+
					", payment='"+pay+"'"+
					" where name='"+name+"'";
			
			int i =st.executeUpdate(sql);
			if(i>0)
				request.setAttribute("message","Successfully Updated!");
			else
				request.setAttribute("message", "Fail Updated!");
		
			
		    conn.close();
			st.close();
			request.getRequestDispatcher("display.jsp").include(request, response);
			request.getRequestDispatcher("OneYear_Display.jsp").include(request, response);

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
