<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <!--fontawesome link-->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <style>
 body{
 background-color: rgb(62, 128, 151); 
 }
  .ul1{
                list-style-type: none;
                display: inline-flex;
                margin-left: 200px;
                padding: 30px 40px;
                margin-right: 300px;
            }
  li{
    border: 1px solid black;
    padding: 10px 40px;
    border-radius: px; 
    margin-left: 20px;
    margin-right: 20px;
  }
  
  h2{
    margin-left: 300px;
  }
  .user{
    background-color: green;
  }
  .trainer{
    background-color: red;
  }
  .memb{
    background-color: orange;
  }
  .clas{
    background-color: blue;
  }
 </style>
</head>
<body>
<jsp:include page="admin.jsp"></jsp:include>
  <h2>DashBoard</h2>
  <div class="class">
    
    <ul class="ul1">
      
      <li class="user"><img src="gym.gif" alt="" height="50px" width="50px">
        <span><br><br>100+ <br>Login User</span></li>
      <li class="trainer"><img src="personal-trainer.gif" alt="" height="50px" width="50px"><span><br><br>6 <br>Trainer </span></li>
      <li class="memb"><img src="teamwork (1).gif" alt="" height="50px" width="50px"><span><br><br>100+ <br>Join Members</span></li>
      <li class="clas"><img src="presentation.gif" alt="" height="50px" width="50px"><span><br><br>4 <br>Classes</span></li>
    </ul>
  </div>
  
</body>
</html>