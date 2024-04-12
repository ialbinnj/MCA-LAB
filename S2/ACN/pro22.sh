read -p "Enter the Directory Name : " directory
if [ -d $directory ]; then
   for file in "$directory"/*; do
       echo "$file"
       if [ -w $filename ]; then
          echo "File is Writable"
       fi
       if [ -r $filename ]; then
          echo "File is Readable"
       fi
   done
else
   echo "Directory is not Exist"
fi
