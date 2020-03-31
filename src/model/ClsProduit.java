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
public class ClsProduit  implements IActionManager{
    private String code_produit, designation_produit;
    private ClsCategorie_Prod categorie_Prod;

    public ClsProduit() {
    }

    public ClsProduit(String code_produit, String designation_produit, ClsCategorie_Prod categorie_Prod) {
        this.code_produit = code_produit;
        this.designation_produit = designation_produit;
        this.categorie_Prod = categorie_Prod;
    }

    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public String getDesignation_produit() {
        return designation_produit;
    }

    public void setDesignation_produit(String designation_produit) {
        this.designation_produit = designation_produit;
    }

    public ClsCategorie_Prod getCategorie_Prod() {
        return categorie_Prod;
    }

    public void setCategorie_Prod(ClsCategorie_Prod categorie_Prod) {
        this.categorie_Prod = categorie_Prod;
    }
    
    @Override
    public boolean Enregsitrer() throws Exception {
        return Controller.ClsUpdate_Model.EnregistrerData(this);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Supprimer() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
