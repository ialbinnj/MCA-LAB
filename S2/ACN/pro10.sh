add(){
  num1=$1
  num2=$2
  res=$((num1+num2))
  echo "$num1 + $num2 = $res"
}

sub(){
  num1=$1
  num2=$2
  res=$((num1-num2))
  echo "$num1 - $num2 = $res"
}

mul(){
  num1=$1
  num2=$2
  res=$((num1*num2))
  echo "$num1 * $num2 = $res"
}

div(){
  num1=$1
  num2=$2
  res=$(echo "scale=2; $num1 / $num2" | bc)
  echo "$num1 / $num2 = $res"
}


read -p "Enter num1: " num1
read -p "Enter num2: " num2

add $num1 $num2
sub $num1 $num2
mul $num1 $num2
div $num1 $num2
