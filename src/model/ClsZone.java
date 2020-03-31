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
public class ClsZone  implements IActionManager{
    private String id_zone, descr_zone, adresse, telephone;
    private ClsVille ville;

    public ClsZone() {
    }

    public ClsZone(String id_zone, String descr_zone, String adresse, String telephone, ClsVille ville) {
        this.id_zone = id_zone;
        this.descr_zone = descr_zone;
        this.adresse = adresse;
        this.telephone = telephone;
        this.ville = ville;
    }

    public String getId_zone() {
        return id_zone;
    }

    public void setId_zone(String id_zone) {
        this.id_zone = id_zone;
    }

    public String getDescr_zone() {
        return descr_zone;
    }

    public void setDescr_zone(String descr_zone) {
        this.descr_zone = descr_zone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ClsVille getVille() {
        return ville;
    }

    public void setVille(ClsVille ville) {
        this.ville = ville;
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
