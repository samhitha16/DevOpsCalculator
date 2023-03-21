// package samhitha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
// import java.util.*;
public class Calculator{

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double squareRoot(double value1)
    {
        double ans  = Math.sqrt(value1);
        logger.info("SQUARE ROOT " + "Input:"+value1 + " - " + ans);
        return ans;
    }

    public static double Exponent(double value1, double value2)
    {
        double ans =  Math.pow(value1, value2);
        logger.info("EXPONENT " + "Input:"+value1 + "^" + value2 + " - " + ans);
        return ans;
    }

    public static double naturalLogarithm(double value1)
    {
        double ans = Math.log(value1);
        logger.info("NATURAL LOGARITHM " + "Input:"+value1 + " - " + ans);
        return ans;
    }

    public static double factorial(double value1) {
        if(value1 == 1) {
            return 1;
        }
        double ans = value1 * (factorial(value1-1));
        logger.info("FACTORIAL " + "Input:"+value1 + " - " + ans);
        return ans;
    }
}