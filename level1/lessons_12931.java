package level1;

//자릿수 더하기
public class lessons_12931 {
    /*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    */
    public static int solution(int n) {
        int answer = 0;
    
        String str = String.valueOf(n);
    
        for(int i=0; i<str.length(); i++) {
            answer = answer + Integer.parseInt(str.substring(i, i+1));
        }
    
        return answer;
    }
}
