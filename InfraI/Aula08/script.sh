#!/bin/bash
for word in $(cat lista_nomes.txt)
do
   echo "O nome é $word"

if [ $word = "Marcel" ]; then
        echo "Encontrei o $word"
else
        let a=$a+1
fi

echo "O valor de a é $a"
done
