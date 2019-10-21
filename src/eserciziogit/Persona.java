/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziogit;

/**
 *
 * @author utente
 */
class Persona {
    
}
public class Persona {
    private String name;
    private String cognome;
    private String titolo;
    private String professione="disoccupato"; 
    
    public Persona(String name,String cognome,String titolo,String professione){
        this.name=name;
        this.cognome=cognome;
        this.titolo=titolo;
        this.professione=professione;
    }
    public Persona(String name,String cognome){
        this.name=name;
        this.cognome=cognome;
        this.titolo="Ing";
    }
    
    public String getInfoPersona(){
       
        return titolo+"."+name+" "+cognome+" professione "+professione;
     }
    
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public void setProfessione(String professione){
        this.professione=professione;
    }
    public void Persona1(){
        
    }
    public void Persona2(){
        
    }
    
}