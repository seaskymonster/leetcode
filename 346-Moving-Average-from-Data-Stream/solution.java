public class MovingAverage {
    double sum;
    private int maxSize;
    Queue<Integer> q;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        sum = 0;
        maxSize = size;
        q = new LinkedList<Integer>();
    }
    
    public double next(int val) {
        if (q.size() == maxSize) {
            sum -= q.remove();
        }
    
        sum += val;
        q.add(val);
        return sum / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */