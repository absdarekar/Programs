#/usr/bin/env bash

VALID=0

while [ $VALID -eq 0 ]
do
	read -p "Enter your name and age: " NAME AGE
	if [[ ( -z $NAME ) || ( -z $AGE )]]
	then
		echo "Not enough parameters"
		continue
	elif [[ ! $NAME =~ ^[A-Za-z]+$ ]]
	then
		echo  "Non alphabetical character detected in "$NAME
		continue
	elif [[ ! $AGE =~ ^[0-9]+$ ]]
	then
		echo "Non numerical character detected in "$AGE
		continue
	fi
	VALID=1
done
echo "Your name is $NAME and you are $AGE years old."
