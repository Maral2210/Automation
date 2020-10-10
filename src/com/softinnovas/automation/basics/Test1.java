package com.softinnovas.automation.basics;

public class Test1 {
    public void message(){
        System.out.println("I am here");
    }

    public Test1 add(){
        int x=2;
        int y =3;
        System.out.println("addition"+(x+y));
        return this;
    }
    public Test1 multiply(){
        int x=2;
        int y =3;
        int z= x*y;
        System.out.println("addition"+z+"/n");
        return this;
    }
    public Test2 returnTest2fromTest1(){
        Test2 test2=new Test2();
        return test2;
    }

    public static void main(String[] args) {

    }

}


