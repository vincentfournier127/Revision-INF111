package jeu;

public class Magicien extends Personnage implements uniteSpecial {
    private boolean pouvoirSpecial = false;
    public Magicien(int pointDeVie, Position position, int pointAttaque){
        super(pointDeVie, position, pointAttaque);
    }

    @Override
    public void activerPouvoirSpecial() {
        pouvoirSpecial = !pouvoirSpecial;
    }

    @Override
    public void attaquer(Entite cible){
        int dommage = pointAttaque;
        if(pouvoirSpecial)
            dommage = dommage * 2;

        cible.recevoirDommage(dommage);
    }

}
