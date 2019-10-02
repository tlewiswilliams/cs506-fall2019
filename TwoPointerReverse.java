class TwoPointerReverse {
	public static void reverse(int arr[])
	{	int i = 0;
		int j = arr.length - 1;
		while(i < arr.length) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
