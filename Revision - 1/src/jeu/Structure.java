package jeu;

public abstract class Structure extends Entite {
    private TypeStructure type;

    public Structure(int pointDeVie, Position position, TypeStructure type){
        super(pointDeVie, position);
        this.type = type;
    }

    public TypeStructure getType() {
        return type;
    }  
}
