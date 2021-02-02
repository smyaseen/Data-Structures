public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20,-15,7,35,55,1,-22};
        
        // selectionSortLinear(arr);
        selectionSortRecursion(arr);       
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void selectionSortRecursion(int[] arr) {
        selectionSortRecursion(arr,0,1,0);
    }

    public static void selectionSortRecursion(int[] arr,int outer,int inner,int smallest) {

        if (outer == arr.length) 
            return;

        if (inner == arr.length) {
            
            if (inner != smallest) {
                int temp = arr[smallest];
                arr[smallest] = arr[outer];
                arr[outer] = temp;
            }

            selectionSortRecursion(arr,outer+1,outer+2,outer+1);
            return;
        }
        
        if (arr[inner] < arr[smallest]) {
            smallest = inner;
        }

        selectionSortRecursion(arr,outer,inner+1,smallest);

    }

    public static void selectionSortLinear(int[] arr) {
    
        for (int i = 0; i < arr.length-1; i++) {
            
            int smallest = i;
            
            int j;
            for (j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j; 
            }

            if (smallest != i) {
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
    }

}