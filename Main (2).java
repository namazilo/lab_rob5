// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int t[] = new int[50];
        for (int i = 1, j=0; i <= 99;i=i+2, j++) {
            t[j]=i;
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }

    }
}