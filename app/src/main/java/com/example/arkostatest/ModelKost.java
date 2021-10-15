package com.example.arkostatest;

public class ModelKost {
    private String kostType,kostStars,kostName,kostLeft,kostAddress,kostPrice,kostPricedate;

    public ModelKost(String kostType, String kostStars, String kostName, String kostLeft, String kostAddress, String kostPrice, String kostPricedate) {
        this.kostType = kostType;
        this.kostStars = kostStars;
        this.kostName = kostName;
        this.kostLeft = kostLeft;
        this.kostAddress = kostAddress;
        this.kostPrice = kostPrice;
        this.kostPricedate = kostPricedate;
    }

    public String getKostType() {
        return kostType;
    }

    public void setKostType(String kostType) {
        this.kostType = kostType;
    }

    public String getKostStars() {
        return kostStars;
    }

    public void setKostStars(String kostStars) {
        this.kostStars = kostStars;
    }

    public String getKostName() {
        return kostName;
    }

    public void setKostName(String kostName) {
        this.kostName = kostName;
    }

    public String getKostLeft() {
        return kostLeft;
    }

    public void setKostLeft(String kostLeft) {
        this.kostLeft = kostLeft;
    }

    public String getKostAddress() {
        return kostAddress;
    }

    public void setKostAddress(String kostAddress) {
        this.kostAddress = kostAddress;
    }

    public String getKostPrice() {
        return kostPrice;
    }

    public void setKostPrice(String kostPrice) {
        this.kostPrice = kostPrice;
    }

    public String getKostPricedate() {
        return kostPricedate;
    }

    public void setKostPricedate(String kostPricedate) {
        this.kostPricedate = kostPricedate;
    }
}
