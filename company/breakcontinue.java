package com.company;

public class breakcontinue {
    public static void main(String[] args) {
        //break and continue using loops
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//            System.out.println("java is great ");
//            if(i==2)
//            {
//                System.out.println("ending the loop");
//                break;
//            }
//        }
//        System.out.println("loop ends here");

        for(int i=0;i<5;i++)
        {

            if(i==2)
            {
                System.out.println("ending the loop");
                continue; //it will skip all the steps below and go to the next iteration
            }
            System.out.println(i);
            System.out.println("java is great ");
        }
        System.out.println("loop ends here");
    }
}
