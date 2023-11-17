import java.util.Scanner;

class BinarySearchAlgo {

    //loop
    // static int binarySearch(int[] arr, int search) {
    //     int start = 0;
    //     int end = arr.length-1;

    //     while(start <= end) {
    //         int mid = (start+end)/2;

    //         if(arr[mid] == search)
    //             return mid;

    //         if(arr[mid] < search)
    //             start = mid+1;

    //         if(arr[mid] > search)
    //             end = mid-1;
    //     }
    //     return -1;
    // }


    //recursion
    static int binarySearchRec(int[] arr, int start, int end, int search) {
        if(start > end)
            return -1;
        else {
            int mid = (start+end)/2;

            if(arr[mid] == search)
                return mid;

            if(arr[mid] < search)
                return binarySearchRec(arr, mid+1, end, search);
            else
                return binarySearchRec(arr, start, mid-1, search);
        
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 7, 11, 24, 35, 57, 75, 87};

        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        sc.close();

        //int index = binarySearch(arr, search);

        int start = 0;
        int end = arr.length-1;
        int index = binarySearchRec(arr, start, end, search);

        if(index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index "+ index);
    }
}
