class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[]ans=new int[arr.length];
        int N= arr.length;
        Stack<Integer>stk=new Stack<>();
        for (int i =N-1; i >=0; i--) { 
            while (!stk.isEmpty() && arr[stk.peek()]<=arr[i]){
                    stk.pop();
            }
            if(!stk.isEmpty())  {
                ans[i]=stk.peek()-i;
            }
            else{
                ans[i]=0;
            }
            stk.push(i);

        }
        return ans;
    }
}