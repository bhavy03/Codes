// ptra++;
// printf("%d\n", ptra);
// printf("%d\n", ptra + 2);
// on adding 2 it adds 2 size of int and int is of 4 bit it means it adds 4 in address
// int a=2 and a++ means 3 but if int *ptra=&a and ptra=ptra+1 is used means increase in size of int

// int x = 4;
// int y = x;
// int *y = &x;
// printf("before: x: %d, y: %d\n", x, y);
// x = 123; // modify x
// printf("after:  x: %d, y: %d\n", x, y);
// int a = 46;
// int *ptra = &a;
// printf("The value of a is %d\n", a);
// printf("The value of a is %d\n", *ptra);
// printf("The value of ptra or address of a is %x\n", ptra);
// printf("The value of ptra or address of a is %x\n", &a);
// printf("The value of ptra or address of a is %p\n", ptra);
// here x gives address i.e hexadecimal integer
// printf("The address of pointer to a is %p\n", &ptra);
// here p is a pointer address

// int takes different according to architecture
// arr[i]==*(arr+i)
// if arr is a pointer to arr[0] then arr+i is a pointer to arr[i]
// in pointer for int if arr is 1000 then arr+1 is 1004

// int arr[] = {1, 2, 3, 4, 5, 6};
// int *ptr = arr;
// printf("value at position 3 of the array is %d\n", arr[3]);
// printf("the addresss of first element of the array is %d\n", &arr[0]);
// printf("the addresss of first element of the array is %d\n", arr);
// printf("the addresss of address of the second element of the array is %d\n", &arr[1]);
// printf("the addresss of address of the second element of the array is %d\n", arr + 1);
// arr--: this line will throw an error
printf("\n");
// printf("the value at addresss of first element of the array is %d\n", *(&arr[0]));
// printf("the value at addresss of first element of the array is %d\n", *(arr));
// printf("the value at addresss of address of the second element of the array is %d\n", *(&arr[1]));
// printf("the value at addresss of address of the second element of the array is %d\n", *(arr + 1));

int val[3] = {5, 10, 15};
// Declare pointer variable
int *ptr;
// Assign address of val[0] to ptr.
// We can use ptr=&val[0];(both are same)
ptr = val;
printf("Elements of the array are: ");
printf("%d, %d, %d\n", *ptr, *(ptr + 1), *(ptr + 2));
printf("%d, %d, %d\n", ptr[0], ptr[1], ptr[2]);
printf("%d, %d, %d\n", ptr, (ptr + 1), (ptr + 2));
int arr[5] = {1, 2, 3, 4, 5};
// defining the pointer to array
int *ptr_arr = arr;
// traversing array using pointer arithmetic
for (int i = 0; i < 5; i++)
{
    printf("%d ", *ptr_arr++);
}

// int x[5] = {1,2,3,4,5};
// int *p = x;
// p++;
// printf("%d\n",*p);  //2
// x[2] = *p+p[2];
// p[n] = *(p+n)
// printf("%d", x[2]);  //6