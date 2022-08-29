package com.example.app7;

import java.io.Serializable;

public class phone implements Serializable {
    private String phoneName;
    private String phoneBrand;
    private int phoneImage;

    public phone(String phoneName, String phoneBrand, int phoneImage) {
        this.phoneName = phoneName;
        this.phoneBrand = phoneBrand;
        this.phoneImage = phoneImage;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneBrand() {

        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }


    public int getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(int phoneImage) {
        this.phoneImage = phoneImage;
    }
}


