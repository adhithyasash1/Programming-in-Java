// 1 

import java.util.*;

class QuickSort<E extends Comparable<E>> {

    /** Array Implementation **/
    public QuickSort(E[] array) {
        System.out.println("Unsorted Array: " + Arrays.asList(array));
        // Sort array
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.asList(array));
    }

    /** List Implementation **/
    public QuickSort(List<E> list) {
        System.out.println("Unsorted List: " + list);

        // Sort list
        quickSort(list);

        System.out.println("Sorted List: " + list);
    }

    /** Array Implementation **/
    public void quickSort(E[] array, int left, int right) {
        if(left < right) {
            E pivot = array[(left + right) / 2];
            int index = partition(array, left, right, pivot);

            quickSort(array, left, index - 1);
            quickSort(array, index, right);
        }
    }

    /** Array Implementation **/
    public int partition(E[] array, int left, int right, E pivot) {

        while(left <= right) {
            // Move left to right searching for out-of-order elements in left half:
            while(array[left].compareTo(pivot) < 0) {
                left++;
            }
            // Move right to left searching for out-of-order elements in right half:
            while(array[right].compareTo(pivot) > 0) {
                right--;
            }

            // Swap out-of-order elements:
            if(left <= right) {
                // Swap elements
                E tmp = array[right];
                array[right] = array[left];
                array[left] = tmp;

                left++;
                right--;
            }
        }

        return left;
    }

    /** List Implementation **/
    public void quickSort(List<E> list) {
        List<E> small = new Vector<E>();
        List<E> equal = new Vector<E>();
        List<E> big = new Vector<E>();

        if(list.size() > 1) {
            E pivot = list.get(0);

            partition(list, pivot, small, equal, big);

            quickSort(small);
            quickSort(big);

            list.addAll(small);
            list.addAll(equal);
            list.addAll(big);
        }
    }

    /** List Implementation **/
    public void partition(List<E> list, E pivot, List<E> small, List<E> equal, List<E> big) {
        while(!list.isEmpty()) {
            E e = list.remove(0);

            if(e.compareTo(pivot) > 0) {
                big.add(e);
            }
            else if(e.compareTo(pivot) < 0) {
                small.add(e);
            }
            else { // e == splitValue
                equal.add(e);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Integer[] dataArray = new Integer[n];
        List<Integer> dataList = new ArrayList<Integer>();

        for(int i = 0; i < n; i++) {
            dataArray[i] = i;
            dataList.add(i);
        }

        Collections.shuffle(Arrays.asList(dataArray));
        QuickSort<Integer> array = new QuickSort<Integer>(dataArray);


        // Can't use Arrays.asList for QSList because it creates an immutable list.
        Collections.shuffle(dataList);
        QuickSort<Integer> list = new QuickSort<Integer>(dataList);
    }
}






// 2

public class Main {
    /** The Constant QuickSortCUTOFF. */
    private static final int QuickSortCUTOFF = 10;

    /**
     * Quicksort algorithm.
     * @param a an array of Comparable items.
     */
    
    public static void quicksort(Comparable[] a) {
        quicksort(a, 0, a.length - 1);
    }

    /**
     * Internal quicksort method that makes recursive calls.
     * Uses median-of-three partitioning and a cutoff of 10.
     * 
     * @param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the right-most index of the subarray.
     */

    private static void quicksort(Comparable[] a, int low, int high) {
        if (low + QuickSortCUTOFF > high)
            insertionSort(a, low, high);
        else {
            // Sort low, middle, high
            int middle = (low + high) / 2;
            if (a[middle].compareTo(a[low]) < 0)
                swapReferences(a, low, middle);
            if (a[high].compareTo(a[low]) < 0)
                swapReferences(a, low, high);
            if (a[high].compareTo(a[middle]) < 0)
                swapReferences(a, middle, high);

            // Place pivot at position high - 1
            swapReferences(a, middle, high - 1);
            Comparable pivot = a[high - 1];

            // Begin partitioning
            int i, j;
            for (i = low, j = high - 1;;) {
                while (a[++i].compareTo(pivot) < 0)
                    ;
                while (pivot.compareTo(a[--j]) < 0)
                    ;
                if (i >= j)
                    break;
                swapReferences(a, i, j);
            }

            // Restore pivot
            swapReferences(a, i, high - 1);

            quicksort(a, low, i - 1); // Sort small elements
            quicksort(a, i + 1, high); // Sort large elements
        }
    }

    /**
     * Internal insertion sort routine for subarrays
     * that is used by quicksort.
     * 
     * @param a an array of Comparable items.
     * @param low the left-most index of the subarray.
     * @param high the high
     */
    
    private static void insertionSort(Comparable[] a, int low, int high) {
        for (int p = low + 1; p <= high; p++) {
            Comparable tmp = a[p];
            int j;

            for (j = p; j > low && tmp.compareTo(a[j - 1]) < 0; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    /**
     * Method to swap to elements in an array.
     * 
     * @param a an array of objects.
     * @param index1 the index of the first object.
     * @param index2 the index of the second object.
     */
    
    public static final void swapReferences(Object[] a, int index1, int index2) {
        Object tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
}






// 3

class WifiData {
    String SSID;

    public String getSSID() {
        return SSID;
    }

    // example how to use it
    public static void main(String[] args) {
        Comparator<WifiData> comp = new SSIDComparator();
        WifiData[] arr = new WifiData[10];
        // ... fill the array
        arr = qsort(arr, 0, arr.length-1, comp);        
    }

    public static WifiData[] qsort(WifiData[] array, int left, int right, Comparator<WifiData> comp) {
        int ll=left;
        int rr=right;

        if (rr>ll){
            WifiData pivot = array[(ll+rr)/2];
            while (ll <=rr){
                // that's how we'll use the comparator:
                while(ll<right && comp.compare(array[ll], pivot) < 0){
                    ll +=1;
                }
                while(rr>left &&  comp.compare(array[rr], pivot) > 0){
                    rr -=1;
                }
                if (ll <=rr){
                    swap(array, ll ,rr);
                    ll +=1;
                    rr -=1;
                }
            }
            if (left < rr){
                qsort(array,left,rr, comp);

            }
            if (ll<right){
                qsort(array, ll, right, comp);
            }
        }
        return array;
    }    

    // an example of Comparator that sorts by SSID
    static class SSIDComparator implements Comparator<WifiData>{
        @Override
        public int compare(WifiData o1, WifiData o2) {
            return o1.getSSID().compareTo(o2.getSSID());
        }
    }
}
