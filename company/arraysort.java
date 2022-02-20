package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class arraysort {
    public static void main(String[] args) {
//        int[]array=new int[]{90, 23, 5, 109, 12, 22, 67, 34};
//        Arrays.sort(array);
//        System.out.println("elements of array sorted in ascending order");
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }
        // an array derived from the array is known as subarray
        // to sort the subarray the arrays class provides the static method named
        //sort()
        //public static void sort(int[]a,int fromindex,int toindex)
        //toindex doesn't participate in sorting
//        int []a={12,34,4132,34,1,42};
//        Arrays.sort(a,2,4);
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }

        int n,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements");
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }

    }
}
