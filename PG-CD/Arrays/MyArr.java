package Arrays;

public class MyArr {

    private int currentIndex = 0;
    private int initialSize;
    private int items[];

    public MyArr(int initialSize) {
        this.items = new int[initialSize + 1];
        this.initialSize = initialSize + 1;
    };

    public void add(int x) {
        if (currentIndex == this.initialSize) {
            System.out.println("Expanding the Size!"); // Informing the user
            int items2[] = new int[initialSize + 1];

            for (int i = 0; i < currentIndex; i++) {
                items2[i] = items[i];
            }

            this.items = items2;
            this.initialSize += 1;
        }
        this.items[currentIndex] = x;
        currentIndex++;
    }
    

    public int max() {
        int result = this.items[0];

        for (int i : items) {
            if (i > result) result = i;
        }

        return result;
    }

    public int min() {
        int result = this.items[0];

        for (int i : items) {
            if (i < result) result = i;
        }

        return result;
    }

    public void remove(int n) {
        if (n >= currentIndex || n < 0)  throw new IllegalArgumentException("Negative number or Number greater than Array elements");
        for (int i = n; i < currentIndex - 1; i++)
            items[i] = items[i + 1];
        this.items[currentIndex - 1] = 0;
        this.initialSize--;
        currentIndex--;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i : items) {
            sb.append(i).append(", ");
        }

        sb.append("\b\b]");
        return sb.toString();
    }

}