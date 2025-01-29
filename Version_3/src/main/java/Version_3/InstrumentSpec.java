package Version_3;

import enumere.Specification;
import java.util.Map;

public class InstrumentSpec {
    //Map qui stocke les spécifications d'un instrument sous forme de paires clé-valeur.
    private Map<Specification, Object> map;


    /**
     * Constructeur de la classe InstrumentSpec.
     * Initialise un objet InstrumentSpec avec les spécifications fournies.
     *
     * @param map Une Map de spécifications associant des clés de type Specification et des valeurs.
     */
    public InstrumentSpec(Map<Specification, Object> map) {

        this.map = map;
    }

    /**
     * Compare les spécifications de l'instrument courant avec celles d'un autre InstrumentSpec.
     * Cette méthode permet de déterminer si deux instruments ont les mêmes spécifications.
     *
     * @param otherSpec Les spécifications de l'autre instrument à comparer.
     * @return true si les spécifications correspondent, sinon false.
     */
  public boolean matches(InstrumentSpec otherSpec) {

      if (otherSpec == null) {
          return false;
      }

      for (Specification specification : map.keySet()) {

          Object thisSpecValue = map.get(specification);
          Object otherSpecValue = otherSpec.map.get(specification);

          if (otherSpecValue != null && !thisSpecValue.equals(otherSpecValue)) {
              return false;
          }
      }
      return true;
  }

    public String toString() {
        return map.toString();
    }
}
