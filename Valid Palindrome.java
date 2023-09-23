class Solution {
    public boolean isPalindrome(String s) {
        int firstChar = 0;
        int lastChar = s.length() - 1;

        while (firstChar <= lastChar) {
            if (!Character.isLetterOrDigit(s.charAt(firstChar))) {
                firstChar++;
            } else if (!Character.isLetterOrDigit(s.charAt(lastChar))) {
                lastChar--;
            } else {
                if (Character.toLowerCase(s.charAt(firstChar)) != Character.toLowerCase(s.charAt(lastChar))) {
                    return false;
                }

                firstChar++;
                lastChar--;
            }
        }
        return true;

    }
}