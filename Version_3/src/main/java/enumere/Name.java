package enumere;

/**
 * Énumération représentant différents instruments de musique.
 * Cette énumération définit plusieurs types d'instruments à cordes et à vent.
 */

 public enum Name {
    GUITAR, BANJO, MANDOLIN, PIANO, SAXOPHONE, BATTRIE;

    /**
     * Retourne une représentation textuelle de l'instrument.
     *
     * @return Nom de l'instrument sous forme de chaîne de caractères.
     */

    public String toString(){
        switch (this){
            case GUITAR: return "Guitar";
            case BANJO: return "Banjo";
            case MANDOLIN: return "Mandolin";
            case PIANO: return "Piano";
            case SAXOPHONE: return "Saxophone";
            case BATTRIE: return "Batterie";
            default: return null;
        }
    }
}
