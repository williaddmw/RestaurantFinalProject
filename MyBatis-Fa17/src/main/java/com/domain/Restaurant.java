package com.domain;

public class Restaurant {
    private Short restid;

    private String rname;

    private String phone;

    private String email;

    private String hours;

    private String diningtype;

    private Integer streetno;

    private String streetname;

    private String city;

    private String state;

    private Long zip;

    private String pricerange;

    private String deliveryflag;

    private String outdoorseatingflag;

    public Short getRestid() {
        return restid;
    }

    public void setRestid(Short restid) {
        this.restid = restid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getDiningtype() {
        return diningtype;
    }

    public void setDiningtype(String diningtype) {
        this.diningtype = diningtype;
    }

    public Integer getStreetno() {
        return streetno;
    }

    public void setStreetno(Integer streetno) {
        this.streetno = streetno;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getZip() {
        return zip;
    }

    public void setZip(Long zip) {
        this.zip = zip;
    }

    public String getPricerange() {
        return pricerange;
    }

    public void setPricerange(String pricerange) {
        this.pricerange = pricerange;
    }

    public String getDeliveryflag() {
        return deliveryflag;
    }

    public void setDeliveryflag(String deliveryflag) {
        this.deliveryflag = deliveryflag;
    }

    public String getOutdoorseatingflag() {
        return outdoorseatingflag;
    }

    public void setOutdoorseatingflag(String outdoorseatingflag) {
        this.outdoorseatingflag = outdoorseatingflag;
    }
}