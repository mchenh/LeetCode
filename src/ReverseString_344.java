/*
 * Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh". 
 */
public class ReverseString_344 {
  public String reverseString(String orig) {
    char[] s = orig.toCharArray();
    int n = s.length;
    int halfLength = n / 2;
    for (int i=0; i<halfLength; i++)
    {
        char temp = s[i];
        s[i] = s[n-1-i];
        s[n-1-i] = temp;
    }
    return new String(s);
}
}
