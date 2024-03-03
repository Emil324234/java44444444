import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] firms = {"Casio", "Tissot", "Swatch"};
        String[][] firmBrands = {{"Casio", "CASIO Vintage A159WA-N1"}, {"Tissot", "TISSOT T101.617.16.051.00"}, {"Swatch", "swatch SO33M100"}};

        ArrayList<Customer> customers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Подробная информация о клиенте " + (i + 1) + ":");
            System.out.print("Имя: ");
            String Name = scanner.nextLine();
            System.out.print("Почта: ");
            String email = scanner.nextLine();
            System.out.print("Номер телефона: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Список фирм и марок:");
            for (int j = 0; j < firms.length; j++) {
                System.out.println(j + ". " + firms[j] + " - " + firmBrands[j][1]);
            }

            System.out.print("Выберите нужный вам товар: ");
            int position = Integer.parseInt(scanner.nextLine());

            System.out.print("Нужное количество товара: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            customers.add(new Customer(Name, email, phoneNumber, firms[position], firmBrands[position][1], quantity));
        }

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println("Заказ " + (i + 1) + ":");
            System.out.println("Заказчик: " + customer.NameCustomer());
            System.out.println("Почта: " + customer.EmailCustomer());
            System.out.println("Номер телефона: " + customer.PhoneCustomer());
            System.out.println("Позиция: " + customer.SelectPosition() + " - " + customer.SelectBrand());
            System.out.println("Количество товара: " + customer.SelectQuantity());
        }
    }
}

class Customer {
    private String Name;
    private String email;
    private String phoneNumber;
    private String position;
    private String brand;
    private int quantity;

    public Customer(String NameCustomer, String email, String phoneNumber, String position, String brand, int quantity) {
        this.Name = NameCustomer;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.brand = brand;
        this.quantity = quantity;
    }

    public String NameCustomer() {
        return Name;
    }

    public String EmailCustomer() {
        return email;
    }

    public String PhoneCustomer() {
        return phoneNumber;
    }

    public String SelectPosition() {
        return position;
    }

    public String SelectBrand() {
        return brand;
    }

    public int SelectQuantity() {
        return quantity;
    }
}
