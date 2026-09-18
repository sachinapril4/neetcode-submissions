class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : tokens) {
            boolean isNumber;
            int num = 0;
            try {
                num = Integer.parseInt(str);
                isNumber = true;
            } catch(Exception ex) {
                isNumber = false;
            }
            if(isNumber) {
                stack.push(num);
            } else {
                int sec = stack.pop();
                int first = stack.pop();
                if("+".equals(str)) {
                    stack.push(first + sec);
                } else if("-".equals(str)) {
                    stack.push(first - sec);
                } else if("*".equals(str)) {
                    stack.push(first * sec);
                } else if("/".equals(str)) {
                    stack.push(first / sec);
                }
            }
        }
        return stack.pop();
    }
}
