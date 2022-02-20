package com.company;

public class vararrgs {
//    static int sum(int ...arr)
//    {
//        //it actually makes array
//        int result=0;
//        for(int a:arr)
//        {
//            result+=a;
//
//        }
//        return result;
//
//    }

    static int sum(int x,int ...arr)
    {
        //it actually makes array
        int result=x;
        for(int a:arr)
        {
            result+=a;

        }
        return result;

    }
    public static void main(String[] args) {

        System.out.println("the sum of 4,3,2,1=="+sum(1,2,3,4));
        System.out.println("the sum of 4,3,2,1=="+sum(1));
        System.out.println("the sum of 4,3,2,1=="+sum(1,2,3,4));



    }
}
