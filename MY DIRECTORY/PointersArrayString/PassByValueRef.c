#include <stdio.h>
int main()
{
    int n = 4;
    int k = 5;
    // call by value that is it is making copies
    void square(int n)
    {
        n = n * n;
        printf("the square is %d\n", n);
    }
    square(n);
    printf("%d\n", n);

    // call by reference that is addressing the addresses and changing them
    int *m;
    void _square(int *m)
    {
        *m = *m * *m;
        printf("the square is %d\n", *m);
    }
    _square(&k);
    printf("%d\n", k);
}