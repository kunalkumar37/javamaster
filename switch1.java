package com.company;
import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        int age;
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
//        if(age>56)
//        {
//            System.out.println("you are expereicned!!!");
//        }
//        else if(age>46)
//        {
//            System.out.println("you are semi expereicned ");
//        }
//        else if(age>36)
//        {
//            System.out.println("youu are smei semi  expereiced");
//        }
//        else{
//            System.out.println("you are not ex[pereondskfo");
//
//        }

        switch(age){
            case 10:
                System.out.println("you are going to be an adult");
                break;
            case 23:
                System.out.println("you are going o join a job");
                break;
            case 60:
                System.out.println("you are only in god's hand");
                break;
            default:
                System.out.println("go and enjoy ur life at fulliest");
                }
        System.out.println("we are out from switch system");
    }
}
