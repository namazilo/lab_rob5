public class Task5 {
    public static void main(String[] args) {

            int[] arr = new int[15];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 11);
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Кількість парних елементів: " + count);

    }
}
