package enumere;

/**
 * Énumération représentant les styles d'instruments de musique.
 * Cette énumération définit deux styles distincts : Amande et Florentine.
 */

 public enum Style {
    A,F;

    /**
     * Retourne une représentation textuelle du style de l'instrument.
     *
     * @return Nom du style sous forme de chaîne de caractères.
     */

    public String toString() {
        switch (this) {
            case A:
                return "Amande";
            default:
                return "Florentine";
        }
    }
}
