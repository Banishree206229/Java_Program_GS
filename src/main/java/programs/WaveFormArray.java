package programs;

public class WaveFormArray {
    public static int[] waveFormArray(int[] arr) {
        //arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
        //int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        //System.out.println(Arrays.toString(waveFormArray(arr))); //[10, 5, 6, 2, 20, 3, 100, 80]
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0 && arr[i] > arr[i - 1]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            if (i % 2 == 0 && arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
        return arr;
    }
}