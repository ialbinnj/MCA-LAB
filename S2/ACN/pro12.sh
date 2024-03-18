totalMark() {
  mark1=$1
  mark2=$2
  mark3=$3
  sums=$((mark1+mark2+mark3))
  echo $sums
}

grade(){
 sums=$1
 if [ $sums -gt 91 ] && [ $sums -le 100 ]; then
    echo "Grade A+"
 elif [ $sums -gt 81 ] && [ $sums -lt 90 ]; then
    echo "Grade A"
 elif [ $sums -gt 71 ] && [ $sums -lt 80 ]; then
    echo "Grade B"
 elif [ $sums -gt 61 ] && [ $sums -lt 70 ]; then
    echo "Grade C"
 elif [ $sums -gt 51 ] && [ $sums -lt 60 ]; then
    echo "Grade D"
 elif [ $sums -lt 51 ]; then
    echo "Failed"
 else
    echo "Invalid"
 fi
}


read -p "English mark [30]: " mark1
read -p "Maths mark [30]: " mark2
read -p "Science mark [30]: " mark3

sums=$(totalMark $mark1 $mark2 $mark3)
echo "----------------------------------"
echo "English Mark: $mark1"
echo "Maths Mark: $mark2"
echo "Science Mark: $mark3"
echo "Total Mark $sums"
grade $sums

