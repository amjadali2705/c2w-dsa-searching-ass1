class SearchElem2DMatrix {
    static boolean isElemPresent(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length-1;

        while(row<arr.length && col>=0) {
            if(arr[row][col] == target)
                return true;
            else if(arr[row][col] > target)
                col--;
            else 
                row++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,4,7,11}, {2,5,8,12}, {3,6,9,16}, {10,13,14,17}};
        int target = 5;
        System.out.println(isElemPresent(arr, target));
    }
}