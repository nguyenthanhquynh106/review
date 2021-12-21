package string_stringbuffer_stringbuilder;

public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s1 == s1); //true
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3); //true
        System.out.println(s1 == s4); //false
        System.out.println(s4 == s5); //false

        System.out.println(s1.equals(s3)); //true (cùng nội dung)
        System.out.println(s1.equals(s4)); //true (cùng nội dung)
        System.out.println(s4.equals(s5)); //true (cùng nội dung)

        String targetString = "Java is fun to learn";
        String str1 = "JAVA";
        String str2 = "Java";
        String str3 = "  Hello Java  ";

        System.out.println("Char at index 2 (third position): " + targetString.charAt(2));
        System.out.println("After Concat: " + targetString.concat(". Really?"));
        System.out.println("Checking equals ignoring case: " + str2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " + str2.equals(s1));
        System.out.println("Checking Length: " + targetString.length());
        System.out.println("Replace function: " + targetString.replace("fun", "easy"));
        System.out.println("SubString of targetString: " + targetString.substring(8));
        System.out.println("SubString of targetString: " + targetString.substring(8, 12));
        System.out.println("Converting to lower case: " + targetString.toLowerCase());
        System.out.println("Converting to upper case: " + targetString.toUpperCase());
        System.out.println("Trimming string: " + str3.trim());
        System.out.println("searching s1 in targetString: " + targetString.contains(str1));
        System.out.println("searching s2 in targetString: " + targetString.contains(str2));

        char[] charArray = str2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);
    }
}
