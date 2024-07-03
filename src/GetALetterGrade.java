import java.util.Scanner;

public class GetALetterGrade {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int userInput = inp.nextInt();

        if(userInput < 0 | userInput > 100){
            System.out.println("Score out of range");
        }else{
            if(userInput >= 90 && userInput <= 100){
                System.out.println("You got an A");}
            else if (userInput >=70 && userInput <= 89){
                System.out.println("You got an B");}
            else if (userInput >=70 && userInput <=79){
                System.out.println("You got an C");}
            else if (userInput >= 60 && userInput<=79){
                System.out.println("You got an D");}
            else {
                System.out.println("You got an F");
            }
        }

    }
}
