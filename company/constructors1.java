package com.company;

class Myemployeee
{
    private int id;
    private String s;

//    public Myemployeee()
//    {
//        id=45;
//        s="your name is here";
//    }

    public Myemployeee(String myname,int myid)
    {
        id=myid;
        s=myname;
    }


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

public class constructors1 {
    public static void main(String[] args) {
        Myemployeee e1=new Myemployeee("kunal",45);
        System.out.println(e1.getid());
        System.out.println(e1.getS());
    }
}
