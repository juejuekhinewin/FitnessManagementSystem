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
 * Servlet implementation class SixMonths_Package_Servlet
 */
@WebServlet("/SixMonths_Package_Servlet")
public class SixMonths_Package_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SixMonths_Package_Servlet() {
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
	    String email=request.getParameter("email");
	    String phoneno=request.getParameter("phone");
	    String add=request.getParameter("address");
	    String wei=request.getParameter("weight");
	    String hei=request.getParameter("height");
	    String pay=request.getParameter("payment");
	    
	    
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
		    Statement st=conn.createStatement();
		    PreparedStatement ps=conn.prepareStatement("insert into sixmonthpackage values(?,?,?,?,?,?,?)");  
		    
            ps.setString(1,name);  
            ps.setString(2,email);  
            ps.setString(3,phoneno);  
            ps.setString(4, add);
            ps.setString(5,wei);  
            ps.setString(6,hei);  
            ps.setString(7,pay);  

            int i=ps.executeUpdate();  
            if(i>0)  
            {
            	request.getRequestDispatcher("home.html").include(request,response);
            }
//               out.print("You are successfully inserted...");  

		    
//		    st.executeUpdate("INSERT INTO sixmonthpackage(name,email,phone_no,address,weight,height,payment)VALUES('"+name+"','"+email+"','"+phoneno+"','"+add+"','"+wei+"','"+hei+"','"+pay+"')");

		    
//		    String insert_query="INSERT INTO sixmonthpackage(name,email,phone_no,address,weight,height,payment) values(?,?,?,?,?,?,?,?)";
//	        PreparedStatement pst = conn.prepareStatement(insert_query);
//	        
//		    pst.setString(1,name);
//	        pst.setString(2,email);
//	        pst.setString(3,phoneno);
//	        pst.setString(4,add);
//	        pst.setString(5,wei);
//	        pst.setString(6,hei);
//	        pst.setString(7,pay);
//	        
//	        int count=pst.executeUpdate();	 
	        
	        
	        
	        st.close();
	        out.close();
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
