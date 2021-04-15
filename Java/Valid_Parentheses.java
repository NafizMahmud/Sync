import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Valid_Parentheses {
    Valid_Parentheses() {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([}}])"));
    };

    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

            Stack<Character> stack = new Stack<Character>();
        Map<Character,Character> parentheses = new HashMap<Character,Character>();
        parentheses.put(')', '(');
        parentheses.put('}', '{');
        parentheses.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() > 0 && stack.peek() == parentheses.get(c))
                    stack.pop();
                else {
                    return false;
                }
            }
        }
        return !(stack.size() > 0);
    }

    public static void main(String[] args) {
        Valid_Parentheses v = new Valid_Parentheses();
    }
}
