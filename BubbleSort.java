public class BubbleSort extends SortAlgorithm {

    public BubbleSort(int input_array[]) {
        super(input_array);
    }

    @Override
    public void sort() {
        // Initializing a boolean flag to keep track of whether any swaps occurred in the current iteration.
        boolean swapped;
        // Outer loop iterates through the array elements.
        for(int i=0; i<arr.length-1;i++){
            swapped = false; // Resetting swapped flag for each iteration.
            // Inner loop iterates through the unsorted portion of the array.
            for(int j=0; j<arr.length-i-1;j++){
                comparison_counter++; // Counting each comparison made. This statement counts properly because there will be a comparison eventually in every iteration.
                if(arr[j]>arr[j+1]) {
                    swap(j, j + 1); // Calling the swap method if arr[j]>arr[j+1].
                    swapped = true; // Setting swapped flag to true since the swap happened.
                }
            }
            if (!swapped) {  // If no swaps occurred in this iteration, the array is already sorted, so breaks out of the loop.
                break;
            }
        }
    }

    @Override
    public void print() {
        System.out.print("Bubble Sort\t=>\t");
        super.print();
    }
}