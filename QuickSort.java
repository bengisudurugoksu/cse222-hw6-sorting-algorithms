public class QuickSort extends SortAlgorithm {

    public QuickSort(int input_array[]) {
        super(input_array);
    }
    // Partition method for selecting a pivot and partitioning the array into two parts.
    private int partition(int arr[], int lowest, int highest){
        int pivot = arr[highest]; // Selecting the pivot element (in this case, the last element).
        int i = lowest - 1; // Initializing the index of the smaller element.
        for(int j=lowest; j<= highest-1;j++){ // Iterating through the array to rearrange elements around the pivot.
            if(arr[j]<pivot){ // Comparing current element with pivot.
                comparison_counter++; // Counting each comparison made.
                i++;
                swap(i,j);  // If element is smaller than pivot, swapping it with the element at the smaller index.
            }
            else{
                comparison_counter++; // Counting each comparison made.
            }
        }
        swap(i+1,highest); // Moving pivot element to its correct position.
        return (i+1); // Returning the index of the pivot element after partitioning.
    }

    private void sort(int[] arr, int lowest, int highest){ // Recursive sort method.
        if(lowest<highest){  // This condition is the base case which indicates that there is more than one element int the sub-array.
            int part = partition(arr, lowest, highest); // Getting the pivot element's index with the partition method.
            sort(arr, lowest, part-1); // Recursively sorting elements before and after the pivot.
            sort(arr, part+1, highest);
        }
    }

    @Override
    public void sort() {
        sort(arr, 0, arr.length-1); // Calling the recursive sort method with the entire array. In this case lowest is 0 and highest is arr.length-1.
    }

    @Override
    public void print() {
        System.out.print("Quick Sort\t=>\t");
        super.print();
    }
}