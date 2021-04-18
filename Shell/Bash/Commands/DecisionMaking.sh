#!/usr/bin/env bash

# if, else and elif clause in bash

USER_NAME=$1
if [ $USER_NAME = $(whoami) ]
then 
	echo "Hello A. B. Darekar"
else
	echo "Your user name is "$USER_NAME
fi

PID=$2
if [ $PID -eq $$ ]
then 
	echo "Your guess is correct, the current process ID is "$PID
elif [ $PID -lt $$ ]
then
	echo "Your guess is wrong, the current process ID is greater than "$PID
elif [ $PID -gt $$ ]
then 
	echo "Your guess is wrong, the current process ID is less than "$PID
fi

# Boolean comparitors
# -eq equal to
# -ne not equal to
# -lt less than
# -gt greater than
# -le less than or equal to
# -ge greater than or equal to
