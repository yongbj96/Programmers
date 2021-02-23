package level1;

import java.util.Set;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
public class lessons_68644 {
    /*
        int[] numbers = {2, 1, 3, 4, 1};
    */
    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for(int j=0; j<numbers.length-1; j++) {
            for(int i=j; i<numbers.length-1; i++) {
                set.add(numbers[j]+numbers[i+1]);
            }
        }

        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
