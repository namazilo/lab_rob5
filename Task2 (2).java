public class Task2 {
    public static void main(String[] args) {
        int array[] =new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        int sho[] = new int [20];
        for (int i = 0; i < sho.length; i++) {
            if (0 == array[i] % 2)
                sho[i]= array[i];
            else
                sho[i]=0;
            System.out.print(sho[i] + " ");

        }

    }
}
