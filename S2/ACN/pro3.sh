read -p "Enter a number: " lYear

if [ $((lYear%4)) -eq 0 ] && [ $((lYear%100)) -eq 0 ] && [ $((lYear%400)) -eq 0 ]; then
      echo "is leap year"
else
      echo "not leap year"
fi

