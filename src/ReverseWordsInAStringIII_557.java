/*
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

 */
public class ReverseWordsInAStringIII_557 {
  public String reverseWords(String s) {
    char[] reverse = s.toCharArray();
    int n = reverse.length;
    int halfLength = n / 2;
    for (int i=0; i<halfLength; i++)
    {
        char temp = reverse[i];
        reverse[i] = reverse[n-1-i];
        reverse[n-1-i] = temp;
    }
    String reversed = new String(reverse);
    
    String result = "";
    int index1 = 0;
    int index2 = 0;
    String word = "";
    for(int i=0; i<reversed.length(); i++) {
        Character input = reversed.charAt(i);
        
        if(input.toString().equals(" ") ) {
            result = word + " " + result;
            word = "";
           // System.out.println("Result: " + result);
        }
        else if(i == reversed.length()-1) {
            word += input.toString(); 
            result = word + " " + result;
            word = "";
            //System.out.println("Result: " + result);
        } else
            word += input.toString(); 
    }
    
    //System.out.println(reversed);
    return result.trim();
}
}
