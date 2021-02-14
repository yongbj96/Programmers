package level2;

import java.util.ArrayList;
import java.util.Comparator;

// 퀵 정렬, Comparator 알아보기
// 가장 큰 수
public class lessons_42746 {
    /*
        int[] numbers = {0, 5, 10, 15, 20};
        int[] numbers = {1000, 0, 5, 99, 100};
        int[] numbers = {0, 0, 0, 0, 0};
        int[] numbers = {21, 212};
    */
    /*public static String solution(int[] numbers) {
        String answer = "";
        int value = 0;
        for(int j=0; j<numbers.length; j++) {
            for(int i=numbers.length-1; i>=j+1; i--) {
                String A = String.valueOf(numbers[i]);
                String B = String.valueOf(numbers[i-1]);
                int count = 0;
                char a = A.charAt(0);
                char b = B.charAt(0);
                while(true) {
                    if(a>b) {
                        value = numbers[i];
                        numbers[i] = numbers[i-1];
                        numbers[i-1] = value;
                        break;
                    } else if(a==b) {
                        count++;
                    } else {
                        break;
                    }
                    if(count>=4) break;
                    if(B.length()<=count-A.length() || A.length()<=count-B.length()) break;
                    a = count>=A.length()?B.charAt(count-A.length()):A.charAt(count);
                    b = count>=B.length()?A.charAt(count-B.length()):B.charAt(count);
                }
            }
            if(numbers[0]==0) {
                answer = "0";
                break;
            } else {
                answer+=Integer.toString(numbers[j]);
            }
        }

        return answer;
    }*/

    //다른사람 풀이(이해완료)
    public static String solution(int[] numbers) {
        ArrayList<Integer> collect = new ArrayList<>();
        for (int number : numbers)
            collect.add(Integer.valueOf(number));

        Comparator<Integer> comparator = (o1, o2) -> {
            Integer s1s2 = Integer.valueOf(o1.toString() + o2.toString());
            Integer s2s1 = Integer.valueOf(o2.toString() + o1.toString());
            return (s1s2 > s2s1 ? 1 : (s1s2.equals(s2s1) ? 0 : -1));
        };
        
        collect.sort(comparator.reversed());
        String result = "";
        for(Integer s : collect)
            result += String.valueOf(s);

        return result.startsWith("0") ? "0" : result;
    }
}
