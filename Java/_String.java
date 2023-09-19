package Java;

public class _String {

    public static void main(String[] args) {
        // String literal
        String sl = "string_literal";
        System.out.println(sl); // string_literal
        String str = "Vatsal Golakiya Bajud";

        // using new keyword
        String sn = new String("String using new keyword");
        System.out.println(sn); // String using new keyword

        // byte to string
        byte[] b_arr = { 71, 101, 101, 107, 115 }; // Geeks
        String s_byte = new String(b_arr);
        System.out.println(s_byte); // Geeks

        // get string from byte array with start index and length of string
        String s_start_index_length = new String(b_arr, 1, 3);
        System.out.println(s_start_index_length); // eek

        // int length(): Returns the number of characters in the String.
        System.out.println(str.length()); // 21

        // Char charAt(int i): Returns the character at ith index
        System.out.println(str.charAt(3)); //s

        // String substring (int i): Return the substring from the ith index character
        // to end
        System.out.println(str.substring(3)); // sal Golakiya Bajud

        // substring(i,j) return the substring from i to j-1 index
        System.out.println(str.substring(3, 7)); //sal

        // String concat( String str): Concatenates specified string to the end of this
        // string.
        String s1 = "Vatsal";
        String s2 = "Golakiya";
        System.out.println(s1.concat(s2)); // VatsalGolakiya

        // int indexOf (String s): Returns the index within the string of the first
        // occurrence of the specified string.
        System.out.println(str.indexOf("Golakiya")); // 7

        // int indexOf (String s, int i): Returns the index within the string of the
        // first occurrence of the specified string, starting at the specified index.
        System.out.println(str.indexOf("kiya", 3)); // 11

        // Int lastIndexOf( String s): Returns the index within the string of the last
        // occurrence of the specified string.
        System.out.println(str.lastIndexOf("a")); // 17

        // boolean equals( Object otherObj): Compares this string to the specified
        // object.
        System.out.println("Vatsal".equals("Vatsal")); // true
        System.out.println("Vatsal".equals("vatsal")); // false

        // boolean equalsIgnoreCase (String anotherString): Compares string to another
        // string, ignoring case considerations.
        System.out.println("Vatsal".equalsIgnoreCase("Vatsal")); // true
        System.out.println("Vatsal".equalsIgnoreCase("vatsal")); // true

        // int compareTo( String anotherString): Compares two string lexicographically.
        System.out.println(s1.compareTo(s2)); // 15 // where s1 and s2 are strings to be compared
        // This returns difference s1-s2. If :
        // out < 0 // s1 comes before s2
        // out = 0 // s1 and s2 are equal.
        // out > 0 // s1 comes after s2.

        // same as above but with ignore case considerations
        System.out.println(s1.compareToIgnoreCase(s2)); // 15

        // String toLowerCase(): Converts all the characters in the String to lower
        // case.
        System.out.println(str.toLowerCase()); // vatsal golakiya bajud

        // String toUpperCase(): Converts all the characters in the String to upper
        // case.
        System.out.println(str.toUpperCase()); // VATSAL GOLAKIYA BAJUD

        // String trim(): Returns the copy of the String, by removing whitespaces at
        // both ends. It does not affect whitespaces in the middle.
        System.out.println(str.trim()); // Vatsal Golakiya Bajud

        // String replace (char oldChar, char newChar): Returns new string by replacing
        // all occurrences of oldChar with newChar.
        System.out.println(str.replace('a', 'e')); // Vetsel Golekiye Bejud
    }
}
