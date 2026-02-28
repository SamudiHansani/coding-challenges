public class Test {
    private int[] shiftZerosToEnd(int[] arr) {
        int slow = 0;

        for(int fast = 0; fast < arr.length; fast++) {
            if(arr[fast] != 0) {
                arr[slow++] = arr[fast];
            }
        }

        while (slow < arr.length) {
            arr[slow++] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] result = test.shiftZerosToEnd(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
