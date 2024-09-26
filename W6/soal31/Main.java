package W6.soal31;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        Sortable.shell_sort(staff);

        staff[0].print();
        staff[1].print();
        staff[2].print();


        Employee[] employees = {
            new Employee("Bob", 60000, 15, 3, 2019),
            new Employee("Charlie", 55000, 10, 5, 2021),
            new Employee("Alice", 50000, 1, 1, 2020),
        };

        System.out.println("\nUrutan Karyawan Berdasarkan Gaji");
        Arrays.sort(employees, (e1, e2) -> e1.compare(e2));

        // Menampilkan hasil
        for (Employee e : employees) {
            e.print();
        }
    }
}
