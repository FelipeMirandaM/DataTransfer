package com.eve.project.datatransfer.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class ItemMaterial {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonIgnore
    private long id;

    private String name;

    private int TypeId;

    @ManyToOne
    @JsonBackReference
    private BpoInfo bpoInfo;

    private int quantity;

    public ItemMaterial() {
    }

    public ItemMaterial(long id, String name, int typeId, BpoInfo bpoInfo, int quantity) {
        this.id = id;
        this.name = name;
        TypeId = typeId;
        this.bpoInfo = bpoInfo;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public BpoInfo getBpoInfo() {
        return bpoInfo;
    }

    public void setBpoInfo(BpoInfo bpoInfo) {
        this.bpoInfo = bpoInfo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
