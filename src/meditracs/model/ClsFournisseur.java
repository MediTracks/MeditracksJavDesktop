/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meditracs.model;

import meditracs.Controller.IActionManager;

/**
 *
 * @author Brain
 */
public class ClsFournisseur  implements IActionManager{
    private String code_fournisseur, noms_fournisseur, adresse_fournisseur, telephone_fournisseur, mail_fournisseur;

    public ClsFournisseur() {
    }

    public ClsFournisseur(String code_fournisseur, String noms_fournisseur, String adresse_fournisseur, String telephone_fournisseur, String mail_fournisseur) {
        this.code_fournisseur = code_fournisseur;
        this.noms_fournisseur = noms_fournisseur;
        this.adresse_fournisseur = adresse_fournisseur;
        this.telephone_fournisseur = telephone_fournisseur;
        this.mail_fournisseur = mail_fournisseur;
    }

    public String getCode_fournisseur() {
        return code_fournisseur;
    }

    public void setCode_fournisseur(String code_fournisseur) {
        this.code_fournisseur = code_fournisseur;
    }

    public String getNoms_fournisseur() {
        return noms_fournisseur;
    }

    public void setNoms_fournisseur(String noms_fournisseur) {
        this.noms_fournisseur = noms_fournisseur;
    }

    public String getAdresse_fournisseur() {
        return adresse_fournisseur;
    }

    public void setAdresse_fournisseur(String adresse_fournisseur) {
        this.adresse_fournisseur = adresse_fournisseur;
    }

    public String getTelephone_fournisseur() {
        return telephone_fournisseur;
    }

    public void setTelephone_fournisseur(String telephone_fournisseur) {
        this.telephone_fournisseur = telephone_fournisseur;
    }

    public String getMail_fournisseur() {
        return mail_fournisseur;
    }

    public void setMail_fournisseur(String mail_fournisseur) {
        this.mail_fournisseur = mail_fournisseur;
    }
    
    @Override
    public boolean Enregsitrer() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Supprimer() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
