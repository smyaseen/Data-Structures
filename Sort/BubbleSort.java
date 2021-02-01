public class BubbleSort {
    public static void main(String[] args) {
        
        // optimized bubble sort

        int[] arr = {20,-15,7,35,55,1,-22};

        // bubbleSortFunc(arr);
        bubbleSortRecursive(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    private static void bubbleSortRecursive(int[] arr) {
        bubbleSortRecursive(arr,0,0);
    }

    private static void bubbleSortRecursive(int[] arr,int outer,int inner) {

        if (outer == arr.length-1) 
            return;

            if (inner == arr.length-1) {
                bubbleSortRecursive(arr,outer+1,0);
                return;
            } 

            if (arr[inner] > arr[inner+1]) {
                int temp = arr[inner];
                arr[inner] = arr[inner+1];
                arr[inner+1] = temp;            
            }           

            bubbleSortRecursive(arr,outer,inner+1);
    }


    private static void bubbleSortFunc(int[] arr) {
            
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
          }
        }

    }
  
}
