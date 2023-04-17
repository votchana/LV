package lesson6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Calculator {

    public static final int MULTIPLY = 1;
    public static final int DEVISE = 2;
    public static final int SUBTRACT = 3;
    public static final int ADD = 4;

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public enum Type{
         MULTIPLY,
         DEVISE,
         SUBTRACT,
         ADD
    }


    public static Scanner scanner = new Scanner(System.in);

    public static double calculate(){

        double a;
        double b;
        int operand;
        double res=0;

        System.out.print(String.format("Enter any 1-st number "));
        a = Double.parseDouble(scanner.nextLine());

        System.out.print(String.format("Enter any 2-nd number "));
        b = Double.parseDouble(scanner.nextLine());

        System.out.print(String.format("Enter operand: MULTIPLY = 1, DEVISE = 2, SUBTRUCT = 3, ADD = 4 "));
        operand = (int) Double.parseDouble(scanner.nextLine());



        switch (operand){
            case MULTIPLY:
                res=a*b;
                break;
            case DEVISE:
                res=a/b;
                break;
            case SUBTRACT:
                res=a-b;
                break;
            case ADD:
                res=a+b;
                break;
          default: res=-1;
        }
        return res;

    }


    public static double calculate(double a, double b, Type t) {

        logger.info("Running this method");

        double res=0;

        try {

            switch (t) {
                case MULTIPLY:
                    res = a * b;
                    break;
                case DEVISE:
                    res = a / b;
                    break;
                case SUBTRACT:
                    res = a - b;
                    break;
                case ADD:
                    res = a + b;
                    break;
                default:
                    res = -1;
            }
        }
        catch (Exception err) {
            logger.error("Some error happened", err);
            System.out.println("Error thrown");
            throw err;
        }
//        finally {
//            System.out.println("This is the end of program");
//        }
        System.out.println("The result is: " + res);
        return res;


    }
}
