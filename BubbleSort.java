public class BubbleSort {
    // Code for Bubble Sort
    public static int bubbles(String[] arr, int n) {
        String temp;
        int count=0; // initialize counter
        // Sorting strings using bubble sort
        count +=1; // j=0 (1 assignment)
        for (int j = 0; j < n - 1; j++) {
            count +=2; // j < n-1 (1 comparison + 1 subtraction)
            count +=2; // j++ (1 addition + 1 assignment)
            for (int i = j + 1; i < n; i++) {
                count+=2; // i = j + 1 (1 addition + 1 assignment)
                count+=1; // i < n (1 comparison)
                count+=2; // i++ (1 addition + 1 assignment)
                if (arr[j].compareTo(arr[i]) > 0) {
                    count+=4; // arr[j].compareTo(arr[i] > 0) (1 function call + 2 indexing + 1 comparison)
                    temp = arr[j];
                    count+=2; // temp = arr[j] (1 indexing + 1 assignment)
                    arr[j] = arr[i];
                    count+=3; // arr[j] = arr[i] (2 indexing + 1 assignment)
                    arr[i] = temp;
                    count+=2; // arr[i] = temp; (1 indexing + 1 assignment)
                }
            }
        }
        count+=1; // return count (1 function return)
        return count;
    }
}