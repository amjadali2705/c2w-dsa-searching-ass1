class PeakElem {
    static int getPeakElem(int n, int[] arr) {
        int start = 0;
        int end = n-1;

        while(start < end) {
            int mid = (start+end)/2;

            if(arr[mid] > arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[] {1,3,20,4,1,0};

        System.out.println(getPeakElem(n, arr));
    }
}