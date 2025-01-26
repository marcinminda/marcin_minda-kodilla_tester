import java.util.Random;

//Prezentacja w FirstClass

public class RandomNumbers {
    private int[] grad;
    private int sum;
    private int count;

    public RandomNumbers() {
        this.grad = new int[100000];
        this.sum = 0;
        this.count = 0;
    }

    public void generateNumbers() {
        Random random = new Random();
        int totalsum = 0;
        int i = 0;
        do {
            int num = random.nextInt(31);
            grad[i++] = num;
            totalsum += num;
        } while (totalsum <= 83);
        count = i;
    }

    public int getMaxValue() {
        int max = grad[0];
        for (int i = 1; i < count; i++) {
            if (grad[i] > max) {
                max = grad[i];
            }
        }
        return max;
    }

    public int getMinValue() {
        int min = grad[0];
        for (int i = 1; i < count; i++) {
            if (grad[i] < min) {
                min = grad[i];
            }
        }
        return min;
    }

}

