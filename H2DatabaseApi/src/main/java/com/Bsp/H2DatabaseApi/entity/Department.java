package com.Bsp.H2DatabaseApi.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "Deparment_Table")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int departmentId;
    private String deparmentName;
    private String departmentAddress;
    private String departmentCode;

    public Department(String departmentCode, String departmentAddress, String deparmentName) {
        this.departmentCode = departmentCode;
        this.departmentAddress = departmentAddress;
        this.deparmentName = deparmentName;
    }

    public Department() {}

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", deparmentName='" + deparmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }
}
