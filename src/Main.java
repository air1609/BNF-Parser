import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        System.out.println("Expression Entered: ");
        System.out.println(expression);

        RecursiveDecentParser rdc = new RecursiveDecentParser();
        System.out.println( rdc.evaluateExpression(expression) );


    }



}
