read -p "Enter a number: " input

for ((i=1;i<=10;i++)); do
     res=$((input * i))
     echo "$i * $input = $res"
done
