import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.next();
        boolean ok = true;
        Stack<Character> stack = new ArrayStack<>(expression.length());
        for(int i = 0 ; i < expression.length() ; ++i){
            if(isOpening(expression.charAt(i))){
                stack.push(expression.charAt(i));
            }else{
                if(!stack.isEmpty() && isMatching(stack.top(), expression.charAt(i))){
                    stack.pop();
                }else{
                    ok = false;
                    break;
                }
            }
        }
        if(ok && stack.isEmpty()) System.out.println("Balanced");
        else System.out.println("Not Balanced");
    }

    public static boolean isOpening(char c){
        return c == '[' || c == '(' || c == '{' || c == '<';
    }

    public static boolean isMatching(char open, char close){
        return open == '[' && close == ']' ||
                open == '(' && close == ')' ||
                open == '{' && close == '}' ||
                open == '<' && close == '>';
    }
}