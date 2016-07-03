public class MovingAverage {
    int[] array;
    int index;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        array = new int[size];
        index = 0;
    }
    
    public double next(int val) {
        for(int i = 0; i <= index; i++){
            int sum = 0;
            sum = sum +  array[index];
        }
        return (sum+array[++index])/(index+1);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */