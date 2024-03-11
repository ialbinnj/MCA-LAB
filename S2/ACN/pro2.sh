read -p "Enter a number: " num

isprime=1

if [ $num -lt 2 ]; then
    isprime=0
fi

for (( i=2; i < $num; ++i ))
do
    if [ $((num%i)) -eq 0 ]; then
        isprime=0
        break
    fi
done

if [ $isprime = 1 ]; then
    echo "prime"
else
    echo "not prime"
fi

