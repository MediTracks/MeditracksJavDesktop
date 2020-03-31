/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import meditracs.Controller.IActionManager;

/**
 *
 * @author Brain
 */
public class ClsTransporteur  implements IActionManager{
    private String code_transporteur, descr_transporteur, num_phone, adresse_transporteur;

    public ClsTransporteur() {
    }

    public ClsTransporteur(String code_transporteur, String descr_transporteur, String num_phone, String adresse_transporteur) {
        this.code_transporteur = code_transporteur;
        this.descr_transporteur = descr_transporteur;
        this.num_phone = num_phone;
        this.adresse_transporteur = adresse_transporteur;
    }

    public String getCode_transporteur() {
        return code_transporteur;
    }

    public void setCode_transporteur(String code_transporteur) {
        this.code_transporteur = code_transporteur;
    }

    public String getDescr_transporteur() {
        return descr_transporteur;
    }

    public void setDescr_transporteur(String descr_transporteur) {
        this.descr_transporteur = descr_transporteur;
    }

    public String getNum_phone() {
        return num_phone;
    }

    public void setNum_phone(String num_phone) {
        this.num_phone = num_phone;
    }

    public String getAdresse_transporteur() {
        return adresse_transporteur;
    }

    public void setAdresse_transporteur(String adresse_transporteur) {
        this.adresse_transporteur = adresse_transporteur;
    }

    @Override
    public boolean Enregsitrer() throws Exception {
        return Controller.ClsUpdate_Model.EnregistrerData(this); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Supprimer() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
