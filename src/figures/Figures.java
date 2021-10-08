/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import metier.*;

/**
 *
 * @author admin
 */
public class Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Carre unCarre = new Carre(10,100,120);
        Figure uneFigure;
        uneFigure=unCarre;
        System.out.println("Périmetre du carré : " + uneFigure.perimetre());
        System.out.println("Aire du carré : " + uneFigure.aire());
        Map<String, Integer>mCoordonnees = uneFigure.getPosition();
        System.out.println("Ordonnee du carre : " + mCoordonnees.get("ordonnee"));
        System.out.println("Abscisse du carre : " + mCoordonnees.get("abscisse"));
        
        
        Cercle unCercle = new Cercle(20, 400, 340);
        Figure uneFigure2 = null;
        uneFigure2=unCercle;
        System.out.println("Périmetre du cercle : " + uneFigure2.perimetre());
        System.out.println("Aire du cercle : " + uneFigure2.aire());
        mCoordonnees = uneFigure2.getPosition();
        System.out.println("Ordonnee du cercle : " + mCoordonnees.get("ordonnee"));
        System.out.println("Abscisse du cercle : " + mCoordonnees.get("abscisse"));
        
        
        TriangleQuelconque unTriangleQuelconque = new TriangleQuelconque(10.0,20,30,40,500,400);
        Figure uneFigure3 = null;
        uneFigure3=unTriangleQuelconque;
        System.out.println("Périmetre du Triangle quelconque : " + uneFigure3.perimetre());
        System.out.println("Aire du triangle quelconque : " + uneFigure3.aire());
        mCoordonnees = uneFigure3.getPosition();
        System.out.println("Ordonnee du triangle qu : " + mCoordonnees.get("ordonnee"));
        System.out.println("Abscisse du triangle qu : " + mCoordonnees.get("abscisse"));
        
        
        Triangle unTriangleEquilateral = new TriangleEquilateral(10,20,200,400);
        Figure uneFigure4 = null;
        uneFigure4=unTriangleEquilateral;
        System.out.println("Périmetre du Triangle eq : " + uneFigure4.perimetre());
        System.out.println("Aire du triangle eq : " + uneFigure4.aire());
        mCoordonnees = uneFigure4.getPosition();
        System.out.println("Ordonnee du triangle eq : " + mCoordonnees.get("ordonnee"));
        System.out.println("Abscisse du triangle eq : " + mCoordonnees.get("abscisse"));
        
        
        Triangle unTriangleIsocele = new TriangleIsocele(10,20,30,250,400);
        Figure uneFigure5 = null;
        uneFigure5=unTriangleIsocele;
        System.out.println("Périmetre du Triangle isocele : " + uneFigure5.perimetre());
        System.out.println("Aire du triangle isocele : " + uneFigure5.aire());
        mCoordonnees = uneFigure5.getPosition();
        System.out.println("Ordonnee du triangle isocele : " + mCoordonnees.get("ordonnee"));
        System.out.println("Abscisse du triangle isocele : " + mCoordonnees.get("abscisse"));*/
        
        List<Figure> lesFigures = new ArrayList<Figure>();
        Carre unCarre = new Carre("Carré", 10, 100, 120);
        lesFigures.add(unCarre);
        Cercle unCercle = new Cercle("Cercle", 20, 400, 340);
        lesFigures.add(unCercle);
        TriangleEquilateral unTiEq = new TriangleEquilateral("Tri eq", 20, 30, 150, 250);
        lesFigures.add(unTiEq);
        /*Triangle unTriangle = new Triangle(n, 0, 0, 0, 0, 0, 0);*/
        for(Figure f: lesFigures){
        System.out.println("Classe instanciée : " + f.getClass());
        System.out.println("Classe mère : " + f.getClass().getSuperclass());
        System.out.println("Périmètre du " + f.getNom() + " : " + f.perimetre());
        System.out.println("Aire du " + f.getNom() + " : " + f.aire());
        System.out.println("Ordonnées du " + f.getNom() + " : " + f.getCoordonnee().getOrdonnee());
        System.out.println("Abscisse du " + f.getNom() + " : " + f.getCoordonnee().getAbscisse());
        System.out.println("");
        }
        
    }
    
}
