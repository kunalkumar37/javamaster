package com.company;
import java.util.Scanner;
public class prefectsquareornot {
    static boolean checkperfectsquare(double number){
        double sqrt=Math.sqrt(number);
        return ((sqrt-Math.floor(sqrt))==0);
    }
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        double number=sc.nextDouble();
        if(checkperfectsquare(number)){
            System.out.println("yes the given number is perfect swaure");

        }
        else{
            System.out.println("no the given number is not perfect square");
        }

    }
}
