public class MergeSort extends SortAlgorithm {

    public MergeSort(int input_array[]) {
        super(input_array);
    }

    private void merge(int arr[], int l, int m, int r){
        int size1 = m - l + 1; // Calculating the sizes of the two sub-arrays to be merged.
        int size2 = r - m;
        int L[] = new int[size1]; // Creating temporary arrays to hold the elements of the two sub-arrays.
        int R[] = new int[size2];
        for(int i=0;i<size1;++i){ // Copying data to temporary arrays.
            L[i] = arr[l+i];
        }
        for(int j=0;j<size2;++j){
            R[j] = arr[m+1+j];
        }
        // Merging the two temporary arrays back into the original array.
        int a=0,b=0,c=l;  // Initializing indices for merging and for the original array.
        while(a<size1 && b<size2){ // Comparing elements of the two sub-arrays and merging them in sorted order.
            if(L[a]<=R[b]){
                comparison_counter++; // Counting each comparison made.
                arr[c] = L[a];
                a++;
            }
            else{
                comparison_counter++; // Counting each comparison made.
                arr[c] = R[b];
                b++;
            }
            c++;
        }
        // Copying any remaining elements of the left sub-array.
        while(a<size1){
            arr[c] = L[a];
            a++;
            c++;
        }
        // Copying any remaining elements of the right sub-array.
        while(b<size2){
            arr[c] = R[b];
            b++;
            c++;
        }
    }

    private void sort(int arr[], int l, int r){
        // Recursive sort function to divide the array into halves and merge them.
        if(l < r){
            int m = l + (r-l) / 2; // Calculating the middle index
            sort(arr,l,m); // Sorting the left half.
            sort(arr,m+1,r); // Sorting the right half.
            merge(arr,l,m,r); // Merging the sorted halves.
        }
    }

    @Override
    public void sort() {
        sort(arr,0,arr.length-1);
    }  // Calling the recursive sort method with the entire array. The starting index is 0 and the ending index is arr.length-1.

    @Override
    public void print() {
        System.out.print("Merge Sort\t=>\t");
        super.print();
    }
}