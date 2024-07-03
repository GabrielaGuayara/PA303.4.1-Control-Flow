import java.util.Scanner;

public class GetAmountOfTaxes {

    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("Please enter your filling status: ");
        String fillingStatus = inp1.nextLine().toLowerCase().trim();


        Scanner inp2 = new Scanner(System.in);
        System.out.print("Please enter your filling status: ");
        double income = inp2.nextDouble();

        double taxes;

        switch (fillingStatus) {
            case "single": {
                if (income >= 0 && income <= 8350) {
                    taxes = income * 0.10;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 8351 && income <= 33950) {
                    taxes = income * 0.15;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 33951 && income <= 82250) {
                    taxes = income * 0.25;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 82251 && income <= 171550) {
                    taxes = income * 0.38;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 171551 && income <= 372950) {
                    taxes = income * 0.33;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 372951) {
                    taxes = income * 0.35;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                }

                break;
            }
            case "married filing jointly": {
                if (income >= 0 && income <= 16700) {
                    taxes = income * 0.10;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 16701 && income <= 67900) {
                    taxes = income * 0.15;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 67901 && income <= 137050) {
                    taxes = income * 0.25;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 137051 && income <= 208850) {
                    taxes = income * 0.38;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 208851 && income <= 372950) {
                    taxes = income * 0.33;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 372951) {
                    taxes = income * 0.35;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                }
                break;
            }
            case "married filing separately": {
                if (income >= 0 && income <= 8350) {
                    taxes = income * 0.10;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 8351 && income <= 33950) {
                    taxes = income * 0.15;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 33951 && income <= 68525) {
                    taxes = income * 0.25;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 68526 && income <= 104425) {
                    taxes = income * 0.38;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 104426 && income <= 186475) {
                    taxes = income * 0.33;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 186476) {
                    taxes = income * 0.35;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                }
                break;
            }

            case "head of household":{
                if (income >= 0 && income <= 11950) {
                    taxes = income * 0.10;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 11951 && income <= 45500) {
                    taxes = income * 0.15;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 45501 && income <= 117450) {
                    taxes = income * 0.25;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 117451 && income <= 190200) {
                    taxes = income * 0.38;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 190201 && income <= 371950) {
                    taxes = income * 0.33;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                } else if (income >= 371950) {
                    taxes = income * 0.35;
                    System.out.println("You will have to pay " + String.format("$%.2f", taxes) + " in taxes");
                }
                break;
            }
            default:
                System.out.println("Invalid entry. Please try again");
        }

    }
}


