import java.util.Locale;

public class FrontDoor {
    public static void main(String[] args) {
        int[] nums = {10000000,5,6,7,8,1,1,2,5,4,3,2};
        System.out.println(findMaximum(nums, 9));
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

    public static int findMaximum(int[] array, int i) {
        if (i == array.length-1){
            return array[i];
        }
        int temp = findMaximum(array, i+1);
        if (temp >= array[i]){
            return temp;
        } else {
            return array[i];
        }
    }
}
