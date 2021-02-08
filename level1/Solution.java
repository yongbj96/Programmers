package level1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        //solution();

    }

    /* //K번째 수
    *   int[] array = {1, 5, 2, 6, 3, 7, 4};
    *   int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    */
    /*public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] orderBy = new int[commands[i][1]-commands[i][0]+1];
            int count = 0;

            for(int j=commands[i][0]; j<=commands[i][1]; j++) {
                orderBy[count] = array[j-1];
                count++;
            }

            orderBy = Function.OrderBy(orderBy);
            answer[i] = orderBy[commands[i][2]-1];
        }
        
        return answer;
    }*/

    /* //자릿수 더하기
    *   Scanner scan = new Scanner(System.in);
    *   int n = scan.nextInt();
    */
    /*public static int solution(int n) {
        int answer = 0;
    
        String str = String.valueOf(n);
    
        for(int i=0; i<str.length(); i++) {
            answer = answer + Integer.parseInt(str.substring(i, i+1));
        }
    
        return answer;
    }*/
}