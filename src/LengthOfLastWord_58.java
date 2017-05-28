/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,
Given s = "Hello World",
return 5. 
 */
public class LengthOfLastWord_58 {
  public int lengthOfLastWord(String s) {
    if(s.length() == 0)
        return 0;
    else if(s.length() == 1) {
        if(s.charAt(0) == ' ')
            return 0;
        
        return 1;
    }
    else {
        int count = 0;
        char[] lastword = s.toCharArray();
        
         boolean space = false;
        for(int i=0; i<lastword.length; i++) {
            if(lastword[i] == ' ')
                space = true;
            
            if(lastword[i] != ' ' && space == true) {
                count=0;
                space=false;
            }
            
            if(lastword[i] != ' ' && space == false)
                count++;
                
            System.out.println(count);
        }
        
        return count;
    }
}
}
