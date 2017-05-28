//Given an integer, write a function to determine if it is a power of two. 
public class PowerOfTwo_231 {
  public boolean isPowerOfTwo(int n) {
    
    if(n > 0)    
        return (n & (n-1)) == 0;
    else
        return false;
}
}
