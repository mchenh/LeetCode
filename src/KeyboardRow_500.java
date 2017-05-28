/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below (NO IMAGE)
 * 
 * Example 1:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:

    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.

 */
public class KeyboardRow_500 {
  private static final String ROW1 = "asdfghjkl";
  private static final String ROW2 = "qwertyuiop";
  private static final String ROW3 = "zxcvbnm";
  
public String[] findWords(String[] words) {
    ArrayList<String> ans = new ArrayList<String>();
    for(int i=0; i<words.length; i++)
    {
        String temp = words[i];
        temp = temp.toLowerCase();
        char firstLetter = temp.charAt(0);
        //Determine if word is valid
        boolean check = true;
        if(ROW1.indexOf(firstLetter) != -1)
                for(int j=1; j<temp.length(); j++) {
                    char tempChar = temp.charAt(j);
                    if(ROW1.indexOf(tempChar) != -1)
                       continue;
                     else {
                         check = false;
                         break;
                     }
            }
        else if(ROW2.indexOf(firstLetter) != -1)
                for(int j=1; j<temp.length(); j++) {
                    char tempChar = temp.charAt(j);
                    if(ROW2.indexOf(tempChar) != -1)
                       continue;
                     else {
                         check = false;
                         break;
                     }
               } 
        else {
            for(int j=1; j<temp.length(); j++) {
                char tempChar = temp.charAt(j);
                if(ROW3.indexOf(tempChar) != -1)
                   continue;
                 else {
                     check = false;
                     break;
                 }
            } 
        }
        
        if(check == true)
        	ans.add(words[i]);
     }
    String[] ret = new String[ans.size()];
    ret = ans.toArray(ret);
    return ret;
  }
}
