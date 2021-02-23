package level1;

import java.util.ArrayList;
import java.util.Collections;

// 정수 내림차순으로 배치하기
public class lessons_12933 {
    /*
        long n = 118372;
    */
    public static long solution(long n) {
        String str = String.valueOf(n);
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0; i<str.length(); i++)
            num.add(Integer.parseInt(str.substring(i, i+1)));

        Collections.sort(num, Collections.reverseOrder());
        
        return Long.parseLong(num.toString().replace(", ", "").replace("[", "").replace("]", ""));
    }
}
