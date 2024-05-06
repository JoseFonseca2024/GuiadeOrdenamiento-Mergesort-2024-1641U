public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {84, 57, 25, 39, 24, 15, 2, 87, 65, 36, 14, 34};
        int n = arr.length;

        System.out.println("Arreglo original");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Arreglo ordenado");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }

   public static void mergeSort(int[] arr, int left, int right) {

    if (left < right) {

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);

        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);

    }

   }

   private static void merge(int[] arr, int left, int mid, int right) {

    int sizeleft = mid - left + 1;
    int sizeright = right - mid;

    int[] templeft = new int [sizeleft];
    int[] tempright = new int [sizeright];

    for (int i = 0; i < sizeleft ; i++) {
        templeft[i] = arr[left + i];
    }

    for (int j = 0; j < sizeright; j++) {
        tempright[j] = arr[mid+ 1 +j];
    }

    int i = 0, j = 0;
    int k = left; 

    while (i < sizeleft && j < sizeright) {
        if (templeft[i] <= tempright[j]) {
            arr[k] = templeft[i];
            i++;
        } else {
            arr[k] = tempright[j];
            j++;
        }
        k++;
    }
    while (i < sizeleft) {
        arr[k] = templeft[i];
        i++;
        k++;
    }

    while (j < sizeright) {
        arr[k] = tempright[j];
        j++;
        k++;
    }
    }
}
   


