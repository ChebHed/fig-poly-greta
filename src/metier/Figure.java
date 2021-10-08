/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public abstract class Figure {
    private String nom;
    private Coordonnee uneCoordonnee;
    public static final double PI = 3.14;
    private int ordonnee;
    private int abscisse;
    public abstract double perimetre();
    public abstract double aire();

    
    public Figure(String nom, int x, int y){
        setNom(nom);
        setCoordonnee(x, y);
    }

    public Coordonnee getCoordonnee() {
        return uneCoordonnee;
    }

    protected void setCoordonnee(int x, int y) {
        this.uneCoordonnee = new Coordonnee(x,y);
    }
    
    
    public String getNom() {
        return this.nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }
    
    
    
    protected int getOrdonnee(){
    return this.ordonnee;
    }
    
    protected void setOrdonnee(int ordonnee){
        this.ordonnee=ordonnee;
    }
    
    protected int getAbscisses(){
        return this.abscisse;
    }
    
    protected void setAbscisses(int abscisse){
        this.abscisse=abscisse;
    }
    
    
    
    
    protected void setPosition(int x, int y){
        this.setOrdonnee(1024-x);
        this.setAbscisses(768-y);
    }
    
    public Map getPosition(){
        Map<String, Integer> mCoordonnees = new HashMap<String, Integer>();
        mCoordonnees.put("ordonnee", this.getOrdonnee());
        mCoordonnees.put("abscisse", this.getAbscisses());
        return mCoordonnees;
    }
    
}
