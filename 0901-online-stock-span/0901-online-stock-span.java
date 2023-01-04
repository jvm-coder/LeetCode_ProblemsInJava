class StockSpanner {
    Stack <Integer> stprice;
    Stack <Integer> stspan;
    public StockSpanner() {
        stprice = new Stack();
        stspan = new Stack();
    }
    
    public int next(int price) {
        int span = 1;

        while (stprice.size()>0 && stprice.peek()<=price){
            span += stspan.pop();
            stprice.pop();
        }

        stprice.push(price);
        stspan.push(span);

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */