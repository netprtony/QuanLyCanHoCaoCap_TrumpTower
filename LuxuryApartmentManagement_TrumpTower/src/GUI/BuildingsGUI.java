/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package GUI;
import DAO.ApartmentDAO;
import DAO.BuildingDAO;
import MODEL.ApartmentModel;
import MODEL.BuildingModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author netprtony
 */
public class BuildingsGUI extends javax.swing.JFrame {
    List<BuildingModel> lstBui = new ArrayList<>();
    DefaultTableModel tblModel  = new DefaultTableModel();
    int index = 0;
    /**
     * Creates new form Home
     */
    public BuildingsGUI() {
        initComponents();
        fillDataTableCurrent();
    }
    public void fillDataTableCurrent(){
        BuildingDAO Buidao = new BuildingDAO();
        lstBui = Buidao.readAll();
        tblModel = (DefaultTableModel) tbl_buiDettail.getModel();
        tblModel.setRowCount(0);
        for(BuildingModel b : lstBui){
            Object[] r = new Object[]{
                b.getId(),
                b.getAddress(),
                b.getName(),
                b.getDescribe()
            };
            tblModel.addRow(r);
        }
        tbl_buiDettail.setModel(tblModel);
    }
    public void FillTableApartment(){
        ApartmentDAO dao = new ApartmentDAO();
        List<ApartmentModel> lst = new ArrayList<>();
        ApartmentModel apr = new ApartmentModel();
        lst = dao.readAll();
        tblModel = (DefaultTableModel) tbl_BuiToApar.getModel();
        tblModel.setRowCount(0);
        for(BuildingModel b : lstBui){
            Object[] r = new Object[]{b};
            tblModel.addRow(r);
        }
        tbl_BuiToApar.setModel(tblModel);
    }
   
