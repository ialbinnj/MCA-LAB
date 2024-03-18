factList(){
  value=$1
  fact=1
  for ((i=1;i<=value;i++)); do
     fact=$((fact * i))
  done
  echo "Factorial is $fact"
}

read -p "Enter a number " inputValue
factList $inputValue
