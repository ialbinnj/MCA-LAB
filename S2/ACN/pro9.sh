greatestValue(){
  value1=$1
  value2=$2
  value3=$3
  if [ $value1 -gt $value2 ] && [ $value1 -gt $value3 ]; then
      echo "$value1 is greater"
  elif [ $value2 -gt $value1 ] && [ $value2 -gt $value3 ]; then
      echo "$value2 is greater"
  else
      echo "$value3 is greater"
  fi
}

read -p "Enter a value1 " value1
read -p "Enter a value2 " value2
read -p "Enter a value3 " value3
greatestValue $value1 $value2 $value3
