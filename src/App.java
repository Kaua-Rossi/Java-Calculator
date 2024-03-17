// Calculator.
import java.util.Scanner; // Importing Scanner for the creation of the object.

public class App {
    public static void main(String[] args) throws Exception {
        double value1, value2; // Values for the calculation.
        byte operator; // The operator of the calculation
        Scanner myScanner = new Scanner(System.in); // Creating the Scanner Object.
        System.out.println("CALCULATOR");
        System.out.println("Type the first value: ");
        value1 = myScanner.nextDouble(); // Double input for the value1.
        System.out.println("Choose between\n1 = Addition\n2 = Subtraction\n3 = Multiplication\n4 = Division\n5 = Potentiation\n6 = Percentage\n7 = Square root");
        operator = myScanner.nextByte(); // String input for the operator.
        if (operator == 7) { // If the operator chosen was 7 (square root) then it does not need the second value.
            System.out.println("The square root of " + value1 + " is " + Math.sqrt(value1));
        } else { // So if the operator isn't a square root...
            System.out.println("Type the second value: ");
            value2 = myScanner.nextDouble(); // Double input for the value2
            myScanner.close(); // Closing scanner...
            switch(operator) { // Switch case to perform the calculation according to the operator.
                case 1:
                    System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
                    break;
                case 2:
                    System.out.println(value1 + " - " + value2 + " = " + (value1 - value2));
                    break;
                case 3:
                    System.out.println(value1 + " * " + value2 + " = " + (value1 * value2));
                    break;
                case 4:
                    if (value1 == 0 || value2 == 0) {
                        break;
                    } else {
                        System.out.println(value1 + " / " + value2 + " = " + (value1 / value2));
                        break;
                    }
                case 5:
                    System.out.println(value1 + "^" + value2 + " = " + (Math.pow(value1, value2)));
                    break;
                case 6:
                    System.out.println(value1 + "% of " + value2 + " = " + (value2 * (value1 / 100)));
                    break;
                default:
                    System.out.println("Error!"); // None of the previous operators were selected
            }
        }
    }
}
