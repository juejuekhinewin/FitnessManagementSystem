<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body{
  background-image: url("adminbg.jpg");
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
        padding: 10px 15px;
        font-family: Castellar;
        margin-left: 20px;
     }


</style>
</head>
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
 
  <a href="contact.jsp">Contact</a>
  <a href="home.html" class="logout">LogOut</a>
</div>

<div class="main">
  <h2></h2>
  <p></p>
</div>

<script>
/* Loop through all dropdown buttons to toggle between hiding and showing its dropdown content - This allows the user to have multiple dropdowns without any conflict */
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