import java.util.Scanner; // dependency dari scanner

class Printer {
    public void print(String namaUser) {
        System.out.println("Username: " + namaUser);
    }
}

class User {
    public void createUsername() {
        Scanner scanner = new Scanner(System.in); // memanggil dependency scanner
        System.out.print("Masukkan nama Anda: ");
        String namaUser = scanner.nextLine();

        Printer printer = new Printer(); // dependency dari class Printer
        printer.print(namaUser); // memanggil dependency Printer
    }
}

public class Dependency {
    public static void main(String[] args) {
        User user = new User();
        user.createUsername();
    }
}