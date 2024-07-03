import java.util.Scanner;

public class PrintDayOfTheWeek {

    public static void main(String[] args){
        System.out.print("Please enter a number between 1 and 7: ");
        Scanner inp = new Scanner(System.in);

        String userInp = inp.nextLine();

        switch(userInp){
            case "1": {
                System.out.println("It is Monday");
                break;
            }
            case "2": {
                System.out.println("It is Tuesday");
                break;
            }
            case "3":{
                System.out.println("It is Wednesday");
                break;
            }
            case "4":{
                System.out.println("It is Thursday");
                break;
            }
            case "5":{
                System.out.println("It is Friday");
                break;
            }
            case "6":{
                System.out.println("It is Saturday");
                break;
            }
            case "7":{
                System.out.println("It is Sunday");
                break;
            }
            default:
                System.out.println("Out of range");
        }

    }
}
