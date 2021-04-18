#!/usr/bin/env bash

FILE=$1
FLAG=true
if [ -z $FILE ]
then
	echo "Error: missing file operand"
	FLAG=false
	exit 1
elif [ ! -e $FILE ]
then
	echo "Error: file does not exist"
	FLAG=false
	exit 2
elif [ ! -r $FILE ]
then
	echo "Error: file read permission denied"
	FLAG=false
	exit 3
elif [ $FLAG ]
then
	awk 'BEGIN {FS="|"};NR>1 {print $3, $2}' $FILE | sort -rn | awk 'NR==1 {printf("Highscore: %s\n",$2)}'
	exit 0
fi
