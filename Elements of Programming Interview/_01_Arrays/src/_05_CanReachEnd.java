

public class _05_CanReachEnd {

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 0, 2, 0, 1 };
        boolean result = canReach(arr);
        System.out.println(result);
    }

    private static boolean canReach(int[] arr) {

        int maxJump = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (maxJump < i) {
                return false;
            }
            maxJump = Math.max(maxJump, arr[i] + i);
        }

        return true;
    }

}
