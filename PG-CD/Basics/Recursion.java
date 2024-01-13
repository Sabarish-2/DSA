package Basics;
import java.util.Scanner;

class Recursion
{
    public static void print(int n)
    {
        if (n > 1) print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Add or Print? \n" + "1.ADD\n2.Print");
        if (scan.nextInt() == 1)
            System.out.println(add(scan.nextInt())); 
        else
            print(scan.nextInt()); 

        scan.close();
    }

    public static int add(int n) {
        if (n > 1)
            return n + add(n - 1);
        return 1;
    }
}