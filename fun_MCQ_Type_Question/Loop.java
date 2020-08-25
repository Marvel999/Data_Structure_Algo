package fun_MCQ_Type_Question;

public class Loop {


    static class Base {
        public void Print()
        {
            System.out.println("Base");
        }
    }

    static class Derived extends Base {
        public void Print()
        {
            System.out.println("Derived");
        }
    }
    public static void main(String[] args){
//        for (; ; ){
////            System.out.println("ya");  // infinite Loop
////        }

//        for(;'a'<'i';){
//            System.out.println("ya");  // infinite Loop
//        }

//        for(int i=0; ; ){
//            System.out.println("ya");  // infinite Loop
//        }

//        int i=0;
//        for(; ; i++){
//            System.out.println(i);  // infinite Loop
//        }

//        if(true)
//            break;     //error
//


//Loop break
//1. break
//2. return

//skip
//1. continue

//        System.out.println('j' + 'a' + 'v' + 'a'); // print output addtion of ascii code of java

//        int $_ = 5;  // $ can be use as identifer name in java

//
//        int n=200;
//        Integer num1 = 100;
//        Integer num2 = 100;
//        Integer num3 = 500;
//        Integer num4 = 500;
//
//        if(num1==num2){
//            System.out.println("num1 == num2");
//        }
//        else{
//            System.out.println("num1 != num2");
//        }
//        if(num3 == num4){
//            System.out.println("num3 == num4");
//        }
//        else{
//            System.out.println("num3 != num4");
//        }

//        b)num1 == num2
//        num3 != num4
//        Reason: We always thought that whenever two object references are compared using “==”, it always evaluates to “false”. But here Integer caching changes the results.Integer class has a caching range of -128 to 127. Whenever a number is between this range and autoboxing is used, it assigns the same reference. That’s why for value 100, both num1 and num2 will have the sa/me reference, but for the value 500 (not in the range of -128 to 127), num3 and num4 will have different reference.


        // the line below this gives an output
        // \u000d System.out.println("comment executed");
        /** \u000d == \n**/


//        loop1:
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j = 0; j < 5; j++)
//            {
//                if (i == 3)        // loop nameing
//                    break loop1;
//                System.out.println("i = " + i + " j = " + j);
//            }
//        }


//        Base x = new Base();
//        Base y = new Derived(); // only call base implimated prop
//        Derived z = new Derived();
//        System.out.println(x.getClass());
//        System.out.println(y.getClass());
//        System.out.println(z.getClass());





    }
}
