package level1;

//문자열 내 p와 y의 개수
public class lessons_12916 {
    /*
        String s = "pPoooy";
    */
    public static boolean solution(String s) {
        s = s.toUpperCase();
        int count=0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='P') count++;
            else if(s.charAt(i)=='Y') count--;
        }

        return count==0;
    }

    //다른사람 풀이
    /*public static boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }*/
}