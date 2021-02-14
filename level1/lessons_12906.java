package level1;

// 같은 숫자 제거
public class lessons_12906 {
    /*
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
    */
    public static int[] solution(int[] arr) {
        int count = 1;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                continue;
            } else {
                arr[count] = arr[i+1];
                count++;
            }
        }
        int[] answer = new int[count];

        for(int i=0; i<count; i++)
            answer[i] = arr[i];

        return answer;
    }
}
