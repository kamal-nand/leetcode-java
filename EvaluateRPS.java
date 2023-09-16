import java.util.*;
public class EvaluateRPS {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            switch(tokens[i]){
                case "+" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "*" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-" :
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "/" :
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }
        return stack.pop();
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String[] str = new String[n];
            for(int i = 0; i < n; i++) {
                str[i] = sc.next();
            }
            int ans = evalRPN(str);
            System.out.println(ans);
        }
    }
}
