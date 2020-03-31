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
public class ClsCategorie_Prod  implements IActionManager{
    private String code_categorie, designation_categorie;

    public ClsCategorie_Prod() {
    }

    public ClsCategorie_Prod(String code_categorie, String designation_categorie) {
        this.code_categorie = code_categorie;
        this.designation_categorie = designation_categorie;
    }

    public String getCode_categorie() {
        return code_categorie;
    }

    public void setCode_categorie(String code_categorie) {
        this.code_categorie = code_categorie;
    }

    public String getDesignation_categorie() {
        return designation_categorie;
    }

    public void setDesignation_categorie(String designation_categorie) {
        this.designation_categorie = designation_categorie;
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
