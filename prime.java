package com.company;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//Scanner s=new Scanner(System.in);
//        System.out.println("enter a number::");
//        int n=s.nextInt();
//        if(isPrime(n))
//        {
//            System.out.println(n+"is a prime number");
//        }
//        else{
//            System.out.println(n+"is not a prime number");
//        }
//
//    }
//
//    public static boolean isPrime(int n)
//    {
//        if(n<=1)
//        {
//            return false;
//        }
//        for(int i=2;i<Math.sqrt(n);i++)
//        {
//            if(n%i==0)
//            {
//                return false;
//            }
//        }
//        return true;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number::");
        int start=s.nextInt();
        System.out.println("enter the second number");
        int end=s.nextInt();
        System.out.println("list of prime number between ");
        for(int i=start;i<=end;i++){
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }


    }public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
