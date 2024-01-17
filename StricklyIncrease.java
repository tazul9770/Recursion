public class StricklyIncrease {
    public static boolean isSorted(int[] ara, int indx) {
        if(indx == ara.length-1) {
            return true;
        }
        if(ara[indx] < ara[indx+1]) {
            return isSorted(ara, indx+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int ara[] = {6, 9, 99, 23};
        System.out.println(isSorted(ara, 0));
    }
}