import java.util.Scanner;

public class quickSort{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int a = sc.nextInt();

        int[] array = new int[a];

        System.out.println("Enter the elements for the array : ");
        for (int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Unsorted Array : ");
        for (int i = 0; i < a; i++){
            System.out.print(array[i] + " ");
        }

        QuickSorter(array, 0, a-1);

        System.out.println("\nSorted array : ");
        for (int i = 0; i < a; i++){
            System.out.print(array[i] + " ");
        }

        sc.close();
    }

    private static void QuickSorter(int[] array, int L, int H){
        if (L < H){

            int piv = partition(array, L, H);
            QuickSorter(array, L, piv -1 );
            QuickSorter(array, piv + 1, H);

        }
    }

    private static int partition(int[] array, int L, int H){
        int piv = array[H];
        int i = L- 1;
        for (int j = L;  j < H; j++){
            if(array[j]<=piv){
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }

        int t =  array[i + 1];
        array[i + 1] = array[H];
        array[H] = t;

        return i + 1;
    }

}