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
public class ClsVille  implements IActionManager{
    private String id_ville, description_ville;
    private ClsProvince province;

    public ClsVille() {
    }

    public ClsVille(String id_ville, String description_ville, ClsProvince province) {
        this.id_ville = id_ville;
        this.description_ville = description_ville;
        this.province = province;
    }

    public String getId_ville() {
        return id_ville;
    }

    public void setId_ville(String id_ville) {
        this.id_ville = id_ville;
    }

    public String getDescription_ville() {
        return description_ville;
    }

    public void setDescription_ville(String description_ville) {
        this.description_ville = description_ville;
    }

    public ClsProvince getProvince() {
        return province;
    }

    public void setProvince(ClsProvince province) {
        this.province = province;
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
