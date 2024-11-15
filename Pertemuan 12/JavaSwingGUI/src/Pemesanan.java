import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class Pemesanan {
    private JButton tambahButton;
    private JTextArea textArea;
    private JCheckBox steakCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox spaghettiCheckBox;
    private JCheckBox noodleCheckBox;
    private JTextField textField1;
    private JTextField textField2;
    private JFormattedTextField formattedTextField;
    private JLabel judulApp;
    private JPanel dataCustomer;
    private JLabel namaCustomer;
    private JLabel alamatCustomer;
    private JLabel phoneCustomer;
    private JPanel chooseMenu;
    private JLabel totalAmount;
    private JPanel mainPanel;
    private JLabel labelHarga;
    private JTextArea textAreaPenjualan;
    private JScrollPane dataPenjualan;

    public Pemesanan() {
        NumberFormat numberFormat = NumberFormat.getIntegerInstance();
        numberFormat.setGroupingUsed(false);
        formattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(numberFormat)));

        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = capitalizeWords(textField1.getText());
                String alamat = capitalizeWords(textField2.getText());
                String phone = formattedTextField.getText();

                if (nama.isEmpty() || alamat.isEmpty() || phone.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mohon lengkapi datamu!");
                    return;
                }

                int totalHarga = 0;
                StringBuilder pesanan = new StringBuilder("Pesanan:\n");

                if (steakCheckBox.isSelected()) {
                    totalHarga += 80000;
                    pesanan.append("Steak: Rp 80000\n");
                }
                if (pizzaCheckBox.isSelected()) {
                    totalHarga += 50000;
                    pesanan.append("Pizza: Rp 50000\n");
                }
                if (spaghettiCheckBox.isSelected()) {
                    totalHarga += 35000;
                    pesanan.append("Spaghetti: Rp 35000\n");
                }
                if (noodleCheckBox.isSelected()) {
                    totalHarga += 10000;
                    pesanan.append("Noodle: Rp 10000\n");
                }

                if (totalHarga == 0) {
                    JOptionPane.showMessageDialog(null, "Pilih minimal satu menu!");
                    return;
                }

                pesanan.append("\nNama: ").append(nama)
                        .append("\nAlamat: ").append(alamat)
                        .append("\nNo. Telepon: ").append(phone)
                        .append("\n\nTotal Harga: Rp. ").append(totalHarga);

                textAreaPenjualan.setText(pesanan.toString());
                labelHarga.setText("Rp. " + totalHarga);
            }
        });
    }

    private String capitalizeWords(String input) {
        String[] words = input.toLowerCase().split(" ");
        StringBuilder capitalizedText = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedText.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return capitalizedText.toString().trim();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Pemesanan");
        frame.setContentPane(new Pemesanan().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
