/* 
This file is optional to edit and can be used for manual testing. 

Please be aware that manual testing does not affect the completion of your lab.
To ensure your lab is complete, you are required to run and pass the tests in the Testing tab.
*/

public class Main {

    
    static StringUtilities stringUtil = new StringUtilities();

    /**
     * The entry point of the application.
     * 
     * This method calls manual testing methods.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {

        combiningStringsTesting();

        simpleStringMethodsTesting();

        otherStringMethodsTesting();
    }

    /**
     * This method manually tests the StringUtilities' combine() method by calling it several times with varying arguments and printing out the results.
     * 
     */
    public static void combiningStringsTesting() {
        System.out.println("Here's what stringUtil.combine returns when provided values \"abc\" and \"xyz\":");
        String p1val1 = "abc";
        String p1val2 = "xyz";
        String output1 = stringUtil.combine(p1val1, p1val2);
        System.out.println(output1);

        System.out.println("Here's what stringUtil.combine returns when provided the value \"hello\" and \"world\":");
        String p2val1 = "hello";
        String p2val2 = "world";
        String output2 = stringUtil.combine(p2val1, p2val2);
        System.out.println(output2);
    }

    /**
     * This method manually tests the StringUtilities' getStringLength(), getCharacterAtIndex(), and getIndexGivenCharacter() methods by calling them and printing out the results.
     * 
     */
    public static void simpleStringMethodsTesting() {
        String str = "Revature";

        System.out.println("Given that the string value is '" + str  + "'...");
        System.out.println("The length of the string is " + stringUtil.getStringLength(str));
        System.out.println("The character at index 2 is " + stringUtil.getCharacterAtIndex(str, 2));
        System.out.println("Character 'a' is at the index " + stringUtil.getIndexGivenCharacter(str, 'a'));
    
    }

    /**
     * This method manually tests the StringUtilities' partOfString(), compareLexigraphically(), and splitStringIntoMultipleStrings() methods by calling them and printing out the results.
     * 
     */
    public static void otherStringMethodsTesting() {
        String str = "Revature";

        // Substrings
        System.out.println("\nSubstrings...");
        System.out.println("Given the string value '" + str + "'...");
        System.out.println(
                "The substring between index 2 (inclusive) and 5 (exclusive) should return 'vat', Actual output: "
                        + stringUtil.partOfString(str, 2, 5));

        // Comparisons
        System.out.println("\nComparisons...");
        System.out.println(
                "Comparing the string 'revature' to 'Revature', Expected Output: a positive number,  Actual output: "
                        + stringUtil.compareLexigraphically("revature", "Revature"));
        System.out.println(
                "Comparing the string 'Revature' to 'revature', Expected Output: a negative number,  Actual output: "
                        + stringUtil.compareLexigraphically("Revature", "revature"));
        System.out.println("Comparing the string 'Revature' to 'Revature', Expected Output: 0,  Actual output: "
                + stringUtil.compareLexigraphically(str, str));

        // Splitting string
        System.out.println("\nString splitting...");
        System.out.println(
                "Splitting all the words in the sentence 'Software Development Lifecycle'\n\nExpected Output: ");
        System.out.println("Software\nDevelopment\nLifecycle\n\nActual Output: ");

        String words[] = stringUtil.splitStringIntoMultipleStrings("Software Development Lifecycle", " ");
        if (words == null) {
            System.out.println("null");
        } else {
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}
