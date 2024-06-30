//Write a program that defines whether two given strings are anagrams

public class Anagram {

    private static String str1 = "HHBDD";
    private static String str2 = "DDHHB";

    public static void main(String[] args) {
        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] charList1 = str1.toCharArray();
        char[] charList2 = str2.toCharArray();

        // If the length of the first string (charList1) differs from the length of the
        // second string (charList2), then the strings can't be anagrams
        if (charList1.length != charList2.length) {
            return false;
        }
        else {
            for (int i = 0; i < charList1.length; i++) {
                boolean charFound = false;
                for (int j = 0; j < charList2.length; j++) {
                    if (charList1[i] == charList2[j]) {
                        charFound = true;
                        charList2[j] = '_';
                        break;
                    }
                }
                // If the character in the current iteration of the first string (charList1) is not
                // found in the second string (charList2), then the strings can't be anagrams
                if (!charFound) {
                    return false;
                }
            }
            // If the program reaches this point, then all characters in the first string (charList1)
            // are found in the same amount in the second string (charList2), the 2 strings are anagrams
            return true;
        }


    }
}
