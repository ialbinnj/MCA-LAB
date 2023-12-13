<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width,initial-scale=1.0">
<title>Airline Reservation</title>
<style>
    .error {
        color:red;
  }
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
   
  }
.form-container {
    text-align: left;
    padding: 20px;
 background-color:pink;
    border: 1px solid #ccc;
    border-radius:5px; 
    box-shadow: 0 4px 8px rgb(255, 99, 71, 0.5);
}
.form-container label,
.form-container input {
    display: block;
    margin-bottom: 10px;
}
.form-container ,botton {
    color: blue;
    padding: 10px 20px;
    border: none;
    border-radius: 3px;
    cursor: pointer;
}
</style>
</head>
<body>
<div class="container">
  <div class="form-container">
     <h2>Airline Reservation</h2>

  <form method="POST">
      <label for="loginname"><b>Login Name</b></label>
    <input type="text" placeholder="Enter Name" name="loginname" id="loginname" required><br>

    <label for="flyingfrom"><b>Flying From</b></label>
    <input type="text" placeholder="flyingfrom" name="flyingfrom" id="flyingfrom" required><br>

    <label for="flyingto"><b>Flying To</b></label>
    <input type="text" placeholder="flyingto" name="flyingto" id="flyingto" required><br>

   <label for="date"><b>Date</b></label>
    <input type="date" placeholder="date" name="date" id="date" required><br>

   <label for="time"><b>Time</b></label>
    <input type="time" placeholder="time" name="time" id="time" required><br>

   <label for="travelclass"><b>Travelling Class</b></label>
    <input type="text" placeholder="travelclass" name="travelclass" id="travelclass" required><br>

       <button type="submit" class="registerbtn">Subimt</button>  
   </form>
</div>
</div>
</body>
</html>
<?php
$servername = "localhost";
 $username = "root";
 $password = "";
 $database = "josmy";
 $conn = new mysqli($servername,$username,$password, $database);
if($conn->connect_error) {
die("connection failed:".$conn->connect_error);
}
if($_POST) {
    $loginname = $_POST["loginname"];
    $flyingfrom = $_POST["flyingfrom"];
    $flyingto = $_POST["flyingto"];   
    $date = $_POST["date"];
    $time = $_POST["time"];
    $travelclass = $_POST["travelclass"];

   $sql = "INSERT INTO airline(loginname,flyingfrom,flyingto,date,time,travelclass) VALUES ('$loginname',
            '$flyingfrom','$flyingto','$date','$time','$travelclass')";

   if ($conn->query($sql) === TRUE) {
         
   echo "Reservation successful." ;

        } else {
       echo " Something wrong went!try again";
  }
$conn->close(); 
}
?>
