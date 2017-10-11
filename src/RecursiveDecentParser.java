public class RecursiveDecentParser {


    public RecursiveDecentParser() {}

    public int evaluateExpression(String expression) {
        char[] expArr = expression.toCharArray();
        Queue<String> expQueue = new Queue<>();

        for(char value : expArr) {
            expQueue.enqueue(String.valueOf(value));
        }

        return parseExpression(expQueue);
    }


    /*
        <expression>  ::=  <term> + <expression>  |  <term> - <expression>  |  <term>
     */
    private int parseExpression(Queue<String> exp) {
        int value = parseTerm(exp);
        while (exp.peek().equals("+") || exp.peek().equals("-")) {
            String op = exp.dequeue().getData().toString();
            if (op.equals("+")) {
                value = value + parseTerm(exp);
            } else {
                value = value - parseTerm(exp);
            }
        }
        return value;
    }

    /*
        <term>  ::=  <factor> * <term>  |  <factor> / <term>  |  <factor>
     */
    private int parseTerm(Queue<String> exp) {
        int value = parseFactor(exp);
        while (exp.peek().equals("*") || exp.peek().equals("/")) {
            String next = exp.dequeue().getData().toString();
            if (next.equals("*")) {
                value = value * parseFactor(exp);
            } else {
                value = value / parseFactor(exp);
            }
        }
        return value;
    }

    /*
        <factor>  ::=  <digit>  |  (  <expression>  )
        <digit>  ::=   0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
     */
    private int parseFactor(Queue<String> exp) {
        int value;
        if(exp.peek().equals("(")) {
            exp.dequeue().getData().toString();
            value = parseExpression(exp);
            exp.dequeue().getData().toString();
        } else {
            String number = exp.dequeue().getData().toString();
            value = Integer.parseInt(number);
        }
        return value;
    }

}
