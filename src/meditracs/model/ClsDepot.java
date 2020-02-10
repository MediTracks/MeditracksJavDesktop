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
public class ClsDepot  implements IActionManager{
    private String code_depot, designation_depot;

    public ClsDepot() {
    }

    public ClsDepot(String code_depot, String designation_depot) {
        this.code_depot = code_depot;
        this.designation_depot = designation_depot;
    }

    public String getCode_depot() {
        return code_depot;
    }

    public void setCode_depot(String code_depot) {
        this.code_depot = code_depot;
    }

    public String getDesignation_depot() {
        return designation_depot;
    }

    public void setDesignation_depot(String designation_depot) {
        this.designation_depot = designation_depot;
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
