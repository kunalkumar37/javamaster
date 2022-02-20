package com.company;
import java.util.Scanner;
//public class reversenumber {
//
//    public static void reversenumber(int number){
//        if(number<10)
//        {
//            System.out.println(number);
//            return;
//        }
//
//        else{
//            System.out.println(number%10);
//            reversenumber(number/10);
//
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("enter the number that you want to reverse");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println("the reverse of the given number is ");
//        reversenumber(num);
//    }
//}
public class reversenumber{
    public static void main(String args[])
    {
        System.out.println("enter the number you want to reverse:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse_number=reversenumber(n);
        System.out.println("the reverse number is "+reverse_number);
    }

    //method to reverse a number
    public static int reversenumber(int number)
    {
        boolean isnonegative=number<0?true:false;
        if(isnonegative)
        {
            number=number* -1;

        }
        int reverse=0;
        int lastdigit=0;
        while(number>=1)
        {
            lastdigit=number%10;
            reverse=reverse*10+lastdigit;
            number=number/10;
        }
        return isnonegative==true?reverse*-1:reverse;
    }
}
