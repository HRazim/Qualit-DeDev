package enumere;

/**
 * Énumération représentant les types d'instruments de musique.
 * Cette énumération distingue les instruments acoustiques et électriques.
 */

 public enum Type {
    ACOUSTIC,ELECTRIC,ANY;

    /**
     * Retourne une représentation textuelle du type d'instrument.
     *
     * @return Nom du type d'instrument sous forme de chaîne de caractères.
     */

    public String toString(){
        switch (this){
            case ACOUSTIC: return "Accoustic";
            case ELECTRIC: return "Electric";
            default: return  "Unspecified";
        }

    }
}