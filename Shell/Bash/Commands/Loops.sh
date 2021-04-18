#!/usr/bin/env bash

# while loop in bash

COUNT=0

while [ $COUNT -lt 10 ]
do
	echo $COUNT
	((COUNT++))
done

# for loop in bash, it gets executed only if the parameters are given

PARAMETERS=$@
COUNT=1
for PARAMETER in $PARAMETERS
do
	echo "Parameter "$COUNT "is" $PARAMETER
	((COUNT++))
done
exit 0

# break and continue work as usual
