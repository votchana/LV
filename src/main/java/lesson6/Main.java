package lesson6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){

//        System.out.println(Calculator.calculate());
//
//        Calculator.calculate(12,67,Calculator.Type.ADD);
//        Calculator.calculate(356,67,Calculator.Type.SUBTRACT);
//        Calculator.calculate(2,6,null);
//        Calculator.calculate(9,3,Calculator.Type.DEVISE);

        double result = Calculator.calculate(2,3, Calculator.Type.MULTIPLY);
        logger.info("result from the logger: "+ result);

        result = Calculator.calculate(78,45, Calculator.Type.SUBTRACT);
        logger.info("result: "+ result);

        result = Calculator.calculate(8,45, null);
        logger.info("result: "+ result);

        System.out.println("This change is just for to be visible in git" + result);
        System.out.println("This change2 is just for to be visible in git" + result);


    }
}
