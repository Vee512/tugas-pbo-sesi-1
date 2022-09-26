package pbo_sesi1no1;

import javax.swing.JOptionPane;

public class PBO_SESI1NO2 {
     public static void main(String[] args) {
        String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}
