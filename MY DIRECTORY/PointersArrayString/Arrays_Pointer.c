#include <stdio.h>
#include <string.h>
int main()
{
    int arr[6] = {1, 2, 3, 4, 5, 6};
    // printf("%d\n", arr);
    // arr = &arr[0]
    // these above two both points to first element of array and Type: int*

    // *arr = *&arr[0] = 10

    // &arr while this gives the address of the entire array, not just the first element.
    // Type: int (*)[3] (pointer to an array of 3 integers).

    // **(&arr) for accessing the first element

    // name of array is pointer
    // int n = sizeof(arr) / sizeof(arr[0]);
    // printf("%d \n",sizeof(arr[0]));
    // int *ptr = &arr[0];
    // or
    // int *ptr = arr;

    // int *ptr = &arr;
    // printf("%d\n", *ptr);
    // this won't work

    // int *ptr1 = arr + 1;
    // int *ptr2 = arr + 3;
    // printf("%d\n", *(ptr2 - (ptr1 - arr)));
    // printf("%d\n", *(ptr1 + (ptr2 - ptr1)));
    // printf("%d\n", *ptr1);
    // printf("%d\n", *ptr1++);
    // printf("%d\n", *++ptr1);

    // taking array input from user
    // for (int i = 0; i < 6; i++)
    // {
    // scanf("%d", &arr[i]);
    // scanf("%d", (ptr+i));
    // scanf("%d", ptr++);
    // if need to use this then after completion of for loop reset ptr to base address ptr = arr
    // }

    // for (int i = 0; i < 6; i++)
    // {
    // printf("%d \t", ptr[i]);
    // equivalent to *(ptr + i)
    // printf("%d \t", *(ptr++));
    // }

    // in function call of array we can use pointer as declaration like fun(int [],int n) or
    // fun(int *arr, int n)
    // In C, when you pass an array to a function, the array's name decays into a pointer to its first element.
    // and in function calling use fun(arr,n)
    // void printNumbers(int *ptr,int n);
    // printNumbers(arr, 6);

    // void printNumbers(int *ptr, int n)
    // {
    // int *ptr2 = ptr;
    // for (int i = 0; i < n; i++)
    // {
    // printf("%d \t", ptr[i]);
    // printf("%d \t", *ptr2++);
    // or
    // printf("%d \t", *ptr++);

    // it prints address of array
    // printf("%d \t", ptr++);
    // }
    // printf("\n");
    // }

    // void printNumbers(int *arr, int n)
    // {
    // for (int i = 0; i < n; i++)
    // {
    // printf("%d \t", arr[i]);
    // }
    // printf("\n");
    // }
    // printNumbers(arr, 6);

    // int *func()
    // * signifies that the return type of the function is a pointer, not a simple integer.
    // {
    // static int arr[5] = {1, 2, 3, 4, 5};
    // return arr;
    // }
    // int *ptraa = func();
    // printf("Array Elements: ");
    // for (int i = 0; i < 5; i++)
    // {
    // printf("%d ", *ptraa++);
    // }

    // it is pointer to whole array

    // int arr[3] = {5, 10, 15};
    // int n = sizeof(arr) / sizeof(arr[0]);
    // printf("%d\n", n);
    // Declare pointer variable
    // int(*ptr)[3]; // it references the whole array

    // Assign address of val[0] to ptr.
    // We can use ptr=&val[0];(both are same)
    // ptr = &arr;

    // printf("%p\n", ptr);
    // printf("%p\n", *ptr);
    // printf("%d\n", **ptr);

    // int *ptr = arr;
    // for (int i = 0; i < n; i++)
    // printf("%d ", *ptr++);//avoid using this
    // printf("%d ", (*ptr)[i]);
    // (*ptr)[i] == arr[i] //equivalent
    // If ptr is a pointer to an array, (*ptr) gives the array itself.
    // Accesses the ith element of the array obtained by (*ptr).
    // printf("%d ", ptr[i]);

    return 0;
}