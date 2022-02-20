package com.company;

public class arr3 {
    public static void main(String[] args) {
//        int [] arr=new int[]{1,2,8,3,2,2,2,2,4,1};
//        int [] fr=new int[arr.length];
//        int visited=-1;
//        for(int i=0;i<arr.length;i++)
//        {
//            int count=1;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    count++;
//                    fr[j]=visited;
//                }
//            }
//            if(fr[i]!=visited)
//            {
//                fr[i]=count;
//            }
//        }

        int []arr=new int[]{1,2,3,4,5};
        int n=3;
        System.out.println("original array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        //rotate the given array by n times toward left
        for(int i=0;i<n;i++)
        {
            int j,first;
            first=arr[0];
            for( j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];

            }
            arr[j]=first;

        }
        System.out.println();
        System.out.println("array after left rotation");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
