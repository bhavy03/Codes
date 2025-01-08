#include <stdio.h>
// pointer is a datatype which stores address
// or variable which stores the address of another variable
// can be of type int,char,array,function,or any other POINTER
// size depends on the architecture.Ex 2bytes for 32 bit
// pointer in c declared using*
// & is address of a variable
// *is the derefrence operator(also called indirection operator) used to get the value at a given address
// like 7 is stored in a and address of a is p therefore &p gives a and *p gives 7

// USES OF POINTERS
// Dynamic memory allocation
// arrays,functions,and structures
// return multiple values from a function
// pointer reduces the code and improves the performance

// NULL pointer
// A pointer that is not assigned any value but NULL is known as the null pointer
// We can use it to initialize a pointer variable when that pointer variable isn't assigned any valid memory address yet
// C implementation would define NULL as ((void *) 0)
// int*ptr=NULL
// The below equation will be true if the pointer is NULL
// ptr == NULL;
// ptr = NULL means ptr is a pointer and ptr = 0 means ptr is a integer
// int *pt = NULL;
// printf("%d", *pt);

// Void pointer
// A void pointer is a pointer that has no associated data type with it.
// A void pointer can hold an address of any type and can be typecasted to any type.
// void pointers cannot be dereferenced.

int main()
{
    int a = 34;
    char c = 'a';
    int *ptra = &a;
    char *ptrc = &c;
    // int *ptra;
    // ptra = &a;
    printf("%d\n", ptra);
    // printf("%p\n", &a);
    // printf("%p\n", (void*)&a); //this is recommended with working %p
    printf("%d\n", *ptra);
    printf("Size of int: %zu bytes\n", sizeof(int));
    printf("Size of ptr: %zu bytes\n", sizeof(ptra));
    printf("Size of ptr: %zu bytes\n", sizeof(ptrc));
    // 32-bit systems: 4 bytes
    // 64-bit systems: 8 bytes
    // Fixed Size: The size of a pointer is fixed for the system,
    // regardless of the data type it points to (e.g., int*, char*, float*).

    // In constant pointers, the pointer points to a fixed memory location,
    // and the value at that location can be changed because it is a variable,
    // but the pointer will always point to the same location because it is made constant here.
    int b = 33;
    // int const *ptr = &b; // ptr = &c; // can't modify value but can point to another address
    // int *const ptr = &b; // *ptr = 4; // address can't change value can be modified
    // const int *const ptr = &b;  // in this nothing can be changed.
    // printf("%d\n", *ptr);
    // *ptr = 4;  //can't do this
    // printf("%d\n", *ptr);

    // int l = 5;
    // int *k = &l;
    // int **j = &k; // int* j = k;
    // printf("%d\n", k);
    // printf("%d\n", **j);

    return 0;
}