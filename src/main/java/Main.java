import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Please enter your age:");
        Scanner inputScanner = new Scanner(System.in);
        int userAge = inputScanner.nextInt();
        if(userAge == 18){
            System.out.println("Congrats you are an adult!");
        }
        else if(userAge > 18){
            System.out.println("Are you older than me? I am 25!");
        }
        else if (userAge < 18 && userAge > 10){
            System.out.println("Youre basically a teenager I'm not sure yet");
        }
        else {
            System.out.println("Hey buddy how are you?");
        } ;

         
    }
}
