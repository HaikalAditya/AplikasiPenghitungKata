import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class penghitungKataForm extends javax.swing.JFrame {

    /**
     * Creates new form penghitungKataForm
     */
    public penghitungKataForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHitung = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtJumlahKata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        lblJumlahKarakter = new javax.swing.JTextField();
        lblJumlahKalimat = new javax.swing.JTextField();
        lblCari = new javax.swing.JTextField();
        txtJumlahParagraf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 600));

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Penghitung Kata");
        jPanel1.add(jLabel1, "card2");

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnHitung, gridBagConstraints);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnSimpan, gridBagConstraints);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(350, 160));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setPreferredSize(new java.awt.Dimension(340, 92));
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        txtJumlahKata.setEditable(false);
        txtJumlahKata.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(txtJumlahKata, gridBagConstraints);

        jLabel2.setText("Masukkan Kalimat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Jumlah Kata");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Jumlah Karakter");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Jumlah Kalimat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Pencarian Kata");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jPanel2.add(jLabel6, gridBagConstraints);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(btnCari, gridBagConstraints);

        lblJumlahKarakter.setEditable(false);
        lblJumlahKarakter.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(lblJumlahKarakter, gridBagConstraints);

        lblJumlahKalimat.setEditable(false);
        lblJumlahKalimat.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(lblJumlahKalimat, gridBagConstraints);

        lblCari.setPreferredSize(new java.awt.Dimension(200, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(lblCari, gridBagConstraints);

        txtJumlahParagraf.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(txtJumlahParagraf, gridBagConstraints);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Jumlah Paragraf");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel2.add(jLabel7, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variabel untuk mengontrol apakah real-time aktif
    private boolean isRealTimeActive = false;
    
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
     // Ambil teks dari JTextArea
    String inputText = jTextArea1.getText();

    // Hitung jumlah kata
    int wordCount = inputText.isEmpty() ? 0 : inputText.split("\\s+").length;

    // Hitung jumlah karakter (termasuk spasi)
    int charCount = inputText.length();

    // Hitung jumlah kalimat (asumsikan dipisahkan oleh '.', '!', '?')
    int sentenceCount = inputText.isEmpty() ? 0 : inputText.split("[.!?]").length;

    // Hitung jumlah paragraf (asumsikan dipisahkan oleh newline '\n')
    int paragraphCount = inputText.isEmpty() ? 0 : inputText.split("\n").length;
     txtJumlahKata.setText(String.valueOf(wordCount));
     lblJumlahKarakter.setText(String.valueOf(charCount));
     lblJumlahKalimat.setText(String.valueOf(sentenceCount));
    txtJumlahParagraf.setText(String.valueOf(paragraphCount));
    
      // Aktifkan penghitungan real-time
    isRealTimeActive = true;
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
         // Ambil teks dari JTextArea (input teks utama)
    String inputText = jTextArea1.getText();

    // Ambil kata kunci dari JTextField (input kata untuk dicari)
    String keyword = lblCari.getText().trim();

    // Validasi input kata kunci
    if (keyword.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Masukkan kata yang ingin dicari!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Hitung jumlah kemunculan kata kunci
    int count = 0;
    String[] words = inputText.split("\\s+"); // Pisahkan teks berdasarkan spasi

    for (String word : words) {
        if (word.equalsIgnoreCase(keyword)) {
            count++;
        }
    }

    // Tampilkan hasil pencarian
    if (count > 0) {
        JOptionPane.showMessageDialog(this, "Kata \"" + keyword + "\" ditemukan sebanyak " + count + " kali.");
    } else {
        JOptionPane.showMessageDialog(this, "Kata \"" + keyword + "\" tidak ditemukan.");
    }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // Pilih lokasi file menggunakan JFileChooser
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Teks dan Hasil");
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
            // Ambil teks dari JTextArea
            String inputText = jTextArea1.getText();

            // Hitung jumlah kata, karakter, kalimat, dan paragraf
            int wordCount = inputText.isEmpty() ? 0 : inputText.split("\\s+").length;
            int charCount = inputText.length();
            int sentenceCount = inputText.isEmpty() ? 0 : inputText.split("[.!?]").length;
            int paragraphCount = inputText.isEmpty() ? 0 : inputText.split("\n").length;

            // Format hasil perhitungan
            String hasil = "Jumlah Kata: " + wordCount +
                           "\nJumlah Karakter: " + charCount +
                           "\nJumlah Kalimat: " + sentenceCount +
                           "\nJumlah Paragraf: " + paragraphCount;

            // Tulis teks dan hasil ke file
            writer.write("Teks:\n" + inputText + "\n\nHasil Perhitungan:\n" + hasil);

            JOptionPane.showMessageDialog(this, "File berhasil disimpan!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
         if (isRealTimeActive) {
        // Ambil teks dari JTextArea
        String inputText = jTextArea1.getText();
            int wordCount = inputText.isEmpty() ? 0 : inputText.split("\\s+").length;
            int charCount = inputText.length();
            int sentenceCount = inputText.isEmpty() ? 0 : inputText.split("[.!?]").length;
            int paragraphCount = inputText.isEmpty() ? 0 : inputText.split("\n").length;
           txtJumlahKata.setText(String.valueOf(wordCount));
            lblJumlahKarakter.setText(String.valueOf(charCount));
            lblJumlahKalimat.setText(String.valueOf(sentenceCount));
            txtJumlahParagraf.setText(String.valueOf(paragraphCount));
            
         }
    }//GEN-LAST:event_jTextArea1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(penghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penghitungKataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lblCari;
    private javax.swing.JTextField lblJumlahKalimat;
    private javax.swing.JTextField lblJumlahKarakter;
    private javax.swing.JTextField txtJumlahKata;
    private javax.swing.JTextField txtJumlahParagraf;
    // End of variables declaration//GEN-END:variables
}
