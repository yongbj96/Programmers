package level1;

public class Function {
    public static int[] OrderBy(int[] number) {
        for(int j=0; j<number.length-1; j++)
        for(int i=0; i<number.length-1; i++) {
            if(number[i]>number[i+1]) { //오름차순
                int value = number[i];
                number[i] = number[i+1];
                number[i+1] = value;
            }
        }
        
        return number;
    }
}