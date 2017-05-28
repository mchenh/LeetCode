/*
 * 

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.

 */
public class FirstUniqueCharacterInAString_387 {
  public int firstUniqChar(String s) {
    
    if(s.length() == 1)
        return 0;
    else if(s.length() == 0)
        return -1;
    else {
        for(int i=0; i<s.length(); i++) {
            char check = s.charAt(i);
            
            if(s.indexOf(check) == i) {
                if(i == s.length()-1)
                    return i;
                if(i < s.length()-1 && s.indexOf(check,i+1)==-1)
                    return i;
                
            }
        }
        
        return -1;
    }
}
}
