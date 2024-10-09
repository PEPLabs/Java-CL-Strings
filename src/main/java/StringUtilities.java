public class StringUtilities {

    /**
     * This method returns the concatenated value of its two string parameters.
     * 
     * Replace the `null` value with the appropriate expression.
     * 
     * @param a - the first part of the string to be combined.
     * @param b - the second part of the string to be combined.
     * @return the combination of strings a and b.
     */
    public String combine(String a, String b){
        return null;
    }

    /**
     * This method returns the length of a given String.
     * 
     * Using the String parameter's `length()` method, return the correct value.
     * 
     * @param s - the String to be manipulated.
     * @return - the length of the parameter `s`.
     */
    public int getStringLength(String s){
        return 0;
    }

    /**
     * This method returns the character at a specific position of the given String.
     * 
     * Using the String parameter's `charAt()` method, return the correct value.
     * 
     * @param s - the String to be manipulated.
     * @param n - an index of String `s`.
     * @return - the character of String `s` that is located at position `n`.
     */
    public char getCharacterAtIndex(String s, int n){
        return ' ';
    }

    /**
     * This method returns the first position of a character within a given String.
     * 
     * Using the String parameter's `indexOf()` method, return the correct value.
     * 
     * @param s - the String to be manipulated.
     * @param c - a character within `s`.
     * @return - the index of the first occurence of `c` within `s`.
     */
    public int getIndexGivenCharacter(String s, char c){
        return 0;
    }

    /**
     * This method returns a substring of a given string.
     * 
     * Using the String parameter's substring() method, return the correct value.
     * - Relevant part of Java's documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int,%20int) 
     * 
     * @param s - the string to be manipulated.
     * @param start - the index of the start of the substring, inclusive.
     * @param end - the index of the end of the substring, exclusive.
     * @return - a substring of the parameter `s`.
     */
    public String partOfString(String s, int start, int end){
        return null;
    }

    /**
     * This method returns an integer that represents whether a string is greater than, less than, or equal to another string. 
     * 
     * Using the String parameter's compareTo() method, return the correct value.
     * - Relevant part of Java's documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#compareTo(java.lang.String)
     * 
     * @param s1 - the first String to be compared.
     * @param s2 - the second String to be compared.
     * @return - a number greater than 0 if s1 > s2 lexigraphically, 
     *           a number less than 0 is s1 < s2 lexigraphically, 
     *           or 0 if s1 is equivalent to s2.
     */
    public int compareLexigraphically(String s1, String s2) {
        return 0;
    }

    /**
     * This method splits a string into an array of strings based off of a given expression.
     * 
     * Using the String parameter's split() method, return the correct value.
     * - Relevant part of Java's documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
     * - The split() method is most commonly used to split a text sentence into an array of words.
     * 
     * @param s1 - the string to be manipulated.
     * @param splitAround - the string that will be the text that s1 is split around.
     * @return - an array of Strings that represent s1 split by splitAround.
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround) {
        return null;
    }
}
