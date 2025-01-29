package Version_3;

import enumere.Specification;
import java.util.HashMap;
import java.util.List;

/**
 * Classe de test permettant de rechercher des instruments dans un inventaire.
 * Elle initialise un inventaire et effectue une recherche d'instruments correspondant aux préférences d'Erin.
 */

 public class FindInstrumentTester {

    /**
     * Méthode principale exécutant le test de recherche d'instruments.
     *
     * @param args Arguments de la ligne de commande (non utilisés).
     */

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        HashMap<Specification, Object> map = new HashMap<>();
        map.put(Specification.Name, "Guitar");

        InstrumentSpec whatErinLikes= new InstrumentSpec(map) ;
        InstrumentSpec whatErinLikes2 = new InstrumentSpec(map);


        List matchingInstruments = inventory.search(whatErinLikes);
        if (!matchingInstruments.isEmpty()) {

            System.out.println( "Instrument trouvé : " + matchingInstruments);
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }


    }

    /**
     * Initialise l'inventaire avec quelques instruments.
     * Cette méthode est publique afin d'être utilisée dans les tests unitaires.
     *
     * @param inventory L'inventaire à initialiser.
     */

    public static void initializeInventory(Inventory inventory) {
        HashMap<Specification, Object>instrumentMap1 = new HashMap<>();
        instrumentMap1.put(Specification.Name,"Guitar");
        inventory.addInstrument("9019920", 745.99 , new InstrumentSpec(instrumentMap1));

        HashMap<Specification, Object> instrumentMap2 = new HashMap<>();
        instrumentMap2.put(Specification.Name,"Mandoline");
        inventory.addInstrument("1451554", 124.45 , new InstrumentSpec(instrumentMap2));
    }
}