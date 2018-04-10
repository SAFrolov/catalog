/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.service;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import com.spec.model.*;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.sql.DataSource;

/**
 *
 * @author s.frolov
 */
@Singleton
public class ProductCatalogBean {
    
    @Resource(lookup="jibc/PosgretDS")
    DataSource ds;
    
    //select *from product_category where id=1
    //
    
    public  void intit(){
        System.out.println("ProductCatalogBean.init");
    }
    
    public Category getCategory(Long id){
        System.out.println("PrintCatalogBean.getID");
        final String q="select id, code, name, creation_date from  product_category where id=?";
        try (
            Connection c = ds.getConnection();
            PreparedStatement ps = createCatagoryStatment(c, q, id);
            ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                //Long id = rs.getLong(1);
//                String code = rs.getString(2);
//                String name = rs.getString(3);
                Date dt = rs.getTimestamp(4);
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss");
                System.out.println(formatForDateNow.format(dt));
                
//                System.out.println("code=" +code);
//                System.out.println("name=" + name);
//                System.out.println("date = " + dt);
                return new Category(rs.getLong(1), rs.getString(2), rs.getString(3), formatForDateNow.format(dt));//rs.getTimestamp(4));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return null;
    }
    

    private static PreparedStatement createCatagoryStatment (Connection c, String q, final Long id) throws SQLException{
        PreparedStatement ps = c.prepareStatement(q);
        ps.setLong(1, id);
        return ps;
    }
    
    public List<Category> getCategorys(){
        System.out.println("ProductCatalogbeen.getCatalogies");
        final List<Category> listCan = new ArrayList<>(10);
        final String q="select id, code, name, creation_date from  product_category";
        
        try (
            Connection c = ds.getConnection();
            PreparedStatement st= c.prepareStatement(q);
            ResultSet rs = st.executeQuery()){
            while(rs.next()){
                Date dt = rs.getTimestamp(4);
                SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss");
                listCan.add(new Category(rs.getLong(1), rs.getString(2), rs.getString(3), formatForDateNow.format(dt))); //rs.getTimestamp(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return listCan;   
    }
    
    public void createCategory(Category categ){
        System.out.println("ProductCatigory.create");
        final String q="insert into product_category (code,name) values ('" + categ.getCode() + "', '" + categ.getName() + "')";
        try (
        Connection c = ds.getConnection();
        PreparedStatement st = c.prepareStatement(q)){
        st.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteCategory(Long id){
        System.out.println("Deleted!");
        final String q = "DELETE FROM product_category WHERE id = '" + id + "'";
        try (
        Connection c = ds.getConnection();
        PreparedStatement st = c.prepareStatement(q)){
        st.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
}
