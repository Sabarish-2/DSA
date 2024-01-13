package Basics;
import java.util.Scanner;

class Conversion {
    public static String toBinary(int decimal){
        int remainder;
        String  binary = "";

        while (decimal > 0) {
            remainder = decimal & 1;
            binary = remainder + binary;
            decimal >>>= 2;
        }
        return binary;
    }
    public static int toDecimal(int binary){
        int decimal = 0;
        int pow = 0;
        while (binary != 0) {
            if ((binary & 1) == 1) {
                decimal += Math.pow(2, pow);
            }
            pow++;
            binary /= 10;
        }
        
        return decimal;
    }
}

public class DecimalToBinaryAndFro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long startTime = System.nanoTime();
        System.out.println("Decimal To Binary");
        System.out.print("Decimal : ");
        System.out.println(Conversion.toBinary(scan.nextInt()));
        long endTime = System.nanoTime();
        
        System.out.println("Time Taken : " + (endTime - startTime));
        
        System.out.println("Binary To Decimal");
        System.out.println(Conversion.toDecimal(1000));
        
        scan.close();
    }    
}