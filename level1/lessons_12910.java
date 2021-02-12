package level1;

import java.util.Arrays;

public class lessons_12910 {
    /*
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
    */
    public static int[] solution(int[] arr, int divisor) {
        int count=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                arr[count] = arr[i];
                count++;
            }
        }

        if(count==0) return new int[] {-1};
        int[] answer = new int[count];

        for(int i=0; i<count; i++) answer[i] = arr[i];

        Function.OrderBy(answer);
        
        return answer;
    }

    //다른사람 풀이
    /*public static int[] solution(int[] arr, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
    }*/
}