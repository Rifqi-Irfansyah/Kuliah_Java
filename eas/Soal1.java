package eas;

abstract class Employee<T>{
    protected T id;
    protected String name;

    public Employee(T id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract double calculatePayment();
    public void displayDetails(){
        //logika cetak id dan nama
        System.out.println("\nID   = " + id + "\nName = " + name);
    }
}

class FullTimeEmployee<T> extends  Employee<T>{
    private double monthSalary;

    public FullTimeEmployee(T id, String name, double monthSalary){
        super(id, name);
        this.monthSalary = monthSalary;
    }

    @Override
    public double calculatePayment(){
        //implmenet hitung pembayaran
        return monthSalary; //logic sesuai
    }
}

class PartTimeEmployee<T> extends Employee<T>{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(T id, String name, double hourlyRate, int hoursWorked){
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment(){
        //lengkapi
        return hourlyRate*hoursWorked;
    }
}

public class Soal1{
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        //buat objek fulltime dengan id integer
        FullTimeEmployee<Integer> karyawan_1 = new FullTimeEmployee(1001, "Rifqi", 10000000);
        //buat objek partime dengan id string
        PartTimeEmployee<String> karyawan_2 = new PartTimeEmployee("PT2025", "Irfansyah", 50, 75000);
        //panggil method display details dan calculate payments
        karyawan_1.displayDetails();
        System.out.println("Gaji = " + karyawan_1.calculatePayment());
        karyawan_2.displayDetails();
        System.out.println("Gaji = " + karyawan_2.calculatePayment());
    }
}
