class DataStream {

    public final int value;
    public final int k;

    public int lastSeen;
    public int timesSeen;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }
    
    public boolean consec(int num) {
        if(lastSeen == num){
            timesSeen++;
        }
        else{
            timesSeen = 1;
            lastSeen = num;
        }
        return lastSeen == value && timesSeen >= k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
