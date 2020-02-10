/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meditracs.model;

import java.sql.Date;
import meditracs.Controller.IActionManager;

/**
 *
 * @author Brain
 */
public class ClsAgent  implements IActionManager{
    private String matricule_agent, noms_agent, adresse, telephone, fonction;
    private Date date_naissance;

    public ClsAgent() {
    }

    public ClsAgent(String matricule_agent, String noms_agent, String adresse, String telephone, String fonction, Date date_naissance) {
        this.matricule_agent = matricule_agent;
        this.noms_agent = noms_agent;
        this.adresse = adresse;
        this.telephone = telephone;
        this.fonction = fonction;
        this.date_naissance = date_naissance;
    }

    public String getMatricule_agent() {
        return matricule_agent;
    }

    public void setMatricule_agent(String matricule_agent) {
        this.matricule_agent = matricule_agent;
    }

    public String getNoms_agent() {
        return noms_agent;
    }

    public void setNoms_agent(String noms_agent) {
        this.noms_agent = noms_agent;
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

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
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
