/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_ReshaYuana;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class delete {
    Koneksi konek = new Koneksi();
   

    public void delete(String nik ) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql = "delete from datakaryawan where nik ='" + nik + "'";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
