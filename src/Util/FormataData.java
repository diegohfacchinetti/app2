/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.text.MaskFormatter;

/**
 *
 * @author Eduardo Silveira
 */
public class FormataData extends MaskFormatter{
    private static MaskFormatter mascaraData = null;
    
    private FormataData(){
        
    }
    
    
    public static MaskFormatter getFormataData(){
        if(mascaraData==null){
            try {
                mascaraData = new MaskFormatter("dd/MM/yyyy");
                mascaraData.setMask("##/##/####");
                mascaraData.setValidCharacters("0123456789");
                mascaraData.setValueContainsLiteralCharacters(false);
                mascaraData.setAllowsInvalid(false);
            } catch (Exception e) {
                System.err.println("Erro ao criar mascara de data!");
            }
        }
        return mascaraData;
    }
}
