public class RemoveDuplicateChar {
    public static boolean[] map = new boolean[26];
    public static void removeDupcates(String str, int indx, String newString) {
        if(indx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if(map[currChar - 'a'] == true) {
            removeDupcates(str, indx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDupcates(str, indx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDupcates(str, 0, "");
    }
}