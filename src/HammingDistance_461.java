/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ¡Ü x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ¡ü   ¡ü

The above arrows point to positions where the corresponding bits are different.


 */
public class HammingDistance_461 {
  public int hammingDistance(int x, int y) {
    int count = 0;
    int a=0,b=0;
    
    while(true) {
        if(x == 0 && y ==0)
            break;
        a = x%2;
        b = y%2;
        x = x/2;
        y = y/2;
        if(a != b)
        count++;
    }
    return count;
}
}
