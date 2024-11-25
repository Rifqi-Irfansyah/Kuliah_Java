package TEORI.W15_GUISerialization;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class SimpleGUI {
    private static int totalBayar = 0;
    private static JTextArea dataPenjualan;
    private static JTextField inNama;
    private static JTextField inAlamat;
    private static JTextField inTelp;
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Program GUI Sederhana");
        frame.setSize(600, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


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
        panel3.setPreferredSize(new Dimension(290, 230));
        panel3.setBorder(BorderFactory.createTitledBorder("Data Penjualan"));
        frame.add(panel3, BorderLayout.SOUTH);
        
        frame.setSize(600, 450);
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

        ItemListener itemListener = e -> {
            totalBayar = 0;

            if (menu1.isSelected()) 
                totalBayar += 10000;
            if (menu2.isSelected()) 
                totalBayar += 15000;
            if (menu3.isSelected()) 
                totalBayar += 20000;

            outTotal.setText("Rp " + totalBayar);
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
            pesanan.append("Total Bayar : " + totalBayar);

            dataPenjualan.setText(pesanan.toString());
        });
    }
    
    private static void placeDataPenjualan(JPanel panel3){
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS)); 
        dataPenjualan = new JTextArea(5, 20);

        JPanel panelSave = new JPanel();
        panelSave.setLayout(new BoxLayout(panelSave, BoxLayout.X_AXIS));
        
        JButton buttonSave = new JButton("Save File");
        buttonSave.setBounds(10, 80, 150, 25);
        JButton buttonOpen = new JButton("Open File");
        buttonOpen.setBounds(10, 80, 150, 25);
        panelSave.add(buttonSave);
        panelSave.add(buttonOpen);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
        panelSave.setLayout(flowLayout);

        panel3.add(dataPenjualan);
        panel3.add(panelSave);

        buttonSave.addActionListener(e -> {
            SaveFile save = new SaveFile(dataPenjualan.getText());

            try (FileOutputStream fileOut = new FileOutputStream("savefile.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

                out.writeObject(save);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!", 
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException i) {
                System.out.println(i);
            }
        });

        buttonOpen.addActionListener(e -> {
            SaveFile open;

            try (FileInputStream fileIn = new FileInputStream("savefile.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
                
                open = (SaveFile) in.readObject();
                dataPenjualan.setText(open.getContent());

            } catch (IOException | ClassNotFoundException i) {
                JOptionPane.showMessageDialog(null, i, 
                    "Peringatan", JOptionPane.WARNING_MESSAGE);
                System.out.println(i);
            }
        });
    }
}


class SaveFile implements Serializable {
    private final String content;
    
    public SaveFile(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
}
