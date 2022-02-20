package com.company;

class Employee1
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name=n;
    }


}

class Cellphone
{
    public void ring()
    {
        System.out.println("ringing......");

    }

    public void vibrate()
    {
        System.out.println("vibrating.....");
    }

    public void call()
    {
        System.out.println("calling rahul");
    }


}

class Square
{
    int side;
    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }
}


class Tommy
{
    public void hitting()
    {
        System.out.println("hitting...");
    }
    public void running()
    {
        System.out.println("tommy is running");
    }


}

public class practiceoops {

    public static void main(String[] args) {
//        Employee1 e=new Employee1();
//        e.setName("kunal");
//        e.salary=233;
//        System.out.println(e.getSalary());
//        System.out.println(e.getName());
//
//        Cellphone c1=new Cellphone();
//        c1.ring();
//        c1.vibrate();
//        c1.call();

//

        Tommy t=new Tommy();
        t.hitting();
        t.running();

    }
}
