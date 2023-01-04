class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(String val : tokens) {
            int op1;
            switch(val) {
                case "+" : 
                    op1 = st.pop();
                    st.push(st.pop()+op1);
                    break;
                case "-" :
                    op1 = st.pop();
                    st.push(st.pop()-op1);
                    break;
                case "*" :
                    op1 = st.pop();
                    st.push(st.pop()*op1);
                    break;
                case "/" :
                    op1 = st.pop();
                    st.push(st.pop()/op1);
                    break;
                default :
                    st.push(Integer.parseInt(val));
            }
        }
        return st.pop();
    }
}