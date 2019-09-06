import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int grade;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("give me a number between 1and100");
        grade = keyboard.nextInt();

        if (grade>=97 && grade<=100){
            System.out.println("A+");
        }
        else if (grade>=94 && grade<=96){
            System.out.println("A");
        }


    }
}
