package level1;

// 수박수박수박수?
public class lessons_12922 {
    /*
        int n = 8;
    */
    public static String solution(int n) {
        String answer = "";

        // 테스트 15 동작시간 - 2: 27.94ms, 4: 21.51ms, 6: 14.74ms, 8: 12.25ms, 10: 10.03ms
        for(int i=0; i<n/10; i++) answer=add(answer);
        if(n%10==9) answer+="수박수박수박수박수";
        if(n%10==8) answer+="수박수박수박수박";
        if(n%10==7) answer+="수박수박수박수";
        if(n%10==6) answer+="수박수박수박";
        if(n%10==5) answer+="수박수박수";
        if(n%10==4) answer+="수박수박";
        if(n%10==3) answer+="수박수";
        if(n%10==2) answer+="수박";
        if(n%10==1) answer+="수";
        
        return answer;
    }

    public static String add(String str) {
        return str+"수박수박수박수박수박";
    }
}
