checkFileExist(){
   fileName=$1
   if [ -e $fileName ]
   then
      checkFile $fileName
   else
      echo "File not Exists"
   fi
}

checkFile(){
   fileName=$1
   if [ -w $fileName ]
   then
      echo "File is writable"
   else
      echo "File is not writable"
   fi
   
   if [ -r $fileName ]
   then
      echo "File is readable"
   else
      echo "File is not readable"
   fi
   
   if [[ -r $fileName && -w $fileName ]]
   then
      echo "File is readable and writable"
   else
      echo "File is not readable and writable"
   fi
}

read -p "Enter file name: " fileName
checkFileExist $fileName
