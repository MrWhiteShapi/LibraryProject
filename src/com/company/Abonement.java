package com.company;

import java.util.UUID;

class Abonement{
    private String uniqIdAbonement;
    private Boolean flagIsActive;
    private String ownerId;
    {
        uniqIdAbonement = "idAbonement-" + UUID.randomUUID().toString();
    }

    public boolean isActive(){
        return flagIsActive?(true):(false);
    }
    public void activeAbonement(){
        flagIsActive = true;
    }
    public void cancelAbonement(){
        flagIsActive = false;
    }

    public void setOwnerId(String ownerId){
        this.ownerId = ownerId;
    }
    public String getUniqIdAbonement(){return uniqIdAbonement;}

    public Abonement(){}
}