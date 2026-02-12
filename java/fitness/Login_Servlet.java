package fitness;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Servlet() {
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
	    String password=request.getParameter("password");
//	    out.println("Name:"+name);
//	    out.println("Password:"+password);
	    
	      try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
	      //  out.println("Connection Success!");
	        
	    Statement st=conn.createStatement();
        String query="select username, password from tbsign_up where username='"+name+"'";
        ResultSet rs=st.executeQuery(query);
        
        if(rs.next()) {
        	
        	HttpSession session=request.getSession();  
            session.setAttribute("name",name);  
            request.setAttribute("message", "Successfully Logined!");
            
         // out.println("<h1>"+name+":Welcome to BODY VISION Page</h1><br>");
//	        out.println("<h1>Login Successfully!</h1><br>");
            request.getRequestDispatcher("display.jsp").include(request, response);

            
	        request.getRequestDispatcher("home.html").include(request, response); 
	          
	          
	        }
	        else
	        {
	         // out.println("<h1>"+name+":Please enter correct Name and Password</h1><br>");
	         // out.println("<h1>Login Failed!<h1><br>");
	         request.setAttribute("message", "Logined Fail!");
	         request.getRequestDispatcher("display.jsp").include(request, response);

             request.getRequestDispatcher("signup.html").include(request, response);  
	          
	        }
	        rs.close();
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
