/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.DetailContractModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author netprtony
 */
public class DetailContractDAO {
    public List<DetailContractModel> readAllByIdContract(int id){
        List<DetailContractModel> lst = new ArrayList<>();
        try {
            String  sql = "select s.Serv_Name, dc.quantity from DETAIL_CONTRACTS dc left join SERVICES s \n" +
                            "on dc.Serv_ID = s.Serv_ID where dc.Contr_ID = ?";
            Connection con = DBConnect.openConnection();
            Statement stm = con.createStatement();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = stm.executeQuery(sql);
            lst.clear();
            while (rs.next()) {                
                DetailContractModel del = new DetailContractModel();
                del.setSerID(rs.getInt("Serv_Name"));
                del.setQuantity(rs.getInt("quantity"));
                lst.add(del);
            }
        } catch (Exception e) {
            Logger.getLogger(DetailContractModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return lst;
    }
    public List<DetailContractModel> FindByIdContract(int id){
        List<DetailContractModel> lst = new ArrayList<>();
        try {
            String sql = "select * from DETAIL_CONTRACTS where Contr_ID = ?";
            Connection con = DBConnect.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            lst.clear();
            while(rs.next()){
                DetailContractModel del = new DetailContractModel();
                del.setContrID(rs.getInt("Contr_ID"));
                del.setSerID(rs.getInt("Serv_ID"));
                del.setQuantity(rs.getInt("quantity"));

                lst.add(del);
            }
        } catch (Exception e) {
            Logger.getLogger(DetailContractModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return lst;
    }
    public int add(DetailContractModel de){
        try {
            String sql=  "insert into DETAIL_CONTRACTS"
                    + "(Contr_ID, Serv_ID, quantity) "
                    + "values "
                    + "(?, ?, ?)";
            Connection con = DBConnect.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, de.getContrID());
            pstm.setInt(2, de.getSerID());
            pstm.setInt(3, de.getQuantity());
            return pstm.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(DetailContractModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }
    public int delete(int idCon, int idSer){
        try {
            String sql = "delete DETAIL_CONTRACTS where Contr_ID = ? and Ser_ID = ?";
            Connection con = DBConnect.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, idCon);
            pstm.setInt(2, idSer);
            return pstm.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(DetailContractModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }
    public int update(DetailContractModel de){
        try{
            String sql = "update DETAIL_CONTRACTS set "
                    + "Serv_ID = ?,"
                    + "quantity = ?"
                    + " where Contr_ID = ?";
            Connection con = DBConnect.openConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, de.getSerID());
            pstm.setInt(2, de.getQuantity());
            pstm.setInt(3, de.getContrID());
            return pstm.executeUpdate();
        } catch (Exception e){
            Logger.getLogger(DetailContractModel.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }
}
