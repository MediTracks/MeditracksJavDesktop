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
public class ClsStock  implements IActionManager{
    private Date date_stock;
    private String designation;
    private double stock_initial, qte_entree, qte_sortie, stock_final;

    public ClsStock() {
    }

    public ClsStock(Date date_stock, String designation, double stock_initial, double qte_entree, double qte_sortie, double stock_final) {
        this.date_stock = date_stock;
        this.designation = designation;
        this.stock_initial = stock_initial;
        this.qte_entree = qte_entree;
        this.qte_sortie = qte_sortie;
        this.stock_final = stock_final;
    }

    public Date getDate_stock() {
        return date_stock;
    }

    public void setDate_stock(Date date_stock) {
        this.date_stock = date_stock;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getStock_initial() {
        return stock_initial;
    }

    public void setStock_initial(double stock_initial) {
        this.stock_initial = stock_initial;
    }

    public double getQte_entree() {
        return qte_entree;
    }

    public void setQte_entree(double qte_entree) {
        this.qte_entree = qte_entree;
    }

    public double getQte_sortie() {
        return qte_sortie;
    }

    public void setQte_sortie(double qte_sortie) {
        this.qte_sortie = qte_sortie;
    }

    public double getStock_final() {
        return stock_final;
    }

    public void setStock_final(double stock_final) {
        this.stock_final = stock_final;
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
