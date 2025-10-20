package level1;

public class ForAverage {
    public double solution(int[] arr) {
        double sum = 0;
        for(int num : arr){
            sum += num;
        }

        double result = 0;
        result = sum / arr.length;
        return result;
    }

}
