/*
 *  Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

 */
public class RansomNote_383 {
  public boolean canConstruct(String ransomNote, String magazine) {
    for(int i=0; i<ransomNote.length(); i++) {
        Character compare = ransomNote.charAt(i);
        int location = magazine.indexOf(compare);
        if(location == -1)
            return false;
        else {
            magazine = magazine.replaceFirst(compare.toString(), "");
        }
    }
    
    return true;
}
}
