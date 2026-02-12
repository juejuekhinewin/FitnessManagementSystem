package fitness;

import java.io.IOException;
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
 * Servlet implementation class PilatesMemberShipServlet
 */
@WebServlet("/PilatesMemberShipServlet")
public class PilatesMemberShipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PilatesMemberShipServlet() {
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
	    	    
	    String name=request.getParameter("name");
	    String age=request.getParameter("age");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phoneno");

	    String payment=request.getParameter("payments");  
	    String weight=request.getParameter("body_weight");
	    
	    try {
	    	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
		    Statement st=conn.createStatement();
		    
		    String insert_query="INSERT INTO pilates_membership(name,age,email,phone_number,payments,weight) values(?,?,?,?,?,?)";
	        PreparedStatement pst = conn.prepareStatement(insert_query);
		    pst.setString(1,name);
	        pst.setString(2,age);
	        pst.setString(3,email);
	        pst.setString(4,phone);
	        pst.setString(5, payment);
	        pst.setString(6,weight);
	        int count=pst.executeUpdate();	 
	        request.getRequestDispatcher("home.html").include(request,response);
	        st.close();
		    conn.close();
		  
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
