read -p "Enter the argument : " arg
if [[ -d $arg || -f $arg ]]
then
	if [ -d $arg ]
	then
		echo "$arg is a directory" 
	fi
	if [ -f $arg ]
	then
		echo "$arg is a file" 
	fi
else
	echo "$arg is not a file or dirctory" 
fi
