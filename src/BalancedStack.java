import java.util.Stack;

public class BalancedStack
{
    public static void main (String[] args) {
        System.out.println(checkBalanced("[{]}"));
    }

    private static boolean checkBalanced(String s)
    {
        Stack<Character> openParenthStack = new Stack<Character>();
        if(s.length() % 2 != 0)
        {
            return false;
        }

        else {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                    openParenthStack.push(s.charAt(i));
                }
                else {
                    char top = openParenthStack.pop();
                    if (top == '[' && s.charAt(i) != ']' || top == '{' && s.charAt(i) != '}' || top == '(' && s.charAt(i) != ')')
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
