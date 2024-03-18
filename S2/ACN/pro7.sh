isEvenOrOdd(){
   value=$1
   if [ $((value % 2)) -eq 0 ]; then
      echo "Number is Even"
   else
      echo "Number is Odd"
   fi
}

read -p "Enter a number " inputValue
isEvenOrOdd $inputValue
