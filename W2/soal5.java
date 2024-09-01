class soal5{
    public static void main(String[] args){
        String a = "hello";
        String b = "java";
        String greater, concat;
        int x = a.length() + b.length();

        // Mengubah karakter pertama menjadi uppercase
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);

        // Mengambil huruf pertama dari masing-masing string
        char firstChar1 = a.charAt(0);
        char firstChar2 = b.charAt(0);
        
        // Membandingkan huruf pertama
        int result = Character.compare(firstChar1, firstChar2);

        if(result > 0){
            greater = "yes";
        }
        else{
            greater = "no";
        }

        // Menggabungkan string
        concat = a + " " + b;


        System.out.println(x);
        System.out.println(greater);
        System.out.println(concat);
    }
}
