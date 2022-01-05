#!bin/bash

minval=1000
maxval=0
for((i=0;i<5;i++))
do

randnum=$((RANDOM%900+100))
if[$randnum -gt $maxval]
then
 maxval=$randnum

fi

if[$randnum  -lt $minval]
then 
minval=$randnum

fi

echo $randnum "RANDOM NUMBER"
done
echo "minval" $minval
echo "maxval" $maxval

