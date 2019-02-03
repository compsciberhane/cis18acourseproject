/*Implementation File*/
import java.util.Scanner;
import java.util.*;
import java.io.*;



class Master
{
    int input;
    String name;
    Scanner in;

    Master(){
        in = new Scanner(System.in);
    }
}

public class Main extends Master
{
    public static void main(String buffer[]) {
        Master obj = new Master();

        System.out.print("Enter your name: ");
        obj.name = obj.in.nextLine();
        System.out.println();

        System.out.println("Enter '1' to submit the amount of hours you worked ");
        System.out.println("Enter '2' to submit a message for the Branch Manager ");
        System.out.print("Enter '6' to Exit ");
        System.out.print(": ");
        obj.input = obj.in.nextInt();
        System.out.println();


        /*  selection '1'  */

        if (obj.input == 1) {
            System.out.println("Enter '1' if you worked 40 hours ");
            System.out.println("Enter '2' if you worked over 40 hours ");
            System.out.println("Enter '3' if you worked under 40 hours ");
            System.out.print(": ");
            obj.input = obj.in.nextInt();
            System.out.println();

            if (obj.input == 1) {
                System.out.println(obj.name + " you worked 40 hours this week.");
            }
            if (obj.input == 2) {
                while (obj.input == 2) {
                    System.out.print("Enter the number of hours you worked: ");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input <= 40) {
                        System.out.println("The number entered is invalid.");
                        obj.input = 2;
                    }

                }

                System.out.println(obj.name + " you worked " + obj.input + " hours this week.");
                System.out.println();
            }
            if (obj.input == 3) {
                while (obj.input == 3) {
                    System.out.print("Enter the number of hours you worked: ");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input >= 40) {
                        System.out.println("The number entered is invalid.");
                        obj.input = 3;
                    }

                }

                System.out.println(obj.name + " you worked " + obj.input + " hours this week.");
                System.out.println();
            }
        }

        /* end of selection */

        /**/


        /*  selection '2'  */

        if (obj.input == 2) {
            System.out.println("Select '1' if you are reporting a sick/vacation day ");
            System.out.print("Select '3' if you are submitting your 2 week notice: ");
            obj.input = obj.in.nextInt();
            System.out.println();

            if (obj.input == 1) {
                while (obj.input == 1) {
                    System.out.println("Enter '1' for Monday");
                    System.out.println("Enter '2' for Tuesday");
                    System.out.println("Enter '3' for Wednesday");
                    System.out.println("Enter '4' for Thursday");
                    System.out.println("Enter '5' for Friday");
                    System.out.println("Enter '6' for Saturday");
                    System.out.print("Enter '7' for Sunday: ");
                    obj.input = obj.in.nextInt();
                    System.out.println();

                    if (obj.input != 1 && obj.input != 2 && obj.input != 3 && obj.input != 4 && obj.input != 5 && obj.input != 6 && obj.input != 7) {
                        System.out.println("The day you entered is invalid.");
                        System.out.println();
                        obj.input = 1;
                    } else {
                        switch (obj.input) {
                            case 1:
                                System.out.println("The day you entered is Monday.  Your message has been logged.");
                                System.out.println();
                                obj.input = -1;
                                break;
                            case 2:
                                System.out.println("The day you entered is Tuesday.  Your message has been logged.");
                                System.out.println();
                                break;
                            case 3:
                                System.out.println("The day you entered is Wednesday.  Your message has been logged.");
                                System.out.println();
                                break;
                            case 4:
                                System.out.println("The day you entered is Thursday.  Your message has been logged.");
                                System.out.println();
                                break;
                            case 5:
                                System.out.println("The day you entered is Friday.  Your message has been logged.");
                                System.out.println();
                                break;
                            case 6:
                                System.out.println("The day you entered is Saturday.  Your message has been logged.");
                                System.out.println();
                                break;
                            case 7:
                                System.out.println("The day you entered is Sunday.  Your message has been logged.");
                                System.out.println();
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
            if (obj.input == 3) {
                System.out.println(obj.name + " your notice has been submitted.");

            }

            /* end of selection */

            /**/


            /* selection '6' */

            if (obj.input == 6) {
                System.out.println("Exit Selected.");
            }

            System.out.println();
            System.out.println("Program Exiting..");
            System.out.println("Program Terminated.");

        }

        /* end of file */
    }

}