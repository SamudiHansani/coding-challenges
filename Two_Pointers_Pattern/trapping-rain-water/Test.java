public class Test {

    private int getTrappedAmount(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int trappedAmount = 0;

        while(left < right) {
            if(arr[left] < arr[right]) {
                if(arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    trappedAmount += leftMax - arr[left];
                }
                left++;
            } else {
                if(arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    trappedAmount += rightMax - arr[right];
                }
                right--;
            }
        }
        return trappedAmount;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        int result = test.getTrappedAmount(arr);
        System.out.println(result); // Output: 10
    }
    
}
