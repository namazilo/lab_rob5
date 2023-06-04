public class Task4 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        int[] sumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            firstArray[i] = (int) (Math.random() * 11);
            System.out.print(firstArray[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            secondArray[i] = (int) (Math.random() * 11);
            System.out.print(secondArray[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
            System.out.print(sumArray[i] + " ");

        }
    }
}
