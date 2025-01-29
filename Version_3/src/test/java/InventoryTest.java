import Version_3.Instrument;
import Version_3.Inventory;
import Version_3.InstrumentSpec;
import enumere.Specification;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    Inventory inventory;

    // Méthode d'initialisation avant chaque test
    @BeforeEach
    void setUp() {
        inventory = new Inventory();  // Initialise un nouvel inventaire avant chaque test
        initializeInventory(inventory);  // Ajoute des instruments à l'inventaire
    }

    // Méthode de nettoyage après chaque test
    @AfterEach
    void tearDown() {
        inventory = null;  // Nettoie l'inventaire après chaque test
    }

    // Méthode pour initialiser l'inventaire avec quelques instruments
    public static void initializeInventory(Inventory inventory) {
        // Premier instrument (Guitar)
        Map<Specification, Object> instrumentMap1 = new HashMap<>();
        instrumentMap1.put(Specification.MODEL, "Guitar");
        instrumentMap1.put(Specification.BUILDER, "Fender");
        instrumentMap1.put(Specification.TYPE, "Electric");
        inventory.addInstrument("9019920", 745.99, new InstrumentSpec(instrumentMap1));

        // Deuxième instrument (Mandoline)
        Map<Specification, Object> instrumentMap2 = new HashMap<>();
        instrumentMap2.put(Specification.MODEL, "Mandoline");
        instrumentMap2.put(Specification.BUILDER, "Gibson");
        instrumentMap2.put(Specification.TYPE, "Acoustic");
        inventory.addInstrument("1451554", 124.45, new InstrumentSpec(instrumentMap2));

        // Troisième instrument (Piano)
        Map<Specification, Object> instrumentMap3 = new HashMap<>();
        instrumentMap3.put(Specification.MODEL, "Piano");
        instrumentMap3.put(Specification.BUILDER, "Yamaha");
        instrumentMap3.put(Specification.TYPE, "Grand");
        inventory.addInstrument("8899001", 5000.00, new InstrumentSpec(instrumentMap3));
    }

    // Test de la méthode addInstrument()
    @Test
    void addInstrument() {
        // Ajout d'un nouvel instrument avec des spécifications
        Map<Specification, Object> instrumentSpecMap = new HashMap<>();
        instrumentSpecMap.put(Specification.BUILDER, "Fender");
        instrumentSpecMap.put(Specification.MODEL, "Stratocaster");
        instrumentSpecMap.put(Specification.TYPE, "Electric");

        InstrumentSpec spec = new InstrumentSpec(instrumentSpecMap);
        inventory.addInstrument("SN12345", 1499.99, spec);

        // Vérification que l'instrument a bien été ajouté
        Instrument instrument = inventory.getInstrument("SN12345");
        assertNotNull(instrument, "L'instrument n'a pas été ajouté correctement");
        assertEquals("SN12345", instrument.getSerialNumber(), "Le numéro de série ne correspond pas");
        assertEquals(1499.99, instrument.getPrice(), "Le prix ne correspond pas");
        assertEquals(spec, instrument.getInstrumentSpec(), "Les spécifications ne correspondent pas");
    }

    // Test de la méthode getInstrument()
    @Test
    void getInstrument() {
        // Vérification que l'instrument avec le numéro de série '9019920' est trouvé
        Instrument instrument1 = inventory.getInstrument("9019920");
        assertNotNull(instrument1, "L'instrument '9019920' n'a pas été trouvé");
        assertEquals("9019920", instrument1.getSerialNumber(), "Le numéro de série ne correspond pas pour l'instrument '9019920'");
        assertEquals(745.99, instrument1.getPrice(), "Le prix de l'instrument '9019920' est incorrect");

        // Vérification qu'un instrument non existant retourne null
        Instrument instrumentNotFound = inventory.getInstrument("0000000");
        assertNull(instrumentNotFound, "Un instrument inexistant a été trouvé alors qu'il n'existe pas");
    }

    // Test de la méthode search()
    @Test
    void search() {
        // Création d'une spécification de recherche pour trouver une guitare
        Map<Specification, Object> searchSpecMap = new HashMap<>();
        searchSpecMap.put(Specification.MODEL, "Guitar");
        searchSpecMap.put(Specification.BUILDER, "Fender");
        searchSpecMap.put(Specification.TYPE, "Electric");

        InstrumentSpec searchSpec = new InstrumentSpec(searchSpecMap);

        // Recherche d'instruments correspondant à ces spécifications
        List<Instrument> matchingInstruments = inventory.search(searchSpec);

        // Vérification que la guitare a bien été trouvée
        assertEquals(1, matchingInstruments.size(), "Le nombre d'instruments trouvés est incorrect");
        assertEquals("9019920", matchingInstruments.get(0).getSerialNumber(), "Le numéro de série de l'instrument trouvé ne correspond pas");
    }
}
