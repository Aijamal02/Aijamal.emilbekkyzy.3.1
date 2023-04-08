public class Main {
    public static void main(String[] args) {
        double[] numbersA = {4.4, -3.7, 8.6, 7.1, -1.3, -4.8, -9.6, -2.2, 13.9, 17.1, 11.6, -10.8, 6.7, 18.3, -15.0};
        double sum = 0.0;
        int arrayLength = 0;
        boolean check = false;
        for (double i : numbersA) {
            if (i < 0) {
                check = true;
            } else if (i > 0 && check) {
                sum += i;
                arrayLength++;
            }
        }
        System.out.println(sum / arrayLength);

        {
            int[] sort = {6, -8, 5, -2, 9, 1};
            for (int i = 0; i < sort.length; i++) {
                int min = sort[i];
                int minId = i;
                for (int j = i + 1; j < sort.length; j++) {
                    if (sort[j] < min) {
                        min = sort[j];
                        minId = j;
                    }
                }
                int temp = sort[i];
                sort[i] = min;
                sort[minId] = temp;


                System.out.println(sort[i]);
            }
        }
    }
}
    