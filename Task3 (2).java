public class Task3 {
    public static void main(String[] args) {
        int array[] =new int[5];
        int arr[] =new int[5];
        int pizza[] =new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 6);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random() * 6);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            pizza[i] = (int) (Math.random() * 6);
            System.out.print(pizza[i] + " ");
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }
        int sum2 = 0;
        for(int i = 0; i < pizza.length; i++) {
            sum2 += pizza[i];
        }
        System.out.println(" ");
        double avg = (double) sum / array.length;
        double avg1 = (double) sum1 / arr.length;
        double avg2 = (double) sum2 / pizza.length;
        if (avg > avg2 && avg > avg2) {
            System.out.println("Середнье арифметичне масива 1 більше");
        } else if (avg1 > avg && avg1 > avg2) {
            System.out.println("Середнье арифметичне масива 2 більше");
        } else if (avg2 > avg && avg2 >avg1) {
            System.out.println("Середнье арифметичне масива 3 більше");
        } else {
            System.out.println("Середнье арифметичне одинакове");
        }
    }
}
