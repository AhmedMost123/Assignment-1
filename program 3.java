import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int age = input.nextInt();
        String nation=input.next();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible");
        }



        }
    }
