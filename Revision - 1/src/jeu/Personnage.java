package jeu;

public class Personnage extends Entite{
    protected int pointAttaque;
    public Personnage(int pointDeVie, Position position, int pointAttaque){
        super(pointDeVie, position);
        this.pointAttaque = pointAttaque;
    }

    public void attaquer(Entite cible){
        cible.recevoirDommage(pointAttaque);
    }
}
