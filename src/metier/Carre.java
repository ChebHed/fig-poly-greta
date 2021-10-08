/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author admin
 */
    public class Carre extends Figure {
    private double largeur;

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    
    public Carre(String n, double l, int x, int y){
        super(n, x, y);
        this.largeur = l;
    }
    
    @Override
    public double perimetre(){
    return this.largeur * 4;
    }
    @Override
    public double aire(){
    return this.largeur * this.largeur;
    }
}
