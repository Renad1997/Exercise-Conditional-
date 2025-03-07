import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    /*Exercise (Conditional)
1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser"
If the role is user print "welcome user" (tip:
use if else)*/
        System.out.println("Enter the Role:");
        String role = input.nextLine();
        if(role.equals("admin")){
            System.out.println("welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");
        } else if (role.equals("user")) {
            System.out.println("welcome user");
        }
        /* 2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output : The
greatest: 87 */
        System.out.println("Enter number1:");
        int number1 = input.nextInt();
        System.out.println("Enter number2:");
        int number2 = input.nextInt();
        System.out.println("Enter number3:");
        int number3 = input.nextInt();
        if(number1 >= number2 ){
            System.out.println(number1);
        } else if (number2 >= number3) {
            System.out.println(number2);
        } else if (number3 >= number1) {
            System.out.println("The greatest:" + number3);
        }
        /*3.Write a Java program that generates an integer between 1 and 7 and
displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday */
        System.out.println("number:");
        int value = input.nextInt();
        switch(value){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                    System.out.println("Monday");
                    break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                            case 5:
                                System.out.println("Thursday");
                                break;
                                case 6:
                                    System.out.println("Friday");
                                    break;
                                    case 7:
                                        System.out.println("Saturday");
                                        break;
        }
        /*4. Write a program that takes a numeric score as input and prints the
corresponding letter grade using the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Enter your numeric score: 85
Numeric Score: 85
Letter Grade: B*/
        System.out.println("Enter your numeric score:");
        int score = input.nextInt();
        if(score<=100 && score>=90) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: A");
        }else if (score<=89 && score>=80) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: B");
        }else if (score<=79 && score>=70) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: C");
        }else if (score<=69 && score>=60) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: D");
        }else if (score<=59 ) {
            System.out.println("Numeric Score:" +score);
            System.out.println("Letter Grade: F");
        }
        /*5. Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output:
Enter your age: 25
You are an Adult.*/
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age<13){
            System.out.println("Child");
        }else if (age>=13 && age<=19){
            System.out.println("Teenager");
        } else{
            System.out.println("You are an Adult.");
        }
    }
}