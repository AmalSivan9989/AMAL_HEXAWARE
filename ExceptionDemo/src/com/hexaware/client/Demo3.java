package com.hexaware.client;

public class Demo3 {
    public static void main(String[] args) {

        //null pointer exception
      /*  String str=null;
        String res=str.toLowerCase();
        System.out.println(res);

       */


        //array index out of bound exception
      //  int [] arr={5,10,25};
      //  System.out.println(arr[3]);


        // class cast exception

        Dog dog=new Dog();
        Object obj=dog;
        Cat cat=(Cat)obj;
    }
}
class Dog{

}
class Cat{

}
