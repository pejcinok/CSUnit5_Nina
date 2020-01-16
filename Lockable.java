public interface Lockable {
    public int setKey(int key);// establishes the key
    public void lock(int theLock);// locks the object
    public void unlock(int theLock);// unlocks the object
    public boolean locked();// returns true for locked false if unlocked


}
