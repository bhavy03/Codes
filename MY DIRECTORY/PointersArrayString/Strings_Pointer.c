#include <stdio.h>
#include <string.h>
int main()
{
    // we can initialize string by these two methods
    // it is necessary in char array declaration to use null character to differentiate between array of chars and a string
    char name[] = {'b', 'h', 'a', 'v', 'y', 'a', '\0'};
    // or
    char naam[] = "Bhavya soni";
    // but they both store in the memory as the first one
    // naam[0] = 'S';

    // char *nana;
    // scanf("%s", nana);
    // printf("%s", nana);
    // it will not work

    // now we have string format specifier i.e %s
    // char nam[40];
    // scanf("%s", nam);
    // fgets(nam, 100, stdin);
    // scanf cannot input multiple word strings with spaces
    // here gets() and puts() come into picture but gets is outdated so we use fgets
    // fgets(str,n,file) insteads filename put stdin and it stops when n-1 chars input or new line is entered

    // no need for &name cause it is array of char and name of array is pointer
    // printf("%s", nam);
    // printf("%s", &nam[0]);

    // string using pointers
    // char *str = "hello world"; // Pointer to string literal
    // str[0] = 'H';
    // str = "dadad"; // Reassign to another string literal
    // printf("Renitialized %s\n", str);
    // now this can't be modified but reinitialized

    // char str[] = "hello everyone";
    // str[0] = 'H';
    // str = "dadad";
    // printf("Modifiable %s\n", str);
    // now this can be modified because it is array
    // but can't reinitialized because the base address of the array str is constant i.e immutable

    char firstname[] = "Bhavya";
    char lastname[] = "Bhavya";
    void printString(char arr[])
    {
        for (int i = 0; arr[i] != '\0'; i++)
        {
            printf("%c", arr[i]);
        }
        printf("\n");
    }
    printString(firstname);
    printString(lastname);
    if (firstname == lastname)
    {
        printf("yes");
    }
    else
    {
        printf("no");
    }

    // Creating array of strings for 3 strings
    // with max length of each string as 10
    char arr[3][10] = {"Geek", "Geeks", "Geekfor"};
    // char *arr[] = {"Geek", "Geeks", "Geekfor"};
    // Internally, each string literal (e.g., "Geek") is stored in a separate memory location,
    // and arr[i] holds the address (pointer) to the first character of each string.
    for (int i = 0; i < 3; i++)
    {
        printf("%s\n", arr[i]);
    }
    // void print(char **ptr, int n)
    // {
    // for (int i = 0; i < n; i++)
    // printf("%s\n", *(ptr + i));
    // }

    char ch1[] = "hello to everyone";
    char ch2[] = "dears";
    int length = strlen(ch1);
    printf("%d", length);
    strcpy(ch1, ch2);
    // it copies the value of ch2 in ch1
    puts(ch1);
    char chh[100];
    char cch;
    int i = 0;
    // while (cch != '\n')
    // {
    // scanf("%c", &cch);
    // chh[i] = cch;
    // i++;
    // }
    // chh[i] = '\0';
    // puts(chh);

    // char e = '3';
    // printf("%c\n", e);
    // char str[MAX_LIMIT];
    // fgets(str, MAX_LIMIT, stdin);
    // printf("%s", str);
    // for (int i = 0; i < MAX_LIMIT; i++)
    // {
    // char ch ;
    // scanf("%c", &ch);
    // str[i] = ch;
    // }
    return 0;
}