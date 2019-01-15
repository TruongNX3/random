import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int[] numberRandom = new int[50];
        Random rd = new Random();
        for (int i = 0; i < 50; i++) {
            numberRandom[i] = rd.nextInt(1000);
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(numberRandom[i] + "\t");
        }

    }
}
