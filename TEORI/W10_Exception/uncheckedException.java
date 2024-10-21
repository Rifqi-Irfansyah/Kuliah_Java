public class uncheckedException {
    public static void main(String[] args) {
        try {
            int a;
            // Contoh konversi string ke integer dengan kemungkinan error
            a = Integer.parseInt("Contoh error");
            System.out.print(a);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
}
