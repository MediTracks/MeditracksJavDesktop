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
public class ClsApprovisionnement  implements IActionManager{
    private String code_approvisionnement;
    private Date date_approvisionnement, date_fabrication, date_expiration;
    private ClsProduit produit;
    private ClsFournisseur fournisseur;
    private ClsDepot depot;
    private String ugs;
    private double quantite, cout_total;

    public ClsApprovisionnement() {
    }

    public ClsApprovisionnement(String code_approvisionnement, Date date_approvisionnement, Date date_fabrication, Date date_expiration, ClsProduit produit, ClsFournisseur fournisseur, ClsDepot depot, String ugs, double quantite, double cout_total) {
        this.code_approvisionnement = code_approvisionnement;
        this.date_approvisionnement = date_approvisionnement;
        this.date_fabrication = date_fabrication;
        this.date_expiration = date_expiration;
        this.produit = produit;
        this.fournisseur = fournisseur;
        this.depot = depot;
        this.ugs = ugs;
        this.quantite = quantite;
        this.cout_total = cout_total;
    }

    public String getCode_approvisionnement() {
        return code_approvisionnement;
    }

    public void setCode_approvisionnement(String code_approvisionnement) {
        this.code_approvisionnement = code_approvisionnement;
    }

    public Date getDate_approvisionnement() {
        return date_approvisionnement;
    }

    public void setDate_approvisionnement(Date date_approvisionnement) {
        this.date_approvisionnement = date_approvisionnement;
    }

    public Date getDate_fabrication() {
        return date_fabrication;
    }

    public void setDate_fabrication(Date date_fabrication) {
        this.date_fabrication = date_fabrication;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }

    public ClsProduit getProduit() {
        return produit;
    }

    public void setProduit(ClsProduit produit) {
        this.produit = produit;
    }

    public ClsFournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(ClsFournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public ClsDepot getDepot() {
        return depot;
    }

    public void setDepot(ClsDepot depot) {
        this.depot = depot;
    }

    public String getUgs() {
        return ugs;
    }

    public void setUgs(String ugs) {
        this.ugs = ugs;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getCout_total() {
        return cout_total;
    }

    public void setCout_total(double cout_total) {
        this.cout_total = cout_total;
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
