import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name:");
        String username = sc.nextLine();

        //Displaying Dates and time
        GregorianCalendar time = new GregorianCalendar();

        int hour = time.get(Calendar.HOUR_OF_DAY);

        if (hour < 12) {
            System.out.println("Good Morning!" + " " + username);
        } else if (hour < 17) {
            System.out.println("Good Afternoon" + " " + username);
        } else
            System.out.println("Good Evening" + username);


        System.out.println("Please Kindly Enter Your Age: ");
        int age = sc.nextInt();

        int randomNumber = (int) (Math.random() * (90 - 18) + 18);
        int difference;

        if (randomNumber > age) {
            difference = randomNumber - age;
            System.out.println("I am: " + " " + randomNumber + " " + "Years old which is" + " " + difference + " " + "Years older than you.");
        } else if (randomNumber < age) {
            difference = age - randomNumber;
            System.out.println("I am: " + " " + randomNumber + " " + "Years old, which is" + " " + difference + " " + "Years younger than you");
        }

        System.out.println("Twice my age would be" + " " + randomNumber * 2);
        if (randomNumber % 2 == 0)
            System.out.println("My age is an Even number");

        else
            System.out.println("My age is an Odd number");

    }


}

