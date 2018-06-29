package Test;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Welcome enter something: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Random a = new Random();
        a.nextInt(10);


        if (line.contains("North")) {
            System.out.println("Display something" + a);
        }
    }

}
