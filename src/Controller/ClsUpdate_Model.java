
package Controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ClsApprovisionnement;
import model.ClsCategorie_Prod;
import model.ClsCommandes;
import model.ClsConfirmation_Reception;
import model.ClsDepot;
import model.ClsDistribution;
import model.ClsFournisseur;
import model.ClsLogin;
import model.ClsProduit;
import model.ClsProvince;
import model.ClsStock;
import model.ClsStructure;
import model.ClsTransporteur;
import model.ClsVille;
import model.ClsZone;

/**
 *
 * @author Brain
 */
public class ClsUpdate_Model {
    // Classe qui va Inserer modifier et supprimer les donnees dans la bd
    public static boolean EnregistrerData(Object obj) throws SQLException, ClassNotFoundException, Exception
    {
        if (obj instanceof ClsLogin){
            ClsLogin login = (ClsLogin)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_login ?,?,?");
            ps.setString(1, login.getNom_utilisateur());
            ps.setString(2, login.getMot_de_passe());
            ps.setString(3, login.getNiveau_acces());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }         
        else if (obj instanceof ClsApprovisionnement) {
            ClsApprovisionnement approv = (ClsApprovisionnement)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE inserer_approvisionnement ?,?,?,?,?,?,?,?,?,?");
            ps.setString(1, approv.getCode_approvisionnement());
            ps.setDate(2, approv.getDate_approvisionnement());
            ps.setDate(3, approv.getDate_fabrication());
            ps.setDate(4, approv.getDate_expiration());
            ps.setString(5, approv.getProduit().getDesignation_produit());
            ps.setString(6, approv.getFournisseur().getNoms_fournisseur());
            ps.setString(7, approv.getDepot().getDesignation_depot());
            ps.setString(8, approv.getUgs());
            ps.setDouble(9, approv.getQuantite());
            ps.setDouble(10, approv.getCout_total());            
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsCategorie_Prod) {
            ClsCategorie_Prod categ = (ClsCategorie_Prod)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_categorie ?,?");
            ps.setString(1, categ.getCode_categorie());
            ps.setString(2, categ.getDesignation_categorie());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsCommandes) {
            ClsCommandes commandes = (ClsCommandes)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE inserer_commande ?,?,?,?,(select id_structure from t_structure where descr_structure = ?)");
            ps.setString(1, commandes.getCode_produit());
            ps.setDouble(2, commandes.getQte());
            ps.setString(3, commandes.getAlerte_level());
            ps.setDate(4, commandes.getDate_commande());
            ps.setString(5, commandes.getId_structure());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsConfirmation_Reception) {
            ClsConfirmation_Reception confirmation_Reception = (ClsConfirmation_Reception)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_confirmation ?,?,?,?");
            ps.setString(1, confirmation_Reception.getCommande().getCode_produit());//error code_Commande not found
            ps.setDate(2, confirmation_Reception.getDate_confirmation());
            ps.setDouble(3, confirmation_Reception.getQte_recue());
            ps.setString(4, confirmation_Reception.getObservations());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsDepot) {
            ClsDepot depot = (ClsDepot)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_depot ?,?");
            ps.setString(1, depot.getCode_depot());
            ps.setString(2, depot.getDesignation_depot());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsDistribution) {
            ClsDistribution distribution = (ClsDistribution)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_distribution ?,?,?,?,?,?,?");
            ps.setString(1, distribution.getNum_distribution());
            ps.setDate(2, distribution.getDate_distribution());
            ps.setString(3, distribution.getTransporteur().getDescr_transporteur());
            ps.setString(4, distribution.getCommandes().getCode_produit());//error codeCommande not found
            ps.setString(5, distribution.getApprovisionnement().getCode_approvisionnement());            
            ps.setDouble(6, distribution.getQte_demande());
            ps.setString(7, distribution.getDescr_distribution());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsFournisseur) {
            ClsFournisseur fournisseur = (ClsFournisseur)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_fournisseur ?,?,?,?,?");
            ps.setString(1, fournisseur.getCode_fournisseur());
            ps.setString(2, fournisseur.getNoms_fournisseur());
            ps.setString(3, fournisseur.getAdresse_fournisseur());
            ps.setString(4, fournisseur.getTelephone_fournisseur());
            ps.setString(5, fournisseur.getMail_fournisseur());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsProduit) {
            ClsProduit produit = (ClsProduit)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_produit ?,?,?");
            ps.setString(1, produit.getCode_produit());
            ps.setString(2, produit.getDesignation_produit());
            ps.setString(3, produit.getCategorie_Prod().getDesignation_categorie());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsProvince) {
            ClsProvince province = (ClsProvince)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_province ?,?");
            ps.setString(1, province.getId_province());
            ps.setString(2, province.getDescription_province());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsStock) {
            ClsStock stock = (ClsStock)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_stock ?,?,?,?,?,?");
            ps.setDate(1, stock.getDate_stock());
            ps.setString(2, stock.getDesignation());
            ps.setDouble(3, stock.getStock_initial());
            ps.setDouble(4, stock.getQte_entree());
            ps.setDouble(5, stock.getQte_sortie());
            ps.setDouble(6, stock.getStock_final());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsStructure) {
            ClsStructure structure = (ClsStructure)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_structure ?,?,?,?,?");
            ps.setString(1, structure.getId_structure());
            ps.setString(2, structure.getDescr_structure());
            ps.setString(3, structure.getAdresse());
            ps.setString(4, structure.getTelephone());
            ps.setString(5, structure.getZone().getDescr_zone());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsTransporteur) {
            ClsTransporteur transporteur = (ClsTransporteur)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_transporteur ?,?,?,?");
            ps.setString(1, transporteur.getCode_transporteur());
            ps.setString(2, transporteur.getDescr_transporteur());
            ps.setString(3, transporteur.getNum_phone());
            ps.setString(4, transporteur.getAdresse_transporteur());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsVille) {
            ClsVille ville = (ClsVille)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_ville ?,?,?");
            ps.setString(1, ville.getId_ville());
            ps.setString(2, ville.getDescription_ville());
            ps.setString(3, ville.getProvince().getDescription_province());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;
            
        }
        else if (obj instanceof ClsZone) {
            ClsZone zone = (ClsZone)obj;
            PreparedStatement ps = DbConnect.connectDb().prepareCall("EXECUTE enregistrer_zone ?,?,?,?,?");
            ps.setString(1, zone.getId_zone());
            ps.setString(2, zone.getDescr_zone());
            ps.setString(3, zone.getAdresse());
            ps.setString(4, zone.getTelephone());
            ps.setString(5, zone.getVille().getDescription_ville());
            ps.executeUpdate();
            ps.close();
            DbConnect.disconnectDb();
            return true;            
        }
        
        return false;
    }    
    
    //IDelete deletes rows with id int format
    public static boolean fx_IDelete(String dbTable, int tbId) throws SQLException, ClassNotFoundException, Exception
    {
        PreparedStatement ps = DbConnect.connectDb().prepareStatement("DELETE FROM "+dbTable+" WHERE id = ?");
        ps.setInt(1, tbId);
        ps.executeUpdate();
        ps.close();
        DbConnect.disconnectDb();
        return true;
    }
    
    //IDelete deletes rows with String int format
    public static boolean fx_SDelete(String dbTable, String tbId) throws SQLException, ClassNotFoundException, Exception
    {
        PreparedStatement ps = DbConnect.connectDb().prepareStatement("DELETE FROM "+dbTable+" WHERE id = ?");
        ps.setString(1, tbId);
        ps.executeUpdate();
        ps.close();
        DbConnect.disconnectDb();
        return true;
    }
}
