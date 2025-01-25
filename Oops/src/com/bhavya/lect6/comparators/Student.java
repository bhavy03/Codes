package com.bhavya.lect6.comparators;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;

//        we can also create generic interfaces like
//        public interface classname<T>{
//            void display (T value);
//        }
//        and in main class
//    public class main implements classname<Integer>{
//    @Override
//    public void display<Integer value>
//     }
    }

    @Override
    public String toString() {
        return rollno + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks);
        System.out.println("in compare method");
//        if diff==0 both are equals
//        if diff<0:means o is bigger else o is smaller
        return diff;
    }
}
