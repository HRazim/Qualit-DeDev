package enumere;

/**
 * Enumeration représentant différents fabricants de guitares.
 * Cette énumération contient plusieurs constructeurs de guitares populaires.
 */

 public enum Builder {
    FENDER,MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS,ANY;

    /**
     * Retourne une représentation textuelle du fabricant.
     *
     * @return Nom du fabricant sous forme de chaîne de caractères.
     */

    public String toString(){
        switch (this){
            case FENDER : return "Fender";
            case MARTIN : return "Martin";
            case GIBSON : return "Gibson";
            case COLLINGS : return "Collings";
            case OLSON: return "Olson";
            case RYAN : return "Ryan";
            case PRS : return "PRS";
            default: return  "Unspecified";
        }

    }
}