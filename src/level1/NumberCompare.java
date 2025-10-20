package level1;

public class NumberCompare {
    public int compare(int num1, int num2) {
        int result = 0;
        if(num1 == num2){
            result = 1;
        } else if(num1 != num2){
            result = -1;
        };
        return result;
    }
}

