/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_ReshaYuana;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class edit {
    Koneksi konek = new Koneksi();

    public void edit (int nik, String nama, String jk, String jabatan, String alamat,String email, String nohp) 
    {

        try{
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_nama = "update datakaryawan set nama='"+ nama + "'where nik ='" + nik + "'";
            String sql_jk = "update datakaryawan set jk='"+ jk + "'where nik ='" + nik + "'";
            String sql_jabatan = "update datakaryawan set jabatan='"+ jabatan + "'where nik ='" + nik + "'";
            String sql_alamat = "update datakaryawan set alamat='"+ alamat + "'where nik ='" + nik + "'";
            String sql_email = "update datakaryawan set email='"+ email + "'where nik ='" + nik + "'";
            String sql_nohp = "update datakaryawan set nohp='"+ nohp + "'where nik ='" + nik + "'";

            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_jk);
            statement.executeUpdate(sql_jabatan);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_email);
            statement.executeUpdate(sql_nohp);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } 
        catch (Exception ex){
          JOptionPane.showMessageDialog(null,ex);
    }
    }
}   