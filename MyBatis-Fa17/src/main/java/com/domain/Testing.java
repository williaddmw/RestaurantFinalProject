package com.domain;

public class Testing {
	
    private String firstname;
    private String lastname;
    private String gender;
    private boolean sendpromos;
    private boolean preferemail;
    private boolean preferphone;
    private boolean prefersurface;
    
    public Testing() {
		super();
	}
    
    public String getFirstname() {
        return firstname;
    }
  
    public void setFirstname(String FirstName) {
        this.firstname = FirstName;
    }
    
    public String geLastname() {
        return lastname;
    }
  
    public void setLastname(String LastName) {
        this.lastname = LastName;
    }
    public String getGender() {
        return gender;
    }
  
    public void setSendpromos(boolean SendPromos) {
        this.sendpromos = SendPromos;
    }
    
    public boolean getSendpromos() {
        return sendpromos;
    }
  
    public void setPreferemail(boolean PreferEmail) {
        this.preferemail = PreferEmail;
    }
    
    public boolean getPreferemail() {
        return preferemail;
    }
    
    public void setPreferphone(boolean PreferPhone) {
        this.preferphone = PreferPhone;
    }
    
    public boolean getpreferPhone() {
        return preferphone;
    }
    
    public void setPrefersurface(boolean PreferSurface) {
        this.prefersurface = PreferSurface;
    }
    
    public boolean getPreferfurface() {
        return prefersurface;
    }    

}