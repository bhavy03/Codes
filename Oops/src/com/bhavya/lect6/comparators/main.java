package com.bhavya.lect6.comparators;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Student kunal = new Student(3,343);
        Student rahul = new Student(2,321);
        Student arpit = new Student(14,389);
        Student hanuman = new Student(67,781);
        Student hari = new Student(22,2345);

        Student[] list = {kunal,rahul,arpit,hanuman,hari};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);       // can also do it like this
//        Arrays.sort(list, new Comparator<Student>() {
//                    @Override
//                    public int compare(Student o1, Student o2) {
//                        return -(int) (o1.marks - o2.marks);
//                    }
//              }
//        );
//        or by using lambda expression
        Arrays.sort(list,((o1, o2) -> (int)(o1.marks - o2.marks)));
        System.out.println(Arrays.toString(list));
//        if (/*kunal<rahul not better convention*/kunal.compareTo(rahul)<0 ){
//            System.out.println("Rahul has more marks");
//        }
    }
}
