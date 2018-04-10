/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spec.model;

import java.util.Date;

/**
 *
 * @author s.frolov
 */
public class Category implements java.io.Serializable{
    private Long id;
    private String name;
    private String code;
    private String creatData;    
    //private Date creatData;

    public Category(Long id, String name, String code, String creatData) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.creatData = creatData;
    }

    public Category(String name, String code) {
        this.name = name;
        this.code = code;
    }

    
    
    
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public String getCreatData() {
        return creatData;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setCreatData(String creatData) {
        this.creatData = creatData;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", code=" + code + ", creatData=" + creatData + '}';
    }
    
    
    
}
