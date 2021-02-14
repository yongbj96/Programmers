package level1;

// 체육복
public class lessons_42862 {
    /*
        int n = 7;
        int[] lost = {1, 3, 5};
        int[] reserve = {2, 4, 6, 7};
    */
    public static int solution(int n, int[] lost, int[] reserve) {
        int result = 0;
        int[] student = new int[n];

        for(int i:reserve) {
            student[i-1] = 1;
        }

        for(int i:lost) {
            student[i-1]-=1;
        }

        for(int i=0; i<student.length; i++) {
            if(student[i]==1) {
                if(i!=0 && student[i-1]==-1) {
                    student[i-1] = 0;
                    student[i] = 0;
                } else if(i+1!=student.length && student[i+1]==-1) {
                    student[i] = 0;
                    student[i+1] = 0;
                }
            }
        }

        for(int i:student) {
            if(i!=-1) {
                result++;
            }
        }

        return result;
    }
}