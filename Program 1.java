import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        System.out.println("Division: "+ (num1/num2));


        }
    }
