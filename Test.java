class Test {
	public static boolean test() {
		int[] arr = new int[]{1,2,3,4};
		TwoPointerReverse.reverse(arr);
		int[] res = new int[]{4,3,2,1};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != res[i]) {
				return false;
			}
		}
		return true;
	}
}