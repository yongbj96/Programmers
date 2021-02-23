package level1;

// 2016년
public class lessons_12901 {
    /*
        int a = 5, b = 24;
    */
    public static String solution(int a, int b) {
        int[] month = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int day = month[a-1]+b-1;
        
        return week[day%7];
    }
}
