/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author CRYONI-RIEK
 */
public interface Operation {

    public boolean enregistrer(Object obj) throws Exception;

    public boolean modifier(Object obj) throws Exception;

    public boolean supprimer(Object obj) throws Exception;

    public void getObjectValue(Object obj) throws Exception;
}
