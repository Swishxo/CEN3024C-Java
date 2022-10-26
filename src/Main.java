import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] num = nums();
        int addedNums = added(num);
        long end = System.currentTimeMillis();
        System.out.println("Main: " + addedNums + " time " + (end - start));

        Second second = new Second();
        second.start();



    }

    public static int added(int[] num){
        int add = 0;

        for(int i: num){
            add += i;
        }
        return add;
    }

    public static int[] nums(){
        int arr[] = new int[200000000];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(10) + 1;
        }
        return arr;
    }
}