#!/usr/bin/env bash

# Returns odd number from the given list

LIST=$@
for ITEM in $LIST
do
	if [ `expr $ITEM % 2` -ne 0 ]
	then
		echo $ITEM
	fi
done
exit 0
