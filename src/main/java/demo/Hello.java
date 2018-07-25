package demo;

import java.util.Random;

public class Hello {

    public static void main(String[] args) throws Exception {
        while (true) {
            generateBigArray();
            if (System.currentTimeMillis() % 3 == 0) {
                System.out.println("--- run gc manually ---");
                System.gc();
                // Runtime.getRuntime().gc();
            }
            Thread.sleep(1000);
        }
    }
    private static void generateBigArray() {
        int size = new Random().nextInt(50000);
        Long[] array = new Long[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = System.currentTimeMillis();
        }
        System.out.println("# generate array with length: " + array.length);
    }

}
