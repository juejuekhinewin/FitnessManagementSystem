<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>category</title>
    
    <style>
    body{
     background-image: url("adminbg.jpg");
    }
    
    h1{
          text-align: center;
           font-family: 'Courier New', Courier, monospace;
       }
       p{
            text-align: center;
            font-size:20px;
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

.card{
        overflow:hidden;
        text-align: center;
        width: 160px;
        display: inline-block;
        border: 1px solid black;
        border-radius: 20px;
        background-color: aliceblue;
        vertical-align: top;
        margin-left:100px;
        margin: 90px 70px 50px 60px;
        box-shadow: rgb(0 0 0 /25%) 0px 54px 55px, rgb(0 0 0 / 12%) 0px -12px 30px, rgb(0 0 0 / 12%) 0px 4px 6px, rgb(0 0 0 / 17%) 0px 12px 13px, rgb(0 0 0 / 9%) 0px -3px 5px;
       }
   .card-body{
   		
        padding: 17px;
     }
   .card-title{
        margin-top: 0;
        font-size: 18px;
        font-weight: bold;
       }
       .card-paragraph{
        margin-bottom: 0;
        color: black;
       }
       .card-img{
        width: 100%;
        display: block;
       }
       
       .card:hover{width: 220px; transition: 0.5s; box-shadow: inset;}
       #s1,#s2,#s3,#s4,#s5,#s6{
        text-decoration: none;
        color:white;
       }
       #core,#lower,#cardio,#pilates,#yoga{
        opacity: 0.7;
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
<jsp:include page="admin.jsp"></jsp:include>
   <div class="category"  style="margin-left: 300px;">
    <h2 style="color:brown;"><center>Categories in our fitness center </center></h2><br>
    <p>
        A fitness goal is a specific training objective or physical challenge you set for yourself.
        Your goal should be realistic and achievable within a particular time frame, and specific
        to your exercise routine or training habits.
    </p>
    
    <div class="card">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Chest</p>
            <p class="card-paragraph">
                Upper,  Middle,  Lower       
            </p>
        </div>
    </div>
    
    <div class="card" id="core">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Core</p>
            <p class="card-paragraph">
                Abs,Oblique Muscles,Torso
            </p>
        </div>
    </div>
    
    <div class="card" id="lower">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Lower Body</p>
            <p class="card-paragraph">
                Leg,Hip,Thigh,<br>Calf Muscles
            </p>
        </div>
    </div>
    
    <div class="card" id="yoga">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Yoga</p>
            <p class="card-paragraph">
               flexibility, Balanced  metabolism</p>
        </div>
    </div>
    
    <div class="card" id="cardio">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Cardio Workout</p>
            <p class="card-paragraph">
                Low Impact , High Intensity
            </p>
        </div>
    </div>
    
    <div class="card" id="pilates">
        <img src="f1.jpg" class="card-img" alt="">
        <div class="card-body text-left">
            <p class="card-title">Pilates</p>
            <p class="card-paragraph">
            deep core<br>muscles,promotes strength
            </p>
        </div>
    </div>
    
    
    
   </div>

</body>
</html>