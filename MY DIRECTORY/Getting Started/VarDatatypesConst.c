#include <stdio.h>
// A variable in C is a memory location with some name that helps store some form of data and retrieves it when required
// The C variables can be classified into the following types:

// Local Variables
void function()
{
    int x = 10; // local variable
    printf("%d\n", x);
}

// Global Variables
int x = 2;

// Static Variables
// It can be defined only once
// The default value of static variables is zero.
void functionstatic()
{
    int x = 20;        // local variable
    static int y = 30; // static variable
    x = x + 10;
    y = y + 10;
    printf("\tLocal: %d\n\tStatic: %d\n", x, y);
}

// Automatic Variables - All the local variables are automatic variables by default.
// The default value of the auto variables is a garbage value.Syntax: auto int a = 2;

// Extern Variables
// External variables in C can be shared between multiple C files.
// We can declare an external variable using the extern keyword.
// Their scope is global and they exist between multiple C files.

// Register Variables
// Register variables in C are those variables that are stored in the CPU register
// instead of the conventional storage place like RAM.
// Their scope is local and exists till the end of the block or a function.
// These variables are declared using the register keyword.
// The default value of register variables is a garbage value.

// A constant variable in C is a read-only variable whose value cannot be modified once it is defined.
// We can declare a constant variable using the const keyword.
// also had to initialize it as it may throw error without initialization.

#define PI 3
int main()
{
    printf("hello world\n");

    // declaration with definition
    int b;
    printf("Only defined %d\n", b); // prints only garbage value and for global/static 0;

    // assignment
    b = 20;
    printf("Assigned %d\n", b);

    // declaration + definition + initialization
    int c = 5;
    printf("Value of c: %d\n", c);

    x = 5;
    printf("%d\n", x);
    // local variable is given more priority
    // if change in global done by local then if in a function same variable not initialized then update the global variable
    function();

    printf("First Call\n");
    functionstatic();
    printf("Second Call\n");
    functionstatic();
    printf("Third Call\n");
    functionstatic();

    // const int num;
    // num = 4;
    // printf("number is %d", num);

    // way to change the value of a constant variable in C
    const int var = 10;
    int *ptr = (int *)&var; // explicit cast to remove constness
    *ptr = 500;             // changing value
    printf("Final Value of Constant: %d\n", var);
    printf("Accessing through pointer: %d\n", *ptr);

    // int PI = 5;  // it is invalid as already defined in macro
    printf("%d", PI);
    return 0;
}