#!/usr/bin/env bash

# Print sum of first 10 natural numbers

COUNT=1
SUM=0
while [ $COUNT -le 10 ]
do
	SUM=`expr $SUM + $COUNT`
	((COUNT++))
done
echo $SUM
exit 0
