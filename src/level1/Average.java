package level1;

class Average {
    public double average(int[] numbers) {
        double sum = 0;
        for(int num : numbers){

            sum += num;
        }
        double average = sum / numbers.length;
        return average;
    }
}