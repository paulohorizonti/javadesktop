/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.jpa.teste;

import curso.jpa.dao.PersonaDAO;

/**
 *
 * @author paulo
 */
public class PersonaTeste {
   
    
    public static void main(String[] args) {
         PersonaDAO pDao = new PersonaDAO();
         
         
        System.out.println(pDao.inserirPersona("RICARDO GUIMARAES", "RICARDÃO",30, "(63)99999-9999"));
    }
}
