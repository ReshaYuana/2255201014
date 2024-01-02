/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class insert2 {
    Koneksi konek = new Koneksi();
   

    public void insert2(int nik, String nama, String jk, String jabatan, String alamat, String email, String nohp) {
        {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
              String sql = "insert into datakaryawan"+" values('" + nik + "','" + nama + "','" + jk + "','" + jabatan + "','" + alamat + "','" + email + "','" + nohp + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
}
        }
    }
}

