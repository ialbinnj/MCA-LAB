<!DOCTYPE html>
<html lang="en">
<head>
  <title>Database Data</title>
  <style>
    table {
      width: 50%;
      border-collapse: collapse;
      margin: 20px 0;
    }
    table, th, td {
      border: 1px solid black;
    }
    th, td {
      padding: 10px;
      text-align: left;
    }
  </style>
</head>
<body>

<?php

$servername = "localhost";
$username = "root";
$password = "";
$database = "albin";

$connect = new mysqli($servername, $username, $password, $database);

if ($connect->connect_error) {
     die("Connection Failed: " . $connect->connect_error);
}

$sql = "SELECT * FROM userdata";
$result = $connect->query($sql);

if ($result->num_rows > 0) {
     echo "<table><tr><th>ID</th><th>Name</th><th>Email</th></tr>";
     while ($row = $result->fetch_assoc()) {
          echo "<tr><td>".$row["id"]."</td><td>".$row["name"]."</td><td>".$row["email"]."</td></tr>";
     }
     echo "</table>";
} else {
     echo "0 result found";
}

$connect->close();
?>
</body>
</html>

