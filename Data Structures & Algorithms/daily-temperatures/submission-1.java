class Solution {
    static class Tuple {
        int num;
        int index;
        Tuple(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Tuple> stack = new ArrayDeque<>();
        int length = temperatures.length ;
        int[] result = new int[length];
        for(int i = length - 1; i >= 0; i--) {
            int curr = temperatures[i];
            
            while(!stack.isEmpty() && stack.peek().num <= curr) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                result[i] = 0; 
            } else {
                result[i] = stack.peek().index - i;
            }
            stack.push(new Tuple(curr, i));
        }
        return result;
    }
}
