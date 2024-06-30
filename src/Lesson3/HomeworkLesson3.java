package Lesson3;

public class HomeworkLesson3 {

    public static void main(String args[]) {
        /*
    Lazy evaluation
    1. When this code is executed, what are the values of a, b, c, d at the end?
        Does it print "1" to the console or not?
        int a = 100;
        int b = 101;
        boolean c = ++a >= b;
        int d = 102;
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }
        a = ?       answer = 100
        b = ?       answer = 102
        c = ?       answer = true
        d = ?       answer = 101
    2. Given the Strings below:
        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";
        What are the following expressions going to evaluate to (true/false)?
        a1.toUpperCase() == a2                          answer = false
        a1.equals(a2)                                   answer = false
        a1.equalsIgnoreCase(a2)                         answer = true
        a1 == a3.toLowerCase() + a4                     answer = false
        a1 == (a3 + a4).toLowerCase()                   answer = false
        a2 == a3.toUpperCase() + a4.toUpperCase()       answer = false
        a2.equals(a3 + a4)                              answer = false
        a1.equalsIgnoreCase(a3 + a4)                    answer = true
        a1.equals((a3+a4).toLowerCase())                answer = true
        a2.equals(a3.toUpperCase() + a4.toUpperCase())  answer = true
        */

        int a = 100;
        int b = 101;
        boolean c = ++a >= b;
        int d = 102;
        if (d-- <= b || ++b > --a) {
            System.out.println("1");
        }
        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
        System.out.println("The value of c is : " + c);
        System.out.println("The value of d is : " + d);

        String a1 = "abcd";
        String a2 = "ABCD";
        String a3 = "AB";
        String a4 = "cd";

        System.out.println(a1.toUpperCase() == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));
        System.out.println(a1 == a3.toLowerCase() + a4);
        System.out.println(a1 == (a3 + a4).toLowerCase());
        System.out.println(a2 == a3.toUpperCase() + a4.toUpperCase());
        System.out.println(a2.equals(a3 + a4));
        System.out.println(a1.equalsIgnoreCase(a3 + a4));
        System.out.println(a1.equals((a3+a4).toLowerCase()));
        System.out.println(a2.equals(a3.toUpperCase() + a4.toUpperCase()));



    }
}
