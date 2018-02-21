package com.domain;

import java.math.BigDecimal;
import java.util.Date;

public class CustReview {
    private Short reviewid;

    private String custemail;

    private Short restid;

    private String reviewtitle;

    private String reviewdescr;

    private Date reviewdate;

    private BigDecimal rating;

    public Short getReviewid() {
        return reviewid;
    }

    public void setReviewid(Short reviewid) {
        this.reviewid = reviewid;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public Short getRestid() {
        return restid;
    }

    public void setRestid(Short restid) {
        this.restid = restid;
    }

    public String getReviewtitle() {
        return reviewtitle;
    }

    public void setReviewtitle(String reviewtitle) {
        this.reviewtitle = reviewtitle;
    }

    public String getReviewdescr() {
        return reviewdescr;
    }

    public void setReviewdescr(String reviewdescr) {
        this.reviewdescr = reviewdescr;
    }

    public Date getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(Date reviewdate) {
        this.reviewdate = reviewdate;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }
}