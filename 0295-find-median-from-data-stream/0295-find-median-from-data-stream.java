class MedianFinder {
    PriorityQueue<Integer> minHeap , maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (size() == 0 || num >= minHeap.peek()) {
            minHeap.add(num);
        } else {
            maxHeap.add(-num);
        }
        
        if (maxHeap.size() == minHeap.size() + 2) {
            minHeap.add(-maxHeap.remove());
        } else if (maxHeap.size() + 2 == minHeap.size()) {
            maxHeap.add(-minHeap.remove());
        }       
    }
    
    public double findMedian() {
         if (maxHeap.size() == minHeap.size()) {
            return ((double) minHeap.peek() - (double) maxHeap.peek()) / 2;
        } else {
            if (maxHeap.size() > minHeap.size()) {
                return -maxHeap.peek();
            } else {
                return minHeap.peek();
            }
        }
    }
    
    private int size() {
        return maxHeap.size() + minHeap.size();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */