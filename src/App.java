
/**
 * How to Use the Code Editor
Select the "Run Code" button to execute the program.
Select the "Calculate Grade" button to generate a score based on the completed tasks.
Continue to modify, run, and calculate your code until you are happy with the grade.
Select the "Submit" button to turn in the assignment to your instructor.

Scenario
In aviation, the aircraft's transponders transmit a code so that they can identify one another. This code uses the octal system.

The octal system uses the base-8 number system, with values made up of the digits 0 to 7. This is in contrast to the decimal system (which we are used to working with), which uses base-10 and digits 0 to 9. In base-10, each digit is a power of 10. For example, the number 125 is calculated as:

(5 × 100) + (2 × 101) + (1 × 102) = (5 × 1) + (2 × 10) + (1 × 100) = 5 + 20 + 100 = 125

In base-8, each digit is a power of 8. So, the octal number 125 would equate to the decimal value 85:

(5 × 80) + (2 × 81) + (1 × 82) = (5 × 1) + (2 × 8) + (1 × 64) = 5 + 16 + 64 = 85

In each case, we have worked backwards from the final character in the original number, multiplied the value of each character by an increasing power of the base, and then added the result to the running total.

Using this information, we have been asked to write a method to convert octal numbers into decimals.

Aim
Adapt the algorithm shown in Snippet 1.1, shown below, for a different scenario.

Prerequisites
Ensure that you have the following class open in your environment: OctalToDecimal.

You will find the following method that needs implementing:

public int convertToDecimal(String octal)
You can check your code against unit tests from the task pane and clicking "Run Checks" or selecting them individually.

public int convertToDecimal(String binary) {
 int conversion = 1;
 int result = 0;
 for (int i = 1; i <= binary.length(); i++) {
   if (binary.charAt(binary.length() - i) == '1')
     result += conversion;
   conversion *= 2;
 }
 return result;
}
Snippet 1.1

Steps for Completion
The algorithm shown in Snippet 1.1 can be adapted to work with octal numbers instead of binary.
Change the base from two to eight. This can be done by changing the conversion multiplier variable in Snippet 1.1.
Parse the digit being processed to convert it into an integer. This integer can then be multiplied to by the conversion variable or result of the power function.
 */
import java.util.*;

public class App {


    public int convertToDecimal(String octal) {

        
        int j = 8;
        int size = octal.length();
        for(int i = 0; i <= octal.length(); i++){
                i = octal.charAt(i);
                i * Math.pow(j, size);
                 
                 
                
                
                 
                
                
            }
        }
        return 999;
    }



    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
