// DMA is the way to allocate memory to a data structure during runtime
// malloc is memory allocation, calloc is continious allocation and realloc is re-allocation.

// malloc() and calloc() are used to allocate memory at runtime
// malloc() takes number of bytes to be allocated and returns a void pointer to the allocated memory
// calloc() returns a void pointer to the allocated memory and initializes it to zero and do continous allocation
// realloc() is used to reallocate memory to a data structure
// free() is used to free the memory allocated to a data structure

#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Malloc
    int *ptr;
    ptr = (int *)malloc(5 * sizeof(int));
    // this ptr works as an array
    // if here the value of malloc is too big that it can't provide that memory
    // then it will return NULL
    // so we have to check if it is NULL or not
    // if (ptr == NULL)
    // {
    // printf("Memory not allocated\n");
    // exit(0);
    // }
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the value of %d element: ", i + 1);
        scanf("%d", &ptr[i]); // equivalent to (ptr + i)
        // ptr[i] = i + 1;
        // scanf("%d", ptr++);
        // here this won't work because it will lose track of the original base address of the allocated memory
        // Repeated increments will eventually make ptr point outside the allocated block
        // can do this but with int *temp = ptr; and then temp++;
    }
    for (int i = 0; i < 5; i++)
    {
        printf("The value of %d element is: %d\n", i + 1, ptr[i]);
    }

    // Calloc
    // ptr = (int *)calloc(5,sizeof(int));
    // here 5 is no of locations and other one size per location

    // free()
    // at runtime the allocated memory is not tracked by c so we have to free it.
    // free(ptr);

    // realloc
    // it reallocates(increase and decrease) memory using the same pointer and size.
    // ptr = realloc(ptr,newsize)
    return 0;
}