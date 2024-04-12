read -p "Enter the file name : " filename
read -p "Enter the starting line number : " start
read -p "Enter the ending line number : " end
num=$(($end-$start+1))
cat $filename | head -n $end | tail -n $num
