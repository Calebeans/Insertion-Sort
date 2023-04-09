import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int vecto[] = {8,4,7,2,8,2,9,1,0};

        System.out.println("Original:");
        System.out.println(Arrays.toString(vecto));

        insertionSort(vecto, 9);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vecto));
    }

    private static void insertionSort(int lista[], int n){
        int chave, j;

        for (int i = 1; i < n; i++){
            chave = lista[i];
            j = i-1;
            while (j >= 0 && lista[j] > chave){
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = chave;
        }
    }
}