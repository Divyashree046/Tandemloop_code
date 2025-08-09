/*Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}*/

package package1;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> result = countMultiples(input);
        System.out.println(result);
    }

    public static Map<Integer, Integer> countMultiples(int[] numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
       
        for (int i = 1; i <= 9; i++) {
            counts.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts.put(i, counts.get(i) + 1);
                }
            }
        }

        return counts;
    }
}