    public void clearForm(){
        tf_bui_id.setText("");
        tf_bui_Adres.setText("");
        tf_bui_name.setText("");
        tf_bui_des.setText("");
        tf_bui_id.requestFocus();
    }
    public void showForm(){
        index = tbl_buiDettail.getSelectedRow();
        if(index  < 0 ){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn 1 dòng trên bảng này!");
            return;
        }else{
            BuildingModel b = new BuildingModel();
            b = lstBui.get(index);
            tf_bui_id.setText(b.getId());
            tf_bui_Adres.setText(b.getAddress());
            tf_bui_des.setText(b.getDescribe());
            tf_bui_name.setText(b.getName());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tf_bui_des = new javax.swing.JTextArea();
        tf_bui_id = new javax.swing.JTextField();
        tf_bui_Adres = new javax.swing.JTextField();
        tf_bui_name = new javax.swing.JTextField();
        btn_bui_add = new javax.swing.JButton();
        btn_bui_update = new javax.swing.JButton();
        btn_bui_del = new javax.swing.JButton();
        btn_bui_new = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buiDettail = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tf_bui_inputSearch = new javax.swing.JTextField();
        btn_bui_search = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_BuiToApar = new javax.swing.JTable();

        popupMenu1.setLabel("popupMenu1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)), "BUILDING", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Properties"));

        jLabel1.setText("ID");

        jLabel2.setText("Address");

        jLabel3.setText("Name");

        jLabel4.setText("Describe");

        tf_bui_des.setColumns(20);
        tf_bui_des.setRows(5);
        tf_bui_des.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        jScrollPane3.setViewportView(tf_bui_des);

        tf_bui_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        tf_bui_id.setCaretColor(new java.awt.Color(102, 0, 0));

        tf_bui_Adres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        tf_bui_Adres.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_bui_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_bui_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));

        btn_bui_add.setBackground(new java.awt.Color(102, 0, 0));
        btn_bui_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bui_add.setForeground(new java.awt.Color(204, 153, 0));
        btn_bui_add.setText("Add");
        btn_bui_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bui_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bui_addActionPerformed(evt);
            }
        });

        btn_bui_update.setBackground(new java.awt.Color(102, 0, 0));
        btn_bui_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bui_update.setForeground(new java.awt.Color(204, 153, 0));
        btn_bui_update.setText("Change");
        btn_bui_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bui_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bui_updateActionPerformed(evt);
            }
        });

        btn_bui_del.setBackground(new java.awt.Color(102, 0, 0));
        btn_bui_del.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bui_del.setForeground(new java.awt.Color(204, 153, 0));
        btn_bui_del.setText("Delete");
        btn_bui_del.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bui_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bui_delActionPerformed(evt);
            }
        });

        btn_bui_new.setBackground(new java.awt.Color(102, 0, 0));
        btn_bui_new.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bui_new.setForeground(new java.awt.Color(204, 153, 0));
        btn_bui_new.setText("New");
        btn_bui_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bui_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bui_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(tf_bui_id)
                            .addComponent(tf_bui_Adres)
                            .addComponent(tf_bui_name)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_bui_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_bui_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bui_del, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bui_new, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bui_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bui_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_bui_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bui_add)
                    .addComponent(btn_bui_update)
                    .addComponent(btn_bui_del)
                    .addComponent(btn_bui_new))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "All Building"));

        tbl_buiDettail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbl_buiDettail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Address", "Name", "Describe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_buiDettail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_buiDettailMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_buiDettail);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search"));

        tf_bui_inputSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_bui_inputSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 0, 0)));
        tf_bui_inputSearch.setCaretColor(new java.awt.Color(102, 0, 0));

        btn_bui_search.setBackground(new java.awt.Color(102, 0, 0));
        btn_bui_search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bui_search.setForeground(new java.awt.Color(204, 153, 0));
        btn_bui_search.setText("Search");
        btn_bui_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bui_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bui_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_bui_inputSearch)
                .addGap(18, 18, 18)
                .addComponent(btn_bui_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_bui_inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bui_search))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "All apartments"));

        tbl_BuiToApar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbl_BuiToApar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Number", "Acreage", "Price", "Floor", "Available"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbl_BuiToApar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buildings", jPanel1);

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bui_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bui_searchActionPerformed
        // TODO add your handling code here:
        BuildingDAO buiDao = new BuildingDAO();
        String name = tf_bui_inputSearch.getText();
        lstBui = buiDao.FindByName(name);
        tblModel = (DefaultTableModel) tbl_buiDettail.getModel();
        tblModel.setRowCount(0);
        for(BuildingModel b : lstBui){
            Object[] r = new Object[]{
                b.getId(), b.getAddress(), b.getName(), b.getDescribe()
            };
            tbl_buiDettail.setModel(tblModel);
        }
        BuildingModel b = new BuildingModel();
    }//GEN-LAST:event_btn_bui_searchActionPerformed

    private void tbl_buiDettailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_buiDettailMouseClicked
         FillTableApartment();
    }//GEN-LAST:event_tbl_buiDettailMouseClicked

    private void btn_bui_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bui_newActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btn_bui_newActionPerformed

    private void btn_bui_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bui_delActionPerformed
        BuildingDAO buidao = new BuildingDAO();
        int x = buidao.delete(tf_bui_id.getText());
        if(x > 0 ){
            fillDataTableCurrent();
            JOptionPane.showMessageDialog(this, "Đã xóa thành công");
            clearForm();
        }else{
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_btn_bui_delActionPerformed

    private void btn_bui_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bui_updateActionPerformed
        BuildingDAO buidao = new BuildingDAO();
        BuildingModel b = new BuildingModel();
        b.setId(tf_bui_id.getText());
        b.setAddress(tf_bui_Adres.getText());
        b.setName(tf_bui_name.getText());
        b.setDescribe(tf_bui_des.getText());
        int x = buidao.update(b);
        if(x > 0){
            JOptionPane.showMessageDialog(this, "Đã sửa thành công");
            fillDataTableCurrent();
        }else{
            JOptionPane.showMessageDialog(this, "Sửa thất bại");
        }
    }//GEN-LAST:event_btn_bui_updateActionPerformed

    private void btn_bui_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bui_addActionPerformed
        BuildingDAO buidao = new BuildingDAO();
        BuildingModel bui = new BuildingModel();
        bui.setId(tf_bui_id.getText());
        bui.setAddress(tf_bui_Adres.getText());
        bui.setName(tf_bui_name.getText());
        bui.setDescribe(tf_bui_des.getText());
        int x = buidao.add(bui);
        if(x > 0){
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            fillDataTableCurrent();
        }else{
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_btn_bui_addActionPerformed

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
            java.util.logging.Logger.getLogger(BuildingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildingsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildingsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bui_add;
    private javax.swing.JButton btn_bui_del;
    private javax.swing.JButton btn_bui_new;
    private javax.swing.JButton btn_bui_search;
    private javax.swing.JButton btn_bui_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tbl_BuiToApar;
    private javax.swing.JTable tbl_buiDettail;
    private javax.swing.JTextField tf_bui_Adres;
    private javax.swing.JTextArea tf_bui_des;
    private javax.swing.JTextField tf_bui_id;
    private javax.swing.JTextField tf_bui_inputSearch;
    private javax.swing.JTextField tf_bui_name;
    // End of variables declaration//GEN-END:variables

   
   

}
