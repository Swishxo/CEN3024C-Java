import java.util.Random;

public class Second extends Thread{
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int arr[] = new int[200000000];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10) + 1;
        }

        int num = added(arr);
        long end = System.currentTimeMillis();
        System.out.println("Thread calc: " + num + " time: " + (end - start));

    }
    public static int added(int[] num){
        int add = 0;

        for(int i: num){
            add += i;
        }
        return add;
    }
}
