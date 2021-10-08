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
public class Coordonnee {
    private int abscisse;
    private int ordonnee;

    public Coordonnee(int x, int y){
        setOrdonnee(y);
        setAbscisse(x);
    }
    
    public int getAbscisse() {
        return this.abscisse;
    }

    public void setAbscisse(int x) {
        this.abscisse = 1024-x;
    }

    public int getOrdonnee() {
        return this.ordonnee;
    }

    public void setOrdonnee(int y) {
        this.ordonnee = 768-y;
    }
    
    
    
    
}
