#!/usr/bin/env bash

# functions in bash must be defined before invoking them, there is no return statement

PARAMETERS=$@
function print() # use of the keyword function is optional
{
	echo $PARAMETERS
}
print $PARAMETERS # parameters are passed in similar way as they are passed to a command
exit 0
