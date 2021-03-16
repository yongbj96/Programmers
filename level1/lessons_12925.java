package level1;

//문자열 정수로 바꾸기
public class lessons_12925 {
    /*
        String s = "-1234";
    */
    public static int solution(String s) {
        int number=0;
        boolean plus=true;

        for(int i=0; i<s.length(); i++) {
            if(i==0&&s.charAt(i)=='-') {
                plus=false;
                continue;
            } else {
                number+=(int)s.charAt(i)-48;
                if(!(i==s.length()-1)) number*=10;
            }
        }

        return plus?number:-1*number;
    }

    //패키지 사용
    /*public static int solution(String s) {
        return Integer.valueOf(s);
    }*/
}
