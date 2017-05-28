/*
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */
public class ExcelSheetColumnNumber_171 {
  public int titleToNumber(String s) {
    int result = 0;
    
    if(s.length()>0)
        for(int i=s.length()-1; i>-1; i--) {
            int exponent = s.length()-1 - i;
            
           int multiple = (int)s.charAt(i)-64;
           
           result += (int)Math.pow(26, exponent)*multiple;
           //System.out.println((result));
        }
    
    return result;
}
}
