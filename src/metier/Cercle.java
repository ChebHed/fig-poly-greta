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
    public class Cercle extends Figure{
    private double rayon;

    public Cercle(String n, double r, int x, int y){
        super(n, x, y);
        this.rayon=r;
    }
    
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    
    @Override
    public double perimetre(){
    return this.rayon * PI * 2;
    }
    @Override
    public double aire(){
    return this.rayon * this.rayon * PI;
    }
    
}
