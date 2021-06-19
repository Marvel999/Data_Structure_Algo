package Stacks.PracticeStack;

public class JavaSample {


    public static class Car{
          Car(){
             System.out.println(this);
         }

         void print(){
         }
    }

    public static void main(String[] args) {
         int a=0;
        System.out.println(a);
        Car car=new Car();

    }
}
