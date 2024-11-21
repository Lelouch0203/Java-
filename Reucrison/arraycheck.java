package Reucrison;
public class arraycheck {
    public static boolean checkIfIncreasing(int arr[], int idx) {
        // Base case: if we reach the last element, it's strictly increasing
        if (idx == arr.length - 1) {
            return true;
        }
        
        // Check if the current element is less than the next one
        if (arr[idx] >= arr[idx + 1]) {
            return false; // Not strictly increasing
        }
        
        // Recur for the next element
      return checkIfIncreasing(arr, idx + 1);
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 6, 3, 4, 5};

        if (checkIfIncreasing(arr1, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }

        if (checkIfIncreasing(arr2, 0)) {
            System.out.println("Strictly Increasing");
        } else {
            System.out.println("NOT Strictly Increasing");
        }
    }
}

    

