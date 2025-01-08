#include <stdio.h>
int main()
{
    void swap(int a, int b)
    {
        int t = a;
        a = b;
        b = t;
        printf("Value of a and b is %d,%d\n", a, b);
    }
    int ll = 3;
    int kk = 5;
    swap(ll, kk);
    printf("Value of x and y is %d,%d\n", ll, kk);

    void _swap(int *a, int *b)
    {
        int t = *a;
        *a = *b;
        *b = t;
        printf("Value of a and b is %d,%d\n", *a, *b);
    }
    _swap(&ll, &kk);
    printf("Value of x and y is %d,%d\n", ll, kk);

    return 0;
}