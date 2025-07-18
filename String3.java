package Assignment2;

public class String3 {
    public static void main(String[] args) {
        String s1 = "FAANGTech";
        String rev = "";

        System.out.println(s1.length()); // prints length of the string

        char[] ch = s1.toCharArray(); // converts string to char array
        for (int i = ch.length - 1; i >= 0; i--) {
            rev = rev + ch[i];
        }
        System.out.println(rev); // prints the reversed string
//        String s2="madam";
//        char c='a';
//        int firstOccurance=s2.;

    }
}
