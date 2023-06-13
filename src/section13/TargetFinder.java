package section13;

import java.util.HashSet;

public class TargetFinder {

    public static boolean findNumbers(int[] arr, int targetNumber) {
        HashSet<Integer> processedNumbers = new HashSet<>();

        for (var j : arr) {
            var requiredNumber = targetNumber - j;
            if (processedNumbers.contains(requiredNumber)) {
                return true;
            } else {
                processedNumbers.add(j);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(TargetFinder.findNumbers(new int[] {20,30,10, 20,50}, 40));
        System.out.println(TargetFinder.findNumbers(new int[] {20,30,10, 20,50}, 1));
    }
}
