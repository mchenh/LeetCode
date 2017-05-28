/*
 * Given an integer, return its base 7 string representation.

Example 1:

Input: 100
Output: "202"

Example 2:

Input: -7
Output: "-10"

Note: The input will be in range of [-1e7, 1e7]. 
 */
public class Base7_504 {
  public String convertToBase7(int num) {
    if(num == 0)
        return "0";
        
    String result = "";
    boolean negative = false;
    if(num < 0) {
        negative = true;
        num = num*-1;
    }
    
    
    while(num != 0) {
        int mult;
        
        mult = num%7;
        num = num/7;
        
        result = mult+result;
    }
        
    if(negative)
        result = "-"+result;
        
    return result;
}
}
