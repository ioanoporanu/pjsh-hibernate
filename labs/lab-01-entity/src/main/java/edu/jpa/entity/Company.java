package edu.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Company")
@SecondaryTable(name = "CompanyDetail")
@PrimaryKeyJoinColumn(name = "Company_id", referencedColumnName = "Company_id")
public class Company {
    @Column(name="Company_id", table="Company")
    @Id
    private int id;
    @Column(name="Company_name", table="Company")
    private String name;
    @Column(name="Company_address", table="Company")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
