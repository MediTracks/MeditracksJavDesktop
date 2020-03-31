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
public class ClsProvince  implements IActionManager{
    private String id_province, description_province;

    public ClsProvince() {
    }

    public ClsProvince(String id_province, String description_province) {
        this.id_province = id_province;
        this.description_province = description_province;
    }

    public String getId_province() {
        return id_province;
    }

    public void setId_province(String id_province) {
        this.id_province = id_province;
    }

    public String getDescription_province() {
        return description_province;
    }

    public void setDescription_province(String description_province) {
        this.description_province = description_province;
    }
    
    @Override
    public boolean Enregsitrer() throws Exception {
        return Controller.ClsUpdate_Model.EnregistrerData(this);
    }

    @Override
    public boolean Supprimer() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
