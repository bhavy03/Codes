#include <stdio.h>
#define MAX_LIMIT 20

// main function is the entry point in c language
// The main function is called by OS, not the user.

// main function can be written as
// int main(){} or int main(void){}
// main(){} or void main(){} or main(void){} or void main(void){}

// Note: The return type of main function according to C standard should be int only.
// Even if your compiler is able to run void main(), it is recommended to avoid it.
// The convention is that a return value of 0 indicates that the program was completed successfully,
// while any other value indicates that an error occurred.

// int main(int argc, char *argv[])
// {
// printf("The value of argc is %d\n", argc);
// Prining each argument
// for (int i = 0; i < argc; i++)
// {
// printf("%s\n", argv[i]);
// }
// return 0;
// }
// arguments are called command line arguments
// call it as .\Main geek for geek

// The first argument argc means argument count which means
// it stores the number of arguments passed in the command line and by default,
// its value is 1 when no argument is passed.

// The second argument is a char pointer array argv[] which
// stores all the command line arguments passed.
// We can also see in the output when we run the program without passing any command line argument the value of argc is 1.