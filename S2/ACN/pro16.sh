echo "Enter a 7 digit number"
read num
n=1
while [ $n -le 7 ]
do
a=`echo $num | cut -c $n`
echo $a
n=`expr $n + 2`
done
