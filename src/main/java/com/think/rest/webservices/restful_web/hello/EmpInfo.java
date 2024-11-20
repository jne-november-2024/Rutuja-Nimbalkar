package com.think.rest.webservices.restful_web.hello;

public class EmpInfo {
    private String name;
    private String address;

    public EmpInfo(String name, String address) {
        this.name = name;
        this.address = address;
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

    @Override
    public String toString() {
        return "EmpInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
