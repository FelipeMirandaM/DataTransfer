package com.eve.project.datatransfer.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BpoInfo {

    @Id
    private int typeId;

    private String name;

    private int outPutQuantity;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "typeIdMaterial")
    @JsonBackReference
    private Item outPutTypeId;

    @OneToMany(mappedBy = "bpoInfo")
    @JsonManagedReference
    private List<ItemMaterial> materialList;

    public BpoInfo() {
    }

    public BpoInfo(int typeId, String name, int outPutQuantity, Item outPutTypeId, List<ItemMaterial> materialList) {
        this.typeId = typeId;
        this.name = name;
        this.outPutQuantity = outPutQuantity;
        this.outPutTypeId = outPutTypeId;
        this.materialList = materialList;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOutPutQuantity() {
        return outPutQuantity;
    }

    public void setOutPutQuantity(int outPutQuantity) {
        this.outPutQuantity = outPutQuantity;
    }

    public Item getOutPutTypeId() {
        return outPutTypeId;
    }

    public void setOutPutTypeId(Item outPutTypeId) {
        this.outPutTypeId = outPutTypeId;
    }

    public List<ItemMaterial> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<ItemMaterial> materialList) {
        this.materialList = materialList;
    }
}
