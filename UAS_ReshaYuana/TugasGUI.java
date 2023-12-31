/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS_ReshaYuana;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import static net.proteanit.sql.DbUtils.resultSetToTableModel;

public class TugasGUI extends javax.swing.JFrame {

    /**
     * Creates new form TugasGUI
     */
    public TugasGUI() { //konstruktor
        initComponents();
        this.setTitle("Data Karyawan");
        this.setLocationRelativeTo(this);

        ButtonGroup bG = new ButtonGroup();
        bG.add(inlakilaki);
        bG.add(inperempuan);

        Koneksi konek = new Koneksi();
        konek.koneksi();
        this.statuskoneksi.setText(konek.statuskoneksi);
        table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NIK = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        innik = new javax.swing.JTextField();
        innama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        inalamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inemail = new javax.swing.JTextField();
        innohp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jeniskelamin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        statuskoneksi = new javax.swing.JTextField();
        injabatan = new javax.swing.JComboBox<>();
        inlakilaki = new javax.swing.JRadioButton();
        inperempuan = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        incari = new javax.swing.JTextField();
        inpencarian = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NIK.setText("NIK");

        jLabel2.setText("Nama Karyawan");

        jbt.setText("Jabatan");

        jLabel4.setText("Alamat");

        inalamat.setColumns(20);
        inalamat.setRows(5);
        jScrollPane1.setViewportView(inalamat);

        jLabel5.setText("Email");

        jLabel6.setText("No. Telepon");

        innohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                innohpActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel7.setText("DATA KARYAWAN");

        jeniskelamin.setText("Jenis Kelamin");

        jLabel9.setText("Status Koneksi");

        statuskoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statuskoneksiActionPerformed(evt);
            }
        });

        injabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Manager", "Marketing", "Room Division", "Food & Baverage", "HRD", "Security" }));
        injabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                injabatanActionPerformed(evt);
            }
        });

        inlakilaki.setText("Laki - Laki");
        inlakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inlakilakiActionPerformed(evt);
            }
        });

        inperempuan.setText("Perempuan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jbt)
                                                        .addComponent(jLabel4))
                                                    .addGap(136, 136, 136))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(NIK, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(147, 147, 147)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(112, 112, 112)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(innohp)
                                    .addComponent(inemail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(innik, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(innama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(injabatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(inlakilaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(inperempuan))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButton3)
                                .addGap(32, 32, 32)
                                .addComponent(jButton4)
                                .addGap(31, 31, 31)
                                .addComponent(jButton5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NIK, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(innik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(innama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniskelamin)
                    .addComponent(inlakilaki)
                    .addComponent(inperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(injabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(inemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(innohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5)))
                            .addComponent(jLabel4)))
                    .addComponent(jbt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(statuskoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Input Data Karyawan", jPanel1);

        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Alamat", "Email", "No. Telepon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbdata.setToolTipText("");
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdata);

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        incari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incariActionPerformed(evt);
            }
        });

        inpencarian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "~~pilih pencarian~~", "NIK", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Alamat", "Email", "No. Telepon", " " }));
        inpencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpencarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(incari, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(incari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Data Karyawan", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Statement pst;
    ResultSet rs;

    public void table() {
        Koneksi konek = new Koneksi();
        konek.koneksi();
        try {
            String sql = "SELECT nik, nama, jk, jabatan, alamat, email, nohp from datakaryawan";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void selectBynik(String nik) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where nik like '%" + nik + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectBynama(String nama) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where nama like '%" + nama + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByjk(String jk) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where jk like '%" + jk + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByjabatan(String jabatan) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where jabatan like '%" + jabatan + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByalamat(String alamat) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where alamat like '%" + alamat + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectByemail(String email) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where email like '%" + email + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void selectBynohp(String nohp) {
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where nohp like '%" + nohp + "%'";
            pst = konek.con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbdata.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void innohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_innohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_innohpActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        insert2 in = new insert2();

        String jk = "";
        if (inlakilaki.isSelected()) {
            jk = "Laki - Laki";
        } else if (inperempuan.isSelected()) {
            jk = "Perempuan";
        }

        String jabatan = "";
        if (injabatan.getSelectedIndex() == 0) {
            jabatan = "General Manager";
        } else if (injabatan.getSelectedIndex() == 1) {
            jabatan = "Marketing";
        } else if (injabatan.getSelectedIndex() == 2) {
            jabatan = "Room Division";
        } else if (injabatan.getSelectedIndex() == 3) {
            jabatan = "Food & Baverage";
        } else if (injabatan.getSelectedIndex() == 4) {
            jabatan = "HRD";
        } else if (injabatan.getSelectedIndex() == 5) {
            jabatan = "Security";
        } else {
            return;
        }

        int nik = Integer.parseInt(innik.getText());
        String nama = innama.getText();
        String alamat = inalamat.getText();
        String email = inemail.getText();
        String nohp = innohp.getText();

        in.insert2(nik, nama, jk, jabatan, alamat, email, nohp);

        table();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Koneksi konek = new Koneksi();
        konek.koneksi();
        delete del = new delete();
        del.delete(innik.getText());

        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        innik.setText("");
        innama.setText("");
        inalamat.setText("");
        inemail.setText("");
        innohp.setText("");
        inlakilaki.setSelected(false);
        inperempuan.setSelected(false);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Koneksi konek = new Koneksi();
        konek.koneksi();

        String jk = "";
        if (inlakilaki.isSelected()) {
            jk = "L";
        } else if (inperempuan.isSelected()) {
            jk = "P";
        }

        String jabatan = "";
        if (injabatan.getSelectedIndex() == 0) {
            jabatan = "General Manager";
        } else if (injabatan.getSelectedIndex() == 1) {
            jabatan = "Marketing";
        } else if (injabatan.getSelectedIndex() == 2) {
            jabatan = "Room Division";
        } else if (injabatan.getSelectedIndex() == 3) {
            jabatan = "Food & Baverage";
        } else if (injabatan.getSelectedIndex() == 4) {
            jabatan = "HRD";
        } else if (injabatan.getSelectedIndex() == 5) {
            jabatan = "Security";
        } else {
            return;
        }

        int nik = Integer.parseInt(innik.getText());
        String nama = innama.getText();
        String alamat = inalamat.getText();
        String email = inemail.getText();
        String nohp = innohp.getText();

        edit ubah = new edit();
        ubah.edit(nik, nama, jk, jabatan, alamat, email, nohp);

        table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void statuskoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statuskoneksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statuskoneksiActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) tbdata.getModel();
        int selectedRowIndex = tbdata.getSelectedRow();
        int id = (int) dtm.getValueAt(selectedRowIndex, 0);
        Koneksi konek = new Koneksi();
        konek.koneksi();

        try {

            String sql = "select * from datakaryawan where nik like '%" +id+"%'";
            pst = konek.con.prepareStatement(sql);
            ResultSet rs = rs = pst.executeQuery(sql);

            while (rs.next()) {

                innik.setText(rs.getString("nik"));
                innama.setText(rs.getString("nama"));
                inalamat.setText(rs.getString("alamat"));
                inemail.setText(rs.getString("email"));
                innohp.setText(rs.getString("nohp"));
                
                 String jenis = rs.getString("jk");
                if (jenis.equals("L")) {
                    inlakilaki.setSelected(true);
                } else {
                    inperempuan.setSelected(true);
                }
                
                String jab = rs.getString("jabatan");
            injabatan.setSelectedItem(jab);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_tbdataMouseClicked

    private void injabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_injabatanActionPerformed
        // TODO add your handling code here:

        String jabatan = "";
        if (injabatan.getSelectedIndex() == 0) {
            jabatan = "General Manager";
        } else if (injabatan.getSelectedIndex() == 1) {
            jabatan = "Marketing";
        } else if (injabatan.getSelectedIndex() == 2) {
            jabatan = "Room Division";
        } else if (injabatan.getSelectedIndex() == 3) {
            jabatan = "Food & Baverage";
        } else if (injabatan.getSelectedIndex() == 4) {
            jabatan = "HRD";
        } else if (injabatan.getSelectedIndex() == 5) {
            jabatan = "Security";
        } else {
            return;
        }
    }//GEN-LAST:event_injabatanActionPerformed

    private void inlakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inlakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inlakilakiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (inpencarian.getSelectedIndex() == 1) {
            selectBynik(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 2) {
            selectBynama(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 3) {
            selectByjk(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 4) {
            selectByjabatan(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 5) {
            selectByalamat(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 6) {
            selectByemail(incari.getText());
        } else if (inpencarian.getSelectedIndex() == 7) {
            selectBynohp(incari.getText());
        } else {
            table();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void incariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incariActionPerformed

    private void inpencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpencarianActionPerformed

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
            java.util.logging.Logger.getLogger(TugasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TugasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TugasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TugasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIK;
    private javax.swing.JTextArea inalamat;
    private javax.swing.JTextField incari;
    private javax.swing.JTextField inemail;
    private javax.swing.JComboBox<String> injabatan;
    private javax.swing.JRadioButton inlakilaki;
    private javax.swing.JTextField innama;
    private javax.swing.JTextField innik;
    private javax.swing.JTextField innohp;
    private javax.swing.JComboBox<String> inpencarian;
    private javax.swing.JRadioButton inperempuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jbt;
    private javax.swing.JLabel jeniskelamin;
    private javax.swing.JTextField statuskoneksi;
    private javax.swing.JTable tbdata;
    // End of variables declaration//GEN-END:variables
}
