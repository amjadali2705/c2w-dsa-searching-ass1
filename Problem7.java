class Count1 {
    static int get1sCount(int[] arr, int n) {
        int start = 0;
        int end = n-1;

        while(start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == 1)
                end = mid-1;
            else
              start = mid+1;  
        }
        return n-start;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[] {0,0,0,1,1,1,1,1,1,1};
        System.out.println(get1sCount(arr, n));
    }
}