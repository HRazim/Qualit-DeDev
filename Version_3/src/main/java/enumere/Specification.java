package enumere;

/**
 * Énumération représentant les différentes spécifications d'un instrument de musique.
 * Cette énumération contient plusieurs caractéristiques permettant de définir un instrument.
 */

 public enum Specification {
    BUILDER, MODEL,TYPE, STYLE, TOPWOOD, BACKWOOD, YEAR, Name ;

    /**
     * Retourne une représentation textuelle de la spécification.
     *
     * @return Nom de la spécification sous forme de chaîne de caractères.
     */

    public String toString(){
        switch (this){
            case BUILDER: return "builder";
            case MODEL: return "model";
            case TYPE: return "type";
            case STYLE: return "style";
            case TOPWOOD: return "topWood";
            case BACKWOOD: return "backWood";
            case YEAR: return "year";
            case Name: return "name";
            default: return "unknown";
        }
    }
}

