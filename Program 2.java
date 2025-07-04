import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String s= input.nextLine();
        System.out.println( "Uppercase: "+s.toUpperCase());
        System.out.println( "Length: "+s.length());
        System.out.println( "First character: "+s.charAt(0));



        }
    }
