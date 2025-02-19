# cs3090-block2
This program is a secure password generator. Note that this program only generates a random password of a specified length but does not save it anywhere.

# How to use this program:
Compile and execute the program.
The program will serve you two prompts. 
One asking for your desired password length.
One asking if you want to include special characters in your generated password. 

1. To answer the first prompt, enter an integer number between 1 and 50.

2. To answer the second prompt, type "yes" or "no".

3. The program will generate a randomized password and print it to the console where the user can copy the results to their clipboard.

This tool uses Java's Random class to generate pseudo-random results based on the provided seed. If no seed is provided, an abstracted, default seed is provided. The code in this project relies solely on the default seed to provide pseudo-random results. Please be aware that redistributions and derivatives of this work may contain security risks. A few example scenarios:

1. The derivative provides the user with a non-randomized password that is pre-emptively stored by the distributor. This allows them to know the password and take advantage of it.
2. There may be a false sense of security depending on the date of this distribution. At the moment, SHA encryption is still considered secure by the scientific community. However, decryption tools in the future may be able to brute force SHA in a reasonable time.
