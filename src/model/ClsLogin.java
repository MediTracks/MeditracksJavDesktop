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
public class ClsLogin implements IActionManager {
    private String nom_utilisateur, mot_de_passe, niveau_acces;

    public ClsLogin() {
    }

    public ClsLogin(String nom_utilisateur, String mot_de_passe, String niveau_acces) {
        this.nom_utilisateur = nom_utilisateur;
        this.mot_de_passe = mot_de_passe;
        this.niveau_acces = niveau_acces;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getNiveau_acces() {
        return niveau_acces;
    }

    public void setNiveau_acces(String niveau_acces) {
        this.niveau_acces = niveau_acces;
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
