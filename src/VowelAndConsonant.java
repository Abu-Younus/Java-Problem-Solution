import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        str = str.toLowerCase();
        int vowel = 0, consonant = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowel++;
            } else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonant++;
            }
        }
        System.out.println("Total number of vowel is: " + vowel);
        System.out.println("Total number of consonant is: " + consonant);
    }
}
