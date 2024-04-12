read -p "Enter the Number : " a
num=$a
anum=0
while [ $num != 0 ]
do
	digit=$(($num%10))
	anum=$(($anum+$digit**3))
	num=$(($num/10))
done
if [ $a == $anum ]
then
	echo "$a is armstrong number"
else
	echo "$a is not an armstrong number"
fi
