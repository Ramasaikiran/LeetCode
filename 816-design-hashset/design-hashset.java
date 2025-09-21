class MyHashSet {
    private boolean buckets[];
    public MyHashSet() {
        buckets=new boolean[10000001];
    }
    
    public void add(int key) {
        buckets[key]=true;
    }
    
    public void remove(int key) {
        buckets[key]=false;
    }
    
    public boolean contains(int key) {
        return buckets[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */