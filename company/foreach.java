package com.company;

public class foreach {
    public static void main(String[] args) {
        int [] marks={23,45,98,89,78};
        float [] markss={23.1f,67.4f,89.7f,90.7f};
        System.out.println(markss[1]);
        System.out.println(marks[0]);
        System.out.println(marks.length);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("for each loop using ");
        for(int element:marks)
        {
            System.out.println(element);
        }
    }
}
