package Version_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe représentant un inventaire d'instruments de musique.
 * Permet d'ajouter, rechercher et récupérer des instruments par leur numéro de série.
 */
 public class Inventory {
    private List instruments;

    /**
     * Constructeur initialisant un inventaire vide.
     */
    public Inventory() {
        instruments = new LinkedList();
    }


    /**
     * Ajoute un instrument à l'inventaire.
     *
     * @param serialNumber Numéro de série de l'instrument.
     * @param price Prix de l'instrument.
     * @param instrumentSpec Spécifications de l'instrument.
     */
    public void addInstrument(String serialNumber, double price,
                          InstrumentSpec instrumentSpec) {

        Instrument instrument = InstrumentFatcory.createInstrument(serialNumber, price,instrumentSpec);
        instruments.add(instrument);
    }


    /**
     * Récupère un instrument par son numéro de série.
     *
     * @param serialNumber Le numéro de série de l'instrument recherché.
     * @return L'instrument correspondant ou {@code null} s'il n'est pas trouvé.
     */
    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }


    /**
     * Recherche des instruments correspondant aux spécifications fournies.
     *
     * @param instrumentSpec Spécifications de l'instrument recherché.
     * @return Une liste des instruments correspondants.
     */
    public List search(InstrumentSpec instrumentSpec) {
        List matchingInstruments = new LinkedList<>();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
            Instrument instrument = i.next();
            if (instrument.getInstrumentSpec().matches(instrumentSpec)) {
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }
}