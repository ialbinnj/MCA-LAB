<html>
<head>
  <title>Student Registration</title>
  <style>
   .emsg{
     color:red;
   }

   .container{
     display:flex;
     justify-content:center;
     align-items:center:
     height:100vh;
   }

   .form-container{
     text-align:left;
     padding:20px;
     border:1px solid #ccc;
     box-shadow:0 4px 8px rgba(0,0,0,0.1);
     border-radius:5px;
   }

   .form-container label,
   .form-container input{
     display:block;
     margin-bottom:10px;
    }

   .form-container button{
     background-color:#4caf50;
     color:#fff;
     padding:10px 20px;
     border:none;
     border-radius:3px;
     cursor:pointer;
    }
  </style>
<head>
<body>
 <div class="container">
   <div class="form-container">
    <h2>Registration Form</h2>
    <form id="regForm" method="POST">
      <label>First Name</label>
       <input type="text" name="first_name" placeholder="First Name">
       
       <label>Last Name</label>
       <input type="text" name="last_name" placeholder="Last Name">
       
       <label>Age</label>
       <input type="number" name="age" placeholder="Age">
       
       <label>Subject</label>
       <input type="text" name="subject" placeholder="Subject">
      
      <button type="submit">Register</button>
    </form>
    <div id="emsg" class="emsg"></div>
   </div>
   </div>
</body>
</html>

<?php
 $con = mysqli_connect('localhost', 'root', '','albin');
 
 // get the post records
 $firstName = $_POST['first_name'];
 $lastName = $_POST['last_name'];
 $age = $_POST['age'];
 $subject = $_POST['subject'];
 
 if($firstName and $lastName and $age and
 if($_POST){
   $sql = "INSERT INTO `stdform` ( `first_name`, `last_name`, `age`, `subject`) VALUES ( '$firstName', '$lastName', '$age', '$subject')";
 
   $rs = mysqli_query($con, $sql);
   if($rs)
   {
	echo "Records Inserted";
  }else{
      die "Connection failed";
  }
?>
