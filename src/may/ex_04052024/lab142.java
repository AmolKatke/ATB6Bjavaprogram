package may.ex_04052024;

public class lab142 {
    public static void main(String[] args) {
//HOME WORK?//
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Initialize maxValue with the smallest possible integer value
        int maxValue = Integer.MIN_VALUE;

        // Loop through each row
        for (int i = 0; i < arr.length; i++) {
            // Loop through each element in the row
            for (int j = 0; j < arr[i].length; j++) {
                // Update maxValue if the current element is greater
                if (arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("The maximum value in the array is: " + maxValue);
    }
}





