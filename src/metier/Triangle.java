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
public abstract class Triangle extends Figure{
    private double base;
    private double hauteur;
    private double cote1;
    private double cote2;
    
    
    
    public Triangle(String n,double base, double hauteur, double cote1, double cote2, int x, int y){
        super(n, x, y);
        this.base=base;
        this.hauteur=hauteur;
        this.cote1=cote1;
        this.cote2=cote2;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getCote1() {
        return cote1;
    }

    public void setCote1(double cote1) {
        this.cote1 = cote1;
    }
    
    public double getCote2() {
        return cote2;
    }

    public void setCote2(double cote2) {
        this.cote1 = cote2;
    }
    
    @Override
    public double perimetre(){
        return this.cote1 + this.cote2 + this.base;
    }
    
    @Override
    public double aire(){
        return (this.base*this.hauteur)/2;
    }
}
