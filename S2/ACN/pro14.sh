copy(){
  read -p "From file: " from
  read -p "To file: " to
  cp $from $to
}

edit(){
  read -p "File to edit: " edit
  nano $edit
}

rename(){
  read -p "File name: " oldname
  read -p "New File name: " newname
  mv $oldname $newname
}

delete(){
  read -p "File to delete: " delete
  rm $delete
}


echo "1. Copy 2. Edit 3. Rename 4. Delete 5.Quit"



while true; do
    read -p "Choose an option: " choice
    case $choice in
        "1")
            copy
            ;;
        "2")
            edit
            ;;
        "3")
            rename
            ;;
        "4")
            delete
            ;;
        "5")
            echo "We're done"
            break
            ;;
        *)
            echo "Oops, invalid choice"
            ;;
    esac

done

