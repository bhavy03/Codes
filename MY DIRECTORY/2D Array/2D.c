#include <stdio.h>
int main()
{
    int rows = 2, cols = 3;
    int arr[2][3];

    printf("Enter %d elements:\n", rows * cols);
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            // scanf("%d ", &arr[i][j]);  // without pointers
            scanf("%d", (*(arr + i) + j)); // Using pointers
            //  scanf("%d", (*(*(arr + i) + j) + k));  // for 3D
        }
    }
    // *(arr + i): Gives the address of the i-th row.
    // (*(arr + i) + j): Gives the address of the j-th column in the i-th row.

    printf("Elements of the 2D array are:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("%d ", *(*(arr + i) + j)); // Using pointers
            // printf("%d ", *(*(*(arr + i) + j) + k)); // for 3D
        }
        printf("\n");
    }

    return 0;
}