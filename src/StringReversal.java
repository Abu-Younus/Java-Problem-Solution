public class StringReversal {
    public static void main(String[] args) {
        String str = "Apple", revStr = "";
        char ch;
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("Orginal string is: " + str);
        System.out.println("Reverse string is: " + revStr);
    }
}
