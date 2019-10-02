public class ArrayReverse {
    static int[] reverse(int arr[])
    {
        int n = arr.length;
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[--j] = arr[i];
        }
        return b;
    }
}
