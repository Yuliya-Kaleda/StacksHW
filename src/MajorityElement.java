import java.util.Arrays;

public class MajorityElement
{
    public static void main(String[] main) {
        int[] test = new int[] {1, 1};
        System.out.println(countMajorityElement(test));
    }

    private static boolean countMajorityElement(int[] array) {
        int currentMajority = 1; //1
        int result = 0; //1

        //3
        if (array.length < 2) {
            return false;
        }
        Arrays.sort(array); //O(N log N) loglinear function

        //N + 4N + 8N + 2
        for (int i = 0; i < array.length - 1; i++) {
            //4N
            if (array[i] == array[i+1]) {
                currentMajority++;
            }

            //8N + 2
            if (array[i] != array[i+1] || i == array.length - 2){ //6N
                if (currentMajority > result) { //2N
                    result = currentMajority; //1
                }
                currentMajority = 1; //1
            }
        }

        //3
        return (array.length / 2 < result);
        }

    // 2 + 3 + O(N log N) + N + 4N + 8N + 2 + 3
}
