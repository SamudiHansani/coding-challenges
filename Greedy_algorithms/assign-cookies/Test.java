import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public int getMaxSatisfiedChildCount(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);

        int maxSatisfiedCount = 0;
        int j;

        for(int i=0; i<greed.length; i++) {
            for(j=0; j<cookie.length; j++) {
                if(greed[i] <= cookie[j]) {
                    maxSatisfiedCount++;
                    j++;
                    break;
                }
            }
        }

        return maxSatisfiedCount;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] greed = new int[] {3,1};
        int[] cookie = new int[] {3,1,2};
        int count = test.getMaxSatisfiedChildCount(greed, cookie);
        System.out.println(count);
    }
}