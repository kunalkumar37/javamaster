package com.company;

import javax.print.Doc;

class Ekclass{
     int a;
     public int getA()
     {
         return a;
     }
     Ekclass(int v)
     {
         this.a=v;

     }
     public int returnone()
     {
         return 1;
     }
 }

 class Doclass extends Ekclass{
     Doclass(int c){
         super(c);
         System.out.println("i am a constructor");
     }
 }
public class thisandsuper {
    public static void main(String[] args)
    {
        Ekclass e=new Ekclass(78);
        Doclass d=new Doclass(45);
        System.out.println(e.getA());

    }
}
