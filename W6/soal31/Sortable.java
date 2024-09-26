package W6.soal31;

abstract class Sortable{
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        // Implementasi algoritma shell sort
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && temp.compare(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}
   
