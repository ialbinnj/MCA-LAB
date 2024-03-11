revString(){
   myStr=$1
   revStr=$(echo $myStr | rev)
   echo "Reversed string is $revStr"
}
isPalindrome(){
   myStr=$1
   revStr=$( echo $myStr | rev )
   if [ "$myStr" == "$revStr" ]; then
      echo "The string is palindrome"
   else
      echo "The string is not palindrome"
   fi
}

read -p "Enter a string " inputStr

revString $inputStr
isPalindrome $inputStr
