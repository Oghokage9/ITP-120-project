import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class CarSearcher {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //create scanner tool
        Scanner userInput = new Scanner(System.in);

        //declare variables
        int flagNum = 0;
        int age = 0;
        int price = 0;
        char sedan = 'S';
        char truck = 'T';
        char suv = 'V';
        char sport = 'O';
        char car = 'C';
        int userIn = 0;
        int carCode = 0;
        int vehicle = 0;
        boolean flag = true;

        int carLoan = 1000;

        int loanLength = 3;

        int interestRate = 5;

        int downPayment = 2000;

        //#1 compound condition
        //# 2 while loop
        while(true) {
            Scanner enteredValue = new Scanner(System.in);
            Random random = new Random();
            carCode = random.nextInt(9000) + 1000;

            System.out.println("Enter this code :  " + carCode);
            userIn = enteredValue.nextInt();
            if (userIn != carCode) {
                System.out.println("Invalid car Code - please enter the car code");
                 break;
            }else {
                System.out.println("You are logged in to your First Perfect car account");
            }

            // introduction
            JOptionPane.showMessageDialog(null, "Welcome to your First Perfect car");

            // user inputs
            System.out.println("enter your age");
            age = userInput.nextInt();


            System.out.println("enter type of car prefernece");
            //scan char data from keyboard
            car = userInput.next().charAt(0);
            //  if/else if/ else
            if (age >= 16 && age > 19) {
                JOptionPane.showMessageDialog(null, "we recommend sedan,truck,suv");
                System.out.println("enter price range");
                price = userInput.nextInt();
            } else if (age <= 19 && age >= 80) {

                JOptionPane.showMessageDialog(null, "We recommend sport,sedan,truck,suv");
            } else {
                System.out.println("Your age is not recommended to drive");
            }


            if (price > 4000) {

                System.out.println("Error! not enough to pay a car.");

            } else if (price <= 4000) {

                System.out.println("You will be able to pay the car.");
                System.out.println("sedan: $4000, suv: $5000, truck: $6000, sport: $8000");
                System.out.println("choose a vehicle: sedan = 1, suv = 2, truck = 3, sport = 4");
                vehicle = userInput.nextInt();
                if (vehicle == 1) {

                } else if (vehicle == 2) {

                } else if (vehicle == 3) {

                } else if (vehicle == 4) {

                } else {
                    System.out.println("Invaild value");
                }


            } else {

                int remainingBalance = carLoan - downPayment;

                int months = loanLength * 12;

                int monthlyBalance = remainingBalance / months;

                int interest = monthlyBalance * interestRate / 100;

                int monthlyPayment = monthlyBalance + interest;

                System.out.println(monthlyPayment);

                //  create random object tool
                Random rand = new Random();

                flagNum = rand.nextInt(5) + 1;
                //simple if/else structure
                if (flagNum == 1) {
                    JOptionPane.showMessageDialog(null, "You will have a red car");
                } else if (flagNum == 2) {
                    JOptionPane.showMessageDialog(null, "You will have a blue car");
                } else if (flagNum == 3) {
                    JOptionPane.showMessageDialog(null, "You will have a white car");
                } else if (flagNum == 4) {
                    JOptionPane.showMessageDialog(null, "you will have a black car");
                } else {
                    JOptionPane.showMessageDialog(null, "you will have a grey car");
                }


            }
        }

    }

}
