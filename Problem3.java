class FirstOccur {
    static int getFirstOccur(int n, int[] arr, int k) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if((mid==0 || k>arr[mid-1]) && arr[mid] == k) 
                return mid;

            else if(arr[mid] < k)
                start = mid+1;

            else
                end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = new int[] {2,4,4,4,6,7,8};
        int k = 4;

        System.out.println(getFirstOccur(n, arr, k));
    }
}
