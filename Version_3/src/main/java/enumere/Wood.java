package enumere;

/**
 * Énumération représentant différents types de bois utilisés dans la fabrication d'instruments de musique.
 * Cette énumération comprend plusieurs essences de bois couramment utilisées pour les guitares et autres instruments à cordes.
 */

 public enum Wood {
    SITKA,ALDER,MAHOGANY,BRAZILIAN_ROSEWOOD,INDIAN_ROSEWOOD,COCOBOLO,CEDAR,MAPLE,ANY, ADIRONDACK;

    /**
     * Retourne une représentation textuelle du type de bois.
     *
     * @return Nom du bois sous forme de chaîne de caractères.
     */

    public String toString(){
        switch (this){
            case SITKA : return "Sitka";
            case ALDER : return "Alder";
            case MAHOGANY: return "Mahogany";
            case BRAZILIAN_ROSEWOOD: return "Brazilian_Rosewood";
            case INDIAN_ROSEWOOD: return "Indian_Rosewood";
            case COCOBOLO : return "Cocobolo";
            case CEDAR : return "Cedar";
            case MAPLE : return "Maple";
            case ADIRONDACK : return "Adirondack";
            default: return  "Unspecified";
        }

    }
}