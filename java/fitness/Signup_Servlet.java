package fitness;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup_Servlet
 */
@WebServlet("/Signup_Servlet")
public class Signup_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup_Servlet() {
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
		    String uname=request.getParameter("name");
		    String phone=request.getParameter("phonenumber");
		    String pwd=request.getParameter("password");
		    String email=request.getParameter("email");
		    String address=request.getParameter("address");
		    
		    
		  
		  // out.println("UserName:"+uname);
		  // out.println("Password:"+password);
		  // out.println("Email:"+email);
		    
		    
		    try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
		      //out.println("Connection Success!");
		      Statement st=conn.createStatement();
		      
	          String insert_query="INSERT INTO tbsign_up(username,phoneno,password,email,address) values(?,?,?,?,?)";
	          
//		      ResultSet rs=st.executeQuery(query);
		      PreparedStatement pst = conn.prepareStatement(insert_query);
		      pst.setString(1,uname);
	          pst.setString(2,phone);
	          pst.setString(3,pwd);
	          pst.setString(4,email);
	          pst.setString(5,address);
	          
	          int count=pst.executeUpdate();
	          if(count!=0) {
//	        	  out.println("<h1>Signed_up, Successfully!</h1><br>");
	        	  response.sendRedirect("login.html");
//	        	  request.getRequestDispatcher("login.html").include(request,response);
	          }
	          else {
	        	 // out.println("Failed!");
	        	  request.getRequestDispatcher("signup.html").include(request,response);
	        	  
	          }
	        
	          
	          //request.getRequestDispatcher("home.html").include(request,response);
		      
             // String query="select* from signup where UserName='"+uname+"' and Password='"+password+"' and Email='"+email+"'";
		      
		      
		      
   	        //out.println("<h1>"+uname+":Welcome to BODY VISION Page</h1><br>");
		        
		        
		     
	     // else
	     // {
	     //   out.println("<h1>"+uname+":Please enter correct Name, Password and Email.</h1><br>");
	      //  out.println("<h1>Signed_up, Failed!<h1><br>");
              // request.getRequestDispatcher("home.html").include(request,response);	      }
	          
//		      rs.close();
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
