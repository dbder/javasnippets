package snippets.regex;

public class Zeros {


    /**
     * removes leading zeros unless it's the last character from a string.
     */
    public static String stripLeadingZeros(String string) {
        if (string == null) return null;
        return string.replaceAll("^0+(?!$)", "");
    }
}
