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
public class ClsConfirmation_Reception implements IActionManager {
    private ClsDistribution distribution;
    private Date date_confirmation;
    private double qte_recue;
    private String observations;

    public ClsConfirmation_Reception() {
    }

    public ClsConfirmation_Reception(ClsDistribution distribution, Date date_confirmation, double qte_recue, String observations) {
        this.distribution = distribution;
        this.date_confirmation = date_confirmation;
        this.qte_recue = qte_recue;
        this.observations = observations;
    }

    public ClsDistribution getDistribution() {
        return distribution;
    }

    public void setDistribution(ClsDistribution distribution) {
        this.distribution = distribution;
    }

    public Date getDate_confirmation() {
        return date_confirmation;
    }

    public void setDate_confirmation(Date date_confirmation) {
        this.date_confirmation = date_confirmation;
    }

    public double getQte_recue() {
        return qte_recue;
    }

    public void setQte_recue(double qte_recue) {
        this.qte_recue = qte_recue;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
