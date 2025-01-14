import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Integer> maxActivities(int[] start, int[] finish) {
        List<Integer> selectedActivities = new ArrayList<>();
        selectedActivities.add(0);

        int selectedIndex = 0;

        for(int i=1; i<start.length; i++) {
            if(start[i] > finish[selectedIndex]) {
                selectedActivities.add(i);
                selectedIndex = i;
            }
        }
        return selectedActivities;
    }

    public static void main(String[] args) {
        int[] start = new int[] {1, 3, 0, 5, 8, 5};
        int[] finish = new int[] {2, 4, 6, 7, 9, 9};

        List<Integer> selectedActivities = maxActivities(start, finish);
        selectedActivities.stream().forEach(System.out::println);
        System.out.println("count:: " + selectedActivities.size());
    }
}