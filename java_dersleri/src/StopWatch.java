public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        selectionSort(numbers);

        stopwatch.stop();

        System.out.println("100.000 sayıyı sıralama için geçen süre: "
                + stopwatch.getElapsedTime() + " milliseconds.");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int a = i + 1; a < arr.length; a++) {
                if (arr[a] < arr[minIndex]) {
                    minIndex = a;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
/* uml diagram
        ---------------------------------
        |            StopWatch          |
        ---------------------------------
        | - startTime: long             |
        | - endTime: long               |
        ---------------------------------
        | + StopWatch()                 |
        | + start(): void               |
        | + stop(): void                |
        | + getStartTime(): long        |
        | + getEndTime(): long          |
        | + getElapsedTime(): long      |
        --------------------------------- */