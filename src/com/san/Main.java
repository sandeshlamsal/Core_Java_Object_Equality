package com.san;

import com.san.model.Employee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Program to check if two objects are equal");
        //== Ref comparison, .equals()= content comparison

        //Object is base class in java, so can assign String, int, null to it
        Object o1="emp1";
        //System.out.println(o1.hashCode());
        Object o2="emp2";
        //System.out.println(o2.hashCode());

        //System.out.println(o1.equals(o2)); //False
        //System.out.println(o1==o2); // true as null==null, reference type


        //String Pool, points to same location if string is same ,
        String s1="test";
        String s2="test";
        String s3="test1";

        //System.out.println(s1==s2); //true
        //System.out.println(s2==s3); //false,

        String s4=new String("test");
        String s5=new String ("test");


        //Compare Objects in Java
        Employee e1=new Employee(1,"Sandesh");
        Employee e2=new Employee(1,"Sandesh");

        //wihtout implementing EqualMethod
        System.out.println(e1.equals(e2)); //False

        //after implementing equals method in class Employee
        System.out.println(e1.equals(e2)); //TRUE


    }
}
