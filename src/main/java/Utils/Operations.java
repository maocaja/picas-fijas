package Utils;

import java.util.Random;

public final class Operations {

    private Operations() {
    }

    public final static int[] shuffle() {
        int[] elements = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        int n = elements.length - 1;
        while (n > 1) {
            int k = random.nextInt(n);
            int temp = elements[n];
            elements[n] = elements[k];
            elements[k] = temp;
            --n;
        }
        return elements;
    }

    public final static int extractNumber(int[] elements, int n) {
        StringBuilder number = new StringBuilder();
        for (int index = 0; index < n; ++index) {
            number.append(elements[index]);
        }
        return Integer.parseInt(number.toString());
    }
}
