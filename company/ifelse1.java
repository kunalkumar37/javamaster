package com.company;

public class ifelse1 {
    public static void main(String[] args) {
        int age=13;
        if(age>18)
        {
            System.out.println("yes boy u can drive now !!!");
        }
        else{
            System.out.println("no boy u cannot drive yet");
        }

        boolean a=true;
        boolean b=false;
        boolean c=true;
        if(a && b && c)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        System.out.println(!a);
    }
}
