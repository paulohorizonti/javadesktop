/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.jpa.dao;

import curso.jpa.controller.PersonaJpaController;
import curso.jpa.entity.Persona;

/**
 *
 * @author paulo
 */
public class PersonaDAO {
//objetos
private PersonaJpaController tjc = new PersonaJpaController();
private Persona persona = new Persona();
private String mensagem = "";

//criar metodos de persistencia
    public String inserirPersona(String nombres, String apelidos, int idade, String telefone){
       try{
        persona.setId(Integer.SIZE);
        persona.setNombres(nombres);
        persona.setApelidos(apelidos);
        persona.setIdade(idade);
        persona.setTelefone(telefone);
        tjc.create(persona);
        mensagem = "Salvo com sucesso";
       }catch(Exception e){
           System.out.println("Mensagem em guardar :"+e.getMessage());
       mensagem = "No se pude guardar la informacion";
       }
        
       
        return mensagem; //retrorna a mesangem
    }
    
    public String editarPersona()
    {
    
    return null;
    }
    
    public String deletarPersona()
    {
    
    return null;
    }
    
    
}
