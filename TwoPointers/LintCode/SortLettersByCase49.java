public class Solution {
    public void sortLetters(char[] chars) {
        int i = 0, j = chars.length - 1;

        while (i <= j) {
            while (i <= j && Character.isLowerCase(chars[i])) {
                i++;
            }
            while (i <= j && Character.isUpperCase(chars[j])) {
                j--;
            }
            if (i <= j) {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }
    }
}