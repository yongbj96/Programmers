package level1;

import java.util.Arrays;

// commands [0~1]로 자른 후 commands[2]번째 수
public class lessons_42748 {
    /*
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    */
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] orderBy = new int[commands[i][1]-commands[i][0]+1];
            int count = 0;

            for(int j=commands[i][0]; j<=commands[i][1]; j++) {
                orderBy[count] = array[j-1];
                count++;
            }

            Arrays.sort(orderBy);
            answer[i] = orderBy[commands[i][2]-1];
        }
        
        return answer;
    }
}