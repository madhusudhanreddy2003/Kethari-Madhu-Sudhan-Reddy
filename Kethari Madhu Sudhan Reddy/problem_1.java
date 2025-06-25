import java.util.Scanner;

public class problem_1{
    double a, b;
    String operation;
    problem_1(double a, double b, String operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    void calculate(){
        switch (operation){
            case "Addition":
                System.out.println("Result: " + (a + b));
                break;
            case "Subtraction":
                System.out.println("Result: " + (a - b));
                break;
            case "Multiplication":
                System.out.println("Result: " + (a * b));
                break;
            case "Division":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double a = sc.nextDouble();

        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        sc.nextLine(); 
        System.out.print("Enter operation :\n Addition\t Subtraction\t Multiplication\t Division\n");
        String op = sc.nextLine();

        problem_1 calc = new problem_1(a, b, op);
        calc.calculate();
    }
}
