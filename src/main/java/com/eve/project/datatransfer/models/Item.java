package com.eve.project.datatransfer.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.io.Serializable;
import java.util.List;


@Entity
public class Item implements Serializable{

    @Id
    private int typeId;


    @Column
    private double volume;

    @Column(name = "typeName")
    private String name;

    @OneToMany(mappedBy = "outPutTypeId")
    @JsonManagedReference
    private List<BpoInfo> bpoInfo;

    public Item() {
    }

    public Item(int typeId, double volume, String name, List<BpoInfo> bpoInfo) {
        this.typeId = typeId;
        this.volume = volume;
        this.name = name;
        this.bpoInfo = bpoInfo;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BpoInfo> getBpoInfo() {
        return bpoInfo;
    }

    public void setBpoInfo(List<BpoInfo> bpoInfo) {
        this.bpoInfo = bpoInfo;
    }
}
