// find the largest common prefix of strings in a given array of strings

public class CommonPrefix {

    static String[] stringArray = {"Footballer", "Foot", "Football stadium", "Fries"};

    public static void main(String[] args) {
        System.out.println(findCommonPrefix(stringArray));
    }

    public static String findCommonPrefix(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();

        String currentLetter = null;
        compareStrings:
        //loops through every single character of the first string in the stringArray
        for (int i = 0; i < stringArray[0].length(); i++) {
            //loops through every string in the stringArray to look if the character in position i is the same for each string in the array
            for (int j = 0; j < stringArray.length; j++) {
                if (j == 0) {
                    currentLetter = stringArray[0].substring(i, i+1);
                } else {
                    // break in case a string in the array has no characters left over
                    if (stringArray[j].length() < i + 1) {
                        break compareStrings;
                    }
                    // break in case of a difference of characters between the strings at the position i
                    if (!(currentLetter.equals(stringArray[j].substring(i, i+1)))) {
                        break compareStrings;
                    }
                }
            }
            stringBuilder.append(currentLetter);
        }
        String commonPrefix = stringBuilder.toString();
        return commonPrefix;
    }
}
