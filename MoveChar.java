public class MoveChar {
    public static void move(String str, int indx, int count, String newString) {
        if(indx == str.length()) {
            for(int i = 0; i < count; i++) {
                newString += 'a';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if(currChar == 'a') {
            count++;
            move(str, indx+1, count, newString);
        } else {
            newString += currChar;
            move(str, indx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aggads";
        move(str, 0, 0, "");
    }
}