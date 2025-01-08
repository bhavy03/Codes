#include <stdio.h>
#include <string.h>

// structures are collection of values of different data types
struct student
{
    int rollno;
    char name[100];
    // char *name;
    int id;
};

// typedef is a keyword used to create alias for data types
typedef struct ComputerEngineeringStudent
{
    int roll;
    int id;
    int mail;
} coe;

struct Student1
{
    char name[50];
    int age;
    float marks;
};

struct A
{
    int var;
    char c;
};

struct Student1 students[3] = {
    {"John", 20, 85.5},
    {"Alice", 22, 90.0},
    {"Bob", 25, 78.0}};

int main()
{
    struct student s1;
    strcpy(s1.name, "hari");
    // s1.name = "hari";
    s1.id = 2;
    s1.rollno = 23;
    printf("%s,%d,%d\n", s1.name, s1.id, s1.rollno);

    // at moment initializing
    struct student s2 = {2, "rajat", 3};
    printf("%s,%d,%d\n", s2.name, s2.id, s2.rollno);

    // pointers in structers
    struct student *ptr = &s2;
    printf("%d\n", (*ptr).rollno);
    printf("%d\n", ptr->rollno);

    // passing structs to function
    void printinfo(struct student s1)
    {
        printf("Here is the student information\n");
        printf("student rollno %d\n", s1.rollno);
        printf("student name %s\n", s1.name);
        printf("student id %d\n", s1.id);
    }
    printinfo(s1);

    // array of structures
    struct student ECE[100];
    ECE[0].rollno = 3;
    ECE[0].id = 4;
    strcpy(ECE[0].name, "kaka");
    printf("%d,%d,%s\n", ECE[0].rollno, ECE[0].id, ECE[0].name);

    // array and pointer of structure
    struct A *arr[5];
    arr[0]->var = 3;
    //  (*arr[0]).var = 3;
    arr[0]->c = 'b';
    printf("%d %c\n", (*arr[0]).var, (*arr[0]).c);
    printf("%d %c\n", arr[0]->var, arr[0]->c);

    coe c1 = {2, 3, 4};

    // Printing size of students
    printf("Size of struct Student: %ld\n", sizeof(struct Student1));
    printf("Size of students array: %ld\n", sizeof(students));

    return 0;
}
