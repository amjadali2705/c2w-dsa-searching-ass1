class BinarySearch {
    static int binarySearch(int n, int[] arr, int k) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == k)
                return mid;

            if(arr[mid] < k)
                start = mid+1;

            if(arr[mid] > k)
                end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[] {1,2,3,4,5};
        int k = 4;

        System.out.println(binarySearch(n, arr, k));
    }
}
