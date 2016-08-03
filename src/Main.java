/**
 * Created by andrewdmo on 8/3/16.
 */

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int x = 10;
        int b = (a * x);
        int c = (b * x);
        int d = (c * x);


        System.out.println("Hallo! a = " + a);
        System.out.println("...and b = a * x (" + b + ")");
        System.out.println("...and c = " + c);
        System.out.println("I bet you can guess what x (and d) is!");
        System.out.println("(d is " + d + "!)");

        System.out.println("And let's not forget to say:");

        String please = "Please ";
        String excuse = "Excuse ";
        String my = "My ";
        String dear = "Dear ";
        String aunt = "Aunt ";
        String sally = "Sally";

        System.out.println(please + excuse + my + dear + aunt + sally + "!");

    }
    /*    please

    void + System.out.println("!");
    void  {+ excuse + my + dear + aunt + sally};
    */
}