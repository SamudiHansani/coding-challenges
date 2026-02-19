import java.util.HashMap;

public class Test {
    private boolean hasTargetSumPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        boolean result = test.hasTargetSumPair(arr, target);
        System.out.println(result); // Output: true
    }
}