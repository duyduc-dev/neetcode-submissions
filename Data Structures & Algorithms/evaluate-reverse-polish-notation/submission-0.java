class Solution {
    public int evalRPN(String[] tokens) {
           Stack<Integer> stack = new Stack<>();
        for(String token: tokens) {
            if(token.equals("/") || token.equals("+") || token.equals("-") || token.equals("*")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (token) {
                    case "/" -> stack.push(num2 / num1);
                    case "+" -> stack.push(num1 + num2);
                    case "-" -> stack.push(num2 - num1);
                    case "*" -> stack.push(num1 * num2);
                }
            } else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }

        return stack.pop();
    }
}
