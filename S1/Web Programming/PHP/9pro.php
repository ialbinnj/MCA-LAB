<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $cpassword = $_POST["cpassword"];

    if ($password !== $cpassword) {
        echo "Password do not match";
    } else {
        if (strlen($password) < 6) {
            echo "Password must be at least 6 characters long";
        } else {
            echo "Registration successful! Welcome, " . $name . "!";
        }
    }
}
?>
