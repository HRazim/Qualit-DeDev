package Version_3;

public class Instrument {

    protected String serialNumber, model;
    protected double price;
    protected InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    /**
     * La méthode retourne l'objet serialNumber associé à l'instrument
     * @return serialNumber qui est unique à chaque instrument
     */

    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     *  La méthode retourne l'objet prix associé à l'instrument
     * @return price qui représente le prix de l'instrument
     */

    public double getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }


    /**
     * Cette méthode retourne l'objet Version_2.InstrumentSpec associé à l'instrument
     * @return instrumentSpec qui contient les spécifications de l'instruments
     */
    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }


    public String toString() {
        return serialNumber + "\t" + price + "\t" + instrumentSpec;
    }


}
