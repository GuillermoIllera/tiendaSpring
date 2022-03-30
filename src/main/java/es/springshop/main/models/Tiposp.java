// Generated with g9.

package es.springshop.main.models;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tiposp")
public class Tiposp implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 174275952220673266L;

	/** Primary key. */
    protected static final String PK = "idTipop";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_tipop", unique=true, nullable=false, precision=10)
    private int idTipop;
    @Column(name="nombre_tipop", nullable=false, length=50)
    private String nombreTipop;

    /** Default constructor. */
    public Tiposp() {
        super();
    }

    /**
     * Access method for idTipop.
     *
     * @return the current value of idTipop
     */
    public int getIdTipop() {
        return idTipop;
    }

    /**
     * Setter method for idTipop.
     *
     * @param aIdTipop the new value for idTipop
     */
    public void setIdTipop(int aIdTipop) {
        idTipop = aIdTipop;
    }

    /**
     * Access method for nombreTipop.
     *
     * @return the current value of nombreTipop
     */
    public String getNombreTipop() {
        return nombreTipop;
    }

    /**
     * Setter method for nombreTipop.
     *
     * @param aNombreTipop the new value for nombreTipop
     */
    public void setNombreTipop(String aNombreTipop) {
        nombreTipop = aNombreTipop;
    }

    /**
     * Compares the key for this instance with another Tiposp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Tiposp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Tiposp)) {
            return false;
        }
        Tiposp that = (Tiposp) other;
        if (this.getIdTipop() != that.getIdTipop()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Tiposp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Tiposp)) return false;
        return this.equalKeys(other) && ((Tiposp)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdTipop();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Tiposp |");
        sb.append(" idTipop=").append(getIdTipop());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idTipop", Integer.valueOf(getIdTipop()));
        return ret;
    }

}
