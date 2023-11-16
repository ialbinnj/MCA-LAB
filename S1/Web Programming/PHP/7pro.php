<?php
$db = new mysqli("localhost", "root", "", "albin");
if ($db->connect_error) {
die("Connection failed: " . $db->connect_error);
}
$result = $db->query("SELECT * FROM users");
while ($row = $result->fetch_assoc()) {
echo "Name: " . $row['name'] . "<br>";
}
$db->close();
?>
