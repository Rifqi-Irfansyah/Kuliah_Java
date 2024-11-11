import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SimpleGUI {
    private static int total_bayar = 0;
    private static JTextArea dataPenjualan;
    private static JTextField inNama;
    private static JTextField inAlamat;
    private static JTextField inTelp;
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program GUI Sederhana");
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new BorderLayout());
        // Panel 1 - Data Customer
        JPanel panel = new JPanel();
        placeDataCust(panel);  
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setPreferredSize(new Dimension(290, 90));
        panel.setBorder(BorderFactory.createTitledBorder("Data Customer"));
        frame.add(panel, BorderLayout.WEST);
        
        // Panel 2 - Pilih Menu
        JPanel panel2 = new JPanel();
        placeMenu(panel2);
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel2.setPreferredSize(new Dimension(290, 90));
        panel2.setBorder(BorderFactory.createTitledBorder("Pilih Menu"));
        frame.add(panel2, BorderLayout.EAST);
        
        // Panel 3 - Data Penjualan
        JPanel panel3 = new JPanel();
        placeDataPenjualan(panel3);
        panel3.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel3.setPreferredSize(new Dimension(290, 190));
        panel3.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        frame.add(panel3, BorderLayout.SOUTH);
        
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
    
    private static void placeDataCust(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JLabel("Data Customer"));

        JPanel panelNama = new JPanel();
        panelNama.setLayout(new BoxLayout(panelNama, BoxLayout.X_AXIS));
        JLabel label = new JLabel("Nama:");
        label.setPreferredSize(new Dimension(100, 5));
        inNama = new JTextField(20);
        inNama.setPreferredSize(new Dimension(190,5));
        panelNama.add(label);
        panelNama.add(inNama);

        JPanel panelAlamat = new JPanel();
        panelAlamat.setLayout(new BoxLayout(panelAlamat, BoxLayout.X_AXIS));
        JLabel textAlamat = new JLabel("Alamat:");
        textAlamat.setPreferredSize(new Dimension(100, 5));
        inAlamat = new JTextField(20);
        inAlamat.setSize(20, 5);

        panelAlamat.add(textAlamat);
        panelAlamat.add(inAlamat);

        JPanel panelTelp = new JPanel();
        panelTelp.setLayout(new BoxLayout(panelTelp, BoxLayout.X_AXIS));
        JLabel textTelp = new JLabel("No Telp:");
        textTelp.setPreferredSize(new Dimension(100, 5));
        inTelp = new JTextField(20);
        inTelp.setSize(20, 5);
        panelTelp.add(textTelp);
        panelTelp.add(inTelp);

        panel.add(panelNama);
        panel.add(panelAlamat);
        panel.add(panelTelp);

    }
    
    @SuppressWarnings("StringConcatenationInsideStringBufferAppend")
    private static void placeMenu(JPanel panel2){
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS)); 

        JCheckBox menu1 = new JCheckBox("Steak \tRp 10.000");
        JCheckBox menu2 = new JCheckBox("Spagheti \tRp 15.000");
        JCheckBox menu3 = new JCheckBox("Pizza \tRp 20.000");
        panel2.add(menu1); 
        panel2.add(menu2); 
        panel2.add(menu3); 
        
        
        JLabel total = new JLabel("Total Bayar");
        JTextField outTotal = new JTextField("Rp. 0");
        outTotal.setEditable(false);
        outTotal.setBackground(Color.BLACK);
        outTotal.setForeground(Color.WHITE); 
        
        total.setBorder(new EmptyBorder(10, 10, 0, 10));
        panel2.add(menu1);
        panel2.add(menu2);
        panel2.add(menu3);

        panel2.add(total);
        panel2.add(outTotal);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                total_bayar = 0;

                if (menu1.isSelected()) 
                    total_bayar += 10000;
                if (menu2.isSelected()) 
                    total_bayar += 15000;
                if (menu3.isSelected()) 
                    total_bayar += 20000;

                outTotal.setText("Rp " + total_bayar);
            }
        };

        menu1.addItemListener(itemListener);
        menu2.addItemListener(itemListener);
        menu3.addItemListener(itemListener);

        JButton buttonSubmit = new JButton("Kirim");
        buttonSubmit.setBounds(10, 80, 150, 25);
        panel2.add(buttonSubmit);

        buttonSubmit.addActionListener(e -> {
            StringBuilder pesanan = new StringBuilder();
            pesanan.append("Nama    : \t" + inNama.getText() + "\n");
            pesanan.append("Alamat  : \t" + inAlamat.getText() + "\n");
            pesanan.append("Telepon : \t" + inTelp.getText() + "\n");
            pesanan.append("====================================\n");
            pesanan.append("Pesanan : \n");

            if (menu1.isSelected()) 
                pesanan.append("  - Steak\t(Rp 10.000)\n");
            if (menu2.isSelected()) 
                pesanan.append("  - Spaghetti\t(Rp 15.000)\n");
            if (menu3.isSelected()) 
                pesanan.append("  - Pizza\t(Rp 20.000)\n");
            
            pesanan.append("====================================\n");
            pesanan.append("Total Bayar : " + total_bayar);

            dataPenjualan.setText(pesanan.toString());
        });
    }
    
    private static void placeDataPenjualan(JPanel panel3){
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS)); 
        dataPenjualan = new JTextArea(5, 20);
        panel3.add(dataPenjualan);
    }
}