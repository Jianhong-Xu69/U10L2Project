import java.util.Locale;

public class FrontDoor {
    public static void main(String[] args) {
        int[] nums = {2,5,6};
        System.out.println(countEvens(nums, 2));
    }

    public static boolean isPalindrome(String check) {
        boolean b = check.toLowerCase().charAt(0) == check.toLowerCase().charAt(check.length() - 1);
        if (check.length() > 1){
            if (b){
                return isPalindrome(check.substring(1, check.length()-1));
            }
        }
        return b;
    }

    public static int countEvens(int[] array, int i) {
        if (i == 0){
            if (array[i] % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (array[i] % 2 == 0) {
            return 1 + countEvens(array, i - 1);
        } else {
            return countEvens(array, i - 1);
        }
    }
}
