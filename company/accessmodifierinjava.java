package com.company;

class Myemployee
{
    private int id;
    private String s;

    public void setId(int n)
    {
        this.id=n;
    }
    public int getid()
    {
        return id;
    }
    public void sets(String s)
    {
        this.s=s;
    }
    public String getS()
    {
        return s;

    }
}
public class accessmodifierinjava {
    public static void main(String[] args) {
        Myemployee e1=new Myemployee();
//        e1.id=123;
//        e1.s="nwogn";  this is going to show error because it has
        //it is private we cannot access it

        e1.sets("kunal");
        e1.setId(789);
        System.out.println(e1.getid());
        System.out.println(e1.getS());
    }
}
