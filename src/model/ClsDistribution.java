/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import meditracs.Controller.IActionManager;
import java.sql.Date;
/**
 *
 * @author Brain
 */
public class ClsDistribution  implements IActionManager{
    private Date date_distribution;
    private ClsTransporteur transporteur;
    private ClsCommandes commandes;
    private ClsApprovisionnement approvisionnement;
    private double qte_demande;
    private String descr_distribution;

    public ClsDistribution() {
    }

    public ClsDistribution(Date date_distribution, ClsTransporteur transporteur, ClsCommandes commandes, ClsApprovisionnement approvisionnement, double qte_demande, String descr_distribution) {
        this.date_distribution = date_distribution;
        this.transporteur = transporteur;
        this.commandes = commandes;
        this.approvisionnement = approvisionnement;
        this.qte_demande = qte_demande;
        this.descr_distribution = descr_distribution;
    }

    public Date getDate_distribution() {
        return date_distribution;
    }

    public void setDate_distribution(Date date_distribution) {
        this.date_distribution = date_distribution;
    }

    public ClsTransporteur getTransporteur() {
        return transporteur;
    }

    public void setTransporteur(ClsTransporteur transporteur) {
        this.transporteur = transporteur;
    }

    public ClsCommandes getCommandes() {
        return commandes;
    }

    public void setCommandes(ClsCommandes commandes) {
        this.commandes = commandes;
    }

    public ClsApprovisionnement getApprovisionnement() {
        return approvisionnement;
    }

    public void setApprovisionnement(ClsApprovisionnement approvisionnement) {
        this.approvisionnement = approvisionnement;
    }

    public double getQte_demande() {
        return qte_demande;
    }

    public void setQte_demande(double qte_demande) {
        this.qte_demande = qte_demande;
    }

    public String getDescr_distribution() {
        return descr_distribution;
    }

    public void setDescr_distribution(String descr_distribution) {
        this.descr_distribution = descr_distribution;
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
