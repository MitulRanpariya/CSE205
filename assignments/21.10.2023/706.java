class MyHashMap {
     int arr[];
     boolean mark[];

    public MyHashMap() {
        arr = new int[1000001];
        mark = new boolean[1000001];
    }
    
    public void put(int key, int value) {
        arr[key] = value;
        mark[key] = true;
    }
    
    public int get(int key) {
       if(mark[key])return arr[key];
       return -1;
    }
    
    public void remove(int key) {
        arr[key] =0;
        mark[key] = false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */