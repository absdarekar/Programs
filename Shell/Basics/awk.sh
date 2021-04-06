#!/usr/bin/env bash

# "The Awk Programming Language by Alfred Aho, Brian Kernighan and Peter Weinberger"

# "SECTION 1.1"

# Syntax: awk 'PATTERN  { ACTION }' FILE
FILE=~/Training/Shell/Basics/holdings.data
awk '{print $0}' $FILE # default pattern is match every line, $0 prints the entire line
awk '$3~/[$]/' $FILE # default action is to print every line with the match

# "SECTION 1.2"
awk '{print $1,$3}' $FILE # comma is a seperator
awk '{print NF,$NF}' $FILE # NF, $NF number of fields in a line, last field in a line
awk '{print $2+$2}' $FILE  # awk supports arithmetic operations +,-,*,/,^
awk '{print NR}' $FILE # NR current row number
awk '{print "You hold",$2,"shares in",$1,"of worth",$3,"/-" }' $FILE # add strings

# "SECTION 1.3"
awk '$3~/[$]/{printf("You hold %d shares in %-4s of worth %s/-\n",$2,$1,$3)}' $FILE # formating

# "NOTE: regex in awk"
# Syntax for regular expressions to match pattern:
#	field ~ /regex/
# to invert the matching pattern:
#	field !~ /regex/
# Anchors in regular expressins
#	^	indicates the beginning of the line
#	$	indicated the end of a line
#	\A	denotes the beginning of a string
#	\z	denotes the end of a string
#	\b	marks a word boundary
#	\w	selects any word
#	\W	invert selects any word
#	\s	selects any whitespace character
#	\S	invert any whitespcae characters
#	\d	selects any digit
#	\D	inverts selects any digit
# Grouped matches
#	(pattern)	parentheses indicate that the enclosed letters must appear continuously
#	|		means or in the context of a grouped match
#	[regex]		select specified regex pattern
# Quantifiers
#	.	matches any character
#	+	modifies the preceding set to mean one or more times
#	*	modifies the preceding set to mean zero or more times
#	?	modifies the preceding set to mean zero or one time
#	{n}	modifies the preceding set to mean exactly n times
#	{n,}	modifies the preceding set to mean n or more times
#	{n,m}	modifies the preceding set to mean between n and m times
