read -p "Enter the limit : " n
a=0
b=1
echo "Finonacci series is : "
for ((i=0; i<n ; i++))
do
	echo $a
	temp=$b
	b=$(($a+$b))
	a=$temp
done
