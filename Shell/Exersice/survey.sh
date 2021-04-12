#!/usr/bin/env bash
FILE=$1
AVERAGE=`awk 'BEGIN {FS=";"};NR>1 {sum+=$3;count+=1};END {average=sum/count; printf average}' $FILE`
awk -v average="$AVERAGE" 'BEGIN {FS=";"};NR>1 && $3<average {count+=1};END {print count}' $FILE
