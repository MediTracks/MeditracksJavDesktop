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
    private String code_produit;
    private float qte;
    private String alerte_level;
    private Date date_commande;
    private String id_structure;

    public ClsCommandes() {
    }

    public ClsCommandes(String code_produit, float qte, String alerte_level, Date date_commande, String id_structure) {
        this.code_produit = code_produit;
        this.qte = qte;
        this.alerte_level = alerte_level;
        this.date_commande = date_commande;
        this.id_structure = id_structure;
    }

    public String getId_structure() {
        return id_structure;
    }

    public void setId_structure(String id_structure) {
        this.id_structure = id_structure;
    }

    
    
    public String getCode_produit() {
        return code_produit;
    }

    public void setCode_produit(String code_produit) {
        this.code_produit = code_produit;
    }

    public float getQte() {
        return qte;
    }

    public void setQte(float qte) {
        this.qte = qte;
    }

    public String getAlerte_level() {
        return alerte_level;
    }

    public void setAlerte_level(String alerte_level) {
        this.alerte_level = alerte_level;
    }

    public Date getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(Date date_commande) {
        this.date_commande = date_commande;
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
