read -p "Enter first no: " num1
read -p "Enter second no: " num2
read -p "Enter third no: " num3
read -p "Enter fourth no: " num4

sum=$(($num1+$num2+$num3+$num4))
pro=$(($num1*$num2*$num3*$num4))
avg=$(($sum/4))
echo "Sum: " $sum
echo "Product: " $pro
echo "Averge: " $avg
