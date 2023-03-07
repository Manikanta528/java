package com.manikanta.oop.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(501, 89.54f);
        Student s2 = new Student(502, 85.84f);
        Student s3 = new Student(503, 87.54f);
        Student s5 = new Student(505, 95.84f);
        Student s6 = new Student(506, 89.64f);

        Student[] list = {s1,s2,s3,s5,s6};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));

        System.out.println(Arrays.toString(list));

//        if(s1.compareTo(s2) > 0 ){
//            System.out.println(s1.compareTo(s2));
//            System.out.println("s1 has more marks");
//        }
    }
}
