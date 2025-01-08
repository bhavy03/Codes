#include <stdio.h>
#include <stdlib.h>

int main()
{
    int rows, cols;

    // Input the size of the array
    printf("Enter the number of rows and columns: ");
    scanf("%d %d", &rows, &cols);

    // Allocate memory for 2D array
    int **arr = (int **)malloc(rows * sizeof(int *)); // Array of pointers
    for (int i = 0; i < rows; i++)
    {
        arr[i] = (int *)malloc(cols * sizeof(int)); // Each row
    }

    // for 3D array
    // int ***arr = (int ***)malloc(layers * sizeof(int **)); // Array of pointers to 2D arrays
    // for (int i = 0; i < layers; i++)
    // {
    // arr[i] = (int **)malloc(rows * sizeof(int *)); // Each layer
    // for (int j = 0; j < rows; j++)
    // {
    // arr[i][j] = (int *)malloc(cols * sizeof(int)); // Each row in the layer
    // }
    // }

    // Input elements
    printf("Enter the elements of the 2D array:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    // Print elements
    printf("The 2D array is:\n");
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    // Free the allocated memory
    for (int i = 0; i < rows; i++)
    {
        free(arr[i]); // Free each row
    }
    free(arr); // Free the array of pointers

    // free 3D array
    // for (int i = 0; i < layers; i++) {
    // for (int j = 0; j < rows; j++) {
    // free(arr[i][j]); // Free each row
    // }
    // free(arr[i]); // Free each layer
    // }
    // free(arr); // Free the array of pointers to 2D arrays
    
    return 0;
}
