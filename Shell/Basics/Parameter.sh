#!/usr/bin/env bash

# parameters are always passed to the script even if they aren't used

# RULES:
# 1. $0 is the path and name of the executing script
# 2. Parameters are numbered from $0 to $9
# 3. Newer version of bash support ${10}
# 4. Parametes are used by assigning a variable (convention)

NAME=$1
echo "My Name is" $NAME
echo "My username is" $(whoami)
exit 0 # Exit code

# Exit code is a value returned to the system after executing a script
# Exit code 0 reports a success
# Exit code otehr than 0 reports an error
# Exit code ranges from 0 to 255
