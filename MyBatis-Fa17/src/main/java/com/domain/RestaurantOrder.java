package com.domain;

import java.util.Date;

public class RestaurantOrder {
    private Short ono;

    private Date orderdate;

    private String custemail;

    private String orderdineinflag;

    private String orderdeliveryflag;

    private String orderpickupflag;

    private Date orderpickupdate;

    private Date orderdeliverydate;

    private Date orderdineinreceiveddate;

    public Short getOno() {
        return ono;
    }

    public void setOno(Short ono) {
        this.ono = ono;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getOrderdineinflag() {
        return orderdineinflag;
    }

    public void setOrderdineinflag(String orderdineinflag) {
        this.orderdineinflag = orderdineinflag;
    }

    public String getOrderdeliveryflag() {
        return orderdeliveryflag;
    }

    public void setOrderdeliveryflag(String orderdeliveryflag) {
        this.orderdeliveryflag = orderdeliveryflag;
    }

    public String getOrderpickupflag() {
        return orderpickupflag;
    }

    public void setOrderpickupflag(String orderpickupflag) {
        this.orderpickupflag = orderpickupflag;
    }

    public Date getOrderpickupdate() {
        return orderpickupdate;
    }

    public void setOrderpickupdate(Date orderpickupdate) {
        this.orderpickupdate = orderpickupdate;
    }

    public Date getOrderdeliverydate() {
        return orderdeliverydate;
    }

    public void setOrderdeliverydate(Date orderdeliverydate) {
        this.orderdeliverydate = orderdeliverydate;
    }

    public Date getOrderdineinreceiveddate() {
        return orderdineinreceiveddate;
    }

    public void setOrderdineinreceiveddate(Date orderdineinreceiveddate) {
        this.orderdineinreceiveddate = orderdineinreceiveddate;
    }
}