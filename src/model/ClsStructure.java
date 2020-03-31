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
public class ClsStructure  implements IActionManager{
    private String id_structure, descr_structure,adresse, telephone;
    private ClsZone zone;

    public ClsStructure() {
    }

    public ClsStructure(String id_structure, String descr_structure, String adresse, String telephone, ClsZone zone) {
        this.id_structure = id_structure;
        this.descr_structure = descr_structure;
        this.adresse = adresse;
        this.telephone = telephone;
        this.zone = zone;
    }

    public String getId_structure() {
        return id_structure;
    }

    public void setId_structure(String id_structure) {
        this.id_structure = id_structure;
    }

    public String getDescr_structure() {
        return descr_structure;
    }

    public void setDescr_structure(String descr_structure) {
        this.descr_structure = descr_structure;
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

    public ClsZone getZone() {
        return zone;
    }

    public void setZone(ClsZone zone) {
        this.zone = zone;
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
