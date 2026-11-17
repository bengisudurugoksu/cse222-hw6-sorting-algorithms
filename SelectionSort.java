public class SelectionSort extends SortAlgorithm {

    public SelectionSort(int input_array[]) {
        super(input_array);
    }

    @Override
    public void sort() {
        // Iterating over the array.
        for(int k = 0;k<arr.length-1;k++) {
            int min_idx = k; // Initializing the index of the minimum element to the current index.
            // Finding the index of the minimum element in the unsorted part of the array.
            for (int j = k+1; j < arr.length; j++) {
                comparison_counter++; // Counting each comparison made. This statement counts properly because there will be a comparison eventually in every iteration.
                if (arr[j] < arr[min_idx]) { // Updating min_idx if a smaller element is found.
                    min_idx = j;
                }
            }
            swap(k,min_idx); // Swapping the minimum element with the first element of the unsorted part.
        }
    }

    @Override
    public void print() {
        System.out.print("Selection Sort\t=>\t");
        super.print();
    }
}