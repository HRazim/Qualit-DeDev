package Version_3;


public abstract class InstrumentFatcory {

    /**
     * Constructeur par défaut de la classe InstrumentFactory.
     * Cette classe ne peut pas être instanciée directement, car elle est abstraite.
     */
    public InstrumentFatcory() {} //il référence un objet


    /**
     * Méthode statique qui crée un nouvel objet Instrument.
     * Cette méthode fabrique un objet Instrument à partir d'un numéro de série, d'un prix et de spécifications fournies.
     *
     * @param serialNumber Le numéro de série unique de l'instrument.
     * @param price Le prix de l'instrument.
     * @param spec Les spécifications de l'instrument, encapsulées dans un objet InstrumentSpec.
     * @return Un nouvel objet Instrument avec les spécifications fournies.
     */
   public static Instrument createInstrument(String serialNumber, double price, InstrumentSpec spec){

       return new Instrument(serialNumber, price, spec);
   }


}
