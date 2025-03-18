package jeu;

public class Entite {
    protected int pointDeVie;
    protected Position position;

    public Entite(int pointDeVie, Position position){
        this.pointDeVie = pointDeVie;
        this.position = position;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public Position getPosition() {
        return position;
    }

    public void recevoirDommage(int dommage){
        pointDeVie -= dommage;
    }
}
