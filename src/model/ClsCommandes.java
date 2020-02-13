/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Date;


import meditracs.Controller.IActionManager;

/**
 *
 * @author Brain
 */
public class ClsCommandes  implements IActionManager{
    private String concerne_commande;
    private Date date_commande;
    private ClsStructure structure;

    public ClsCommandes() {
    }

    public ClsCommandes(String concerne_commande, Date date_commande, ClsStructure structure) {
        this.concerne_commande = concerne_commande;
        this.date_commande = date_commande;
        this.structure = structure;
    }

    public String getConcerne_commande() {
        return concerne_commande;
    }

    public void setConcerne_commande(String concerne_commande) {
        this.concerne_commande = concerne_commande;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
    }

    public ClsStructure getStructure() {
        return structure;
    }

    public void setStructure(ClsStructure structure) {
        this.structure = structure;
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
