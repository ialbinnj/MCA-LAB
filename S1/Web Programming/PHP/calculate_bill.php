<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Electricity Bill</title>
</head>
<body>
<h2>Electricity Bill</h2>
<?php
// Tariff rate (cost per kWh)
$tariff_rate = 0.12; // Replace this with your actual tariff rate
// Retrieve user input
$usage = $_POST["usage"];
// Calculate total cost
$total_cost = $usage * $tariff_rate;
// Display the electricity bill
echo "Usage: " . $usage . " kWh<br>";
echo "Tariff Rate: $" . $tariff_rate . " per kWh<br>";
echo "Total Cost: $" . number_format($total_cost, 2);
?>

</body>
</html>
