import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CarSearcher {
    //method that calculates a car monthly payment
    private int monthlyCarPayment(int carPrice) {
        return carPrice / 12;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //create scanner tool
        Scanner userInput = new Scanner(System.in);
        CarSearcher carSearcher = new CarSearcher();
        List<String> statementList = new ArrayList<String>();
        statementList.add("sedan: $4000, suv: $5000, truck: $6000, sport: $8000");
        statementList.add("choose a vehicle: sedan = 1, suv = 2, truck = 3, sport = 4");

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
        while (true) {
            Scanner enteredValue = new Scanner(System.in);
            Random random = new Random();
            carCode = random.nextInt(9000) + 1000;

            System.out.println("Enter this code :  " + carCode);
            userIn = enteredValue.nextInt();
            if (userIn != carCode) {
                System.out.println("Invalid car Code - please enter the car code");
                break;
            } else {
                System.out.println("You are logged in to your First Perfect car account");
                // intro
                JOptionPane.showMessageDialog(null, "Welcome to your First Perfect car");

                // user inputs
                System.out.println("enter your age");
                age = userInput.nextInt();
                if ((age >= 16) && (age < 19)) {
                    JOptionPane.showMessageDialog(null, "we recommend sedan,truck,suv");
                    System.out.println("enter price range");
                    price = userInput.nextInt();
                    if (price > 4000) {

                        System.out.println("Error! not enough to pay a car.");

                    } else if (price <= 4000) {






                        System.out.println("You will be able to pay the car.");
                        for (int index = 0; index < statementList.size(); index++) {
                            System.out.println(statementList.get(index));
                        }


                        vehicle = userInput.nextInt();
                        //# 5 declaring car method for different car prices
                        if (vehicle == 1) {
                            int sedanmonthly = carSearcher.monthlyCarPayment(4000);
                            System.out.println("Your monthly payment is  " + Integer.toString(sedanmonthly));

                        } else if (vehicle == 2) {
                            int suvmonthly = carSearcher.monthlyCarPayment(5000);
                            System.out.println("Your monthly payment is  " + Integer.toString(suvmonthly));

                        } else if (vehicle == 3) {
                            int truckmonthly = carSearcher.monthlyCarPayment(6000);
                            System.out.println("Your monthly payment is  " + Integer.toString(truckmonthly));
                        }else if (vehicle == 4) {
                            int sportmonthly = carSearcher.monthlyCarPayment(8000);
                            System.out.println("Your monthly payment is  " + Integer.toString(sportmonthly));

                        }
                    }
                } else if ((age >= 19) && (age < 80)) {

                    System.out.println("We recommend sport,sedan,truck,suv");
                    if (price > 4000) {

                        System.out.println("Error! not enough to pay a car.");

                    } else if (price <= 4000) {
                        System.out.println("You will be able to pay the car.");
                        for (int index = 0; index < statementList.size(); index++) {
                            System.out.println(statementList.get(index));
                        }




                        vehicle = userInput.nextInt();
                        if (vehicle == 1) {
                            int sedanmonthly = carSearcher.monthlyCarPayment(4000);
                            System.out.println("Your monthly payment is  " + Integer.toString(sedanmonthly));

                        } else if (vehicle == 2) {
                            int suvmonthly = carSearcher.monthlyCarPayment(5000);
                            System.out.println("Your monthly payment is  " + Integer.toString(suvmonthly));

                        } else if (vehicle == 3) {
                            int truckmonthly = carSearcher.monthlyCarPayment(6000);
                            System.out.println("Your monthly payment is  " + Integer.toString(truckmonthly));
                        }else if (vehicle == 4) {
                            int sportmonthly = carSearcher.monthlyCarPayment(8000);
                            System.out.println("Your monthly payment is  " + Integer.toString(sportmonthly));

                        }

                    }  else {
                        System.out.println("Invaild value");
                    }
                } else {
                    System.out.println("Your age is not recommended to drive");
                }


                System.out.println("enter type of car prefernece");
                //scan char data from keyboard
                car = userInput.next().charAt(0);


            }


        }
    }

}



