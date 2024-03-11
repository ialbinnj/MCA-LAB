sumOfDigit(){
   values=$1
   sums=0
   while [ $values -gt 0 ]; do
      digit=$((values % 10))
      sums=$((sums + digit))
      values=$((values/10))
   done
   echo "Sum is $sums"
}

read -p "Enter a number " inputVal
sumOfDigit $inputVal
