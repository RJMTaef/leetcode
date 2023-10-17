class Solution {
    public String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int counter = 0;
        String newVowel = "";
        String newWord = "";
        
        
        for (int i = 0; i < s.length(); i++) { 
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o'
                || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] =='I' ||ch[i] == 'O'|| ch[i] == 'U') {
                newVowel += ch[i];
                counter++;
            } 
        }

        char[] ch2 = newVowel.toCharArray();

        for (int i = 0; i < s.length(); i++) { 
             if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o'
                || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] =='I' ||ch[i] == 'O'|| ch[i] == 'U' ) {
                newWord += ch2[counter - 1];
                counter--;

            } else {
                newWord += ch[i];

            }
        }
          return newWord;  

    }      
}