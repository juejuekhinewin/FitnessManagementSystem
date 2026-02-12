<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@include file="dbconfig.jsp" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException"%>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>


<html>
<head>
	<title>Update Member Form</title>
</head>
<style>
body{
  background-image: url("adminbg.jpg");
}

table{
padding:2px;

}
  div1{
		float:left;
		margin-top: 180px;
		margin-left:0px;
/* 		margin-right: 150px; */
		padding:0px;
		
	}
	.d1 {
		float:right;
		margin-top: -50px;
		margin-left:20px;
		margin-right:100px;
		padding:0px;
		
	}
/* Fixed sidenav, full height */
.sidenav {
  height: 100%;
  width: 200px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #77BFC7;
  overflow-x: hidden;
  padding-top: 20px;
  
}

/* Style the sidenav links and the dropdown button */
.sidenav a, .dropdown-btn {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 20px;
  color: ivory;
  display: block;
  border: none;
  background: none;
  width: 100%;
  text-align: left;
  cursor: pointer;
  outline: none;
}

/* On mouse-over */
.sidenav a:hover, .dropdown-btn:hover {
  color: #f1f1f1;
}

/* Main content */
.main {
  margin-left: 200px; /* Same as the width of the sidenav */
  font-size: 20px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}

/* Add an active class to the active dropdown button */
.active {
  background-color: #504A4B;
  color: white;
}

/* Dropdown container (hidden by default). Optional: add a lighter background color and some left padding to change the design of the dropdown content */
.dropdown-container {
  display: none;
  background-color: #8FBC8F;
  padding-left: 8px;
}

/* Optional: Style the caret down icon */
.fa-caret-down {
  float: right;
  padding-right: 8px;
}

.s1{
        color: rgb(5, 1, 1);
        font-weight: bold;
        border: 0.2px solid black;
        border-radius: 20px;
        background-color: antiquewhite;
        padding: 10px 20px;
        font-family: Castellar;
        margin-left: 20px;
     }
     
 .button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
 .button1{background-color: #f44336;}
	th,td {
		padding:5px;
	}


</style>
<body>
<div class="sidenav">
  <span class="s1">BODY VISION<i class="fa-brands fa-golang"></i></span><br><br>
  <a href="adminDash.jsp">Dashboard</a>
  <a href="category.jsp">Category</a>
  <a href="Trainers_Display.jsp">Trainer Data</a>
  <button class="dropdown-btn">Member Data 
    <i class="fa fa-caret-down"></i>
  </button>
  
  <div class="dropdown-container">
    <a href="LowerBody_Display.jsp">LOWERBODY</a>
    <a href="Yoga_Display.jsp">YOGA </a>
    <a href="Pilates_Display.jsp">PILATES </a>
    <a href="Cardio_Display.jsp">CARDIO</a>
    <a href="Core_Display.jsp">CORE</a>
  </div>
  
  <button class="dropdown-btn">Packages 
    <i class="fa fa-caret-down"></i>
  </button>
  
  <div class="dropdown-container">
    <a href="ThreeMonthsPackage_Display.jsp">3MONTHS PACKAGE</a>
    <a href="SixMonthsPackage_Display.jsp">6MONTHS PACKAGE </a>
    <a href="OneYearPackage_Display.jsp">1YEAR PACKAGE</a>
    
  </div>
  
  <a href="home.html" class="logout">LogOut</a>
</div>

<div class="main">
  <h2></h2>
  <p></p>
</div>


</div1>

	<%   
	      String age=request.getParameter("update");
	      Class.forName("com.mysql.cj.jdbc.Driver");
	   	  String sql ="select* from core_membership";

	      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fitnessdb","root","");
	      Statement st =con.createStatement();
	   	  ResultSet rs=st.executeQuery(sql); %>

	

	  
       <form action="Core_Update_Servlet" method="post">	  
	   	  <div><p style="color:brown;font-size:50px;text-align:center">Member Update</p>
	      <center>
	      <table width="600" border="1">  
	   	  <tr>
	   	     <% while(rs.next()){%>
	   	    	   	     
	   	   </tr>
	   	   
	   	   	<tr>
	   	  
				<th width="181">
				<div align="left">Name </div></td>
				<td><input type="text" name="name" size="20" value="<%=rs.getString(1)%>" ></td>
			   </tr>
		
			
			<tr>
				<th width="181">
				<div align="left">Age </div></th>
				<td><input type="text" name="age" size="20" value="<%=rs.getString(2)%>"></td>
			</tr>
			<tr>
				<th width="181">
				<div align="left">Email </div></th>
				<td><input type="text" name="email" size="20" value="<%=rs.getString(3)%>"></td>
			</tr>
			<tr>
				<th width="181">
				<div align="left">PhoneNumber </div></th>
				<td><input type="text" name="phoneno" size="20" value="<%=rs.getString(4)%>"></td>
			</tr>
			<tr>
				<th width="181">
				<div align="left">Payments </div></th>
				<td><input type="text" name="payment" size="5" value="<%=rs.getString(5)%>"></td>
			</tr>
			
			<tr>
				<th width="181">
				<div align="left">Weight </div></th>
				<td><input type="text" name="weight" size="20" value="<%=rs.getString(6)%>"></td>
			</tr>
			</table> 
		<td><button type="submit" >Save</button></td></td>
		<% } %>
		
		</form> 
		
		<script>
		var dropdown = document.getElementsByClassName("dropdown-btn");
		var i;
		
		for (i = 0; i < dropdown.length; i++) {
		  dropdown[i].addEventListener("click", function() {
		    this.classList.toggle("active");
		    var dropdownContent = this.nextElementSibling;
		    if (dropdownContent.style.display === "block") {
		      dropdownContent.style.display = "none";
		    } else {
		      dropdownContent.style.display = "block";
		    }
		  });
		}
</script>
		
	  		
</body>
</html>









