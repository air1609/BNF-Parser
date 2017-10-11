import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String expression = inputListener();
            RecursiveDecentParser rdc = new RecursiveDecentParser();
            System.out.println( "Result: " + rdc.evaluateExpression(expression) );
        } catch (Exception e) {
            System.out.println( "The expression you entered is not valid BNF" );
        }

    }

    public static String inputListener() {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println("Expression Entered: " + expression);
        return expression;
    }


}
