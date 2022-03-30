// Generated with g9.

package es.springshop.main.models;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="tipo_producto")
public class TipoProducto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7396164178781869076L;

	/** Primary key. */
    protected static final String PK = "idProducto";

    @Id
    @Column(name="id_producto", unique=true, nullable=false, precision=10)
    private int idProducto;
    @Column(name="id_tipop", nullable=false, precision=10)
    private int idTipop;

    /** Default constructor. */
    public TipoProducto() {
        super();
    }

    /**
     * Access method for idProducto.
     *
     * @return the current value of idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Setter method for idProducto.
     *
     * @param aIdProducto the new value for idProducto
     */
    public void setIdProducto(int aIdProducto) {
        idProducto = aIdProducto;
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
     * Compares the key for this instance with another TipoProducto.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TipoProducto and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TipoProducto)) {
            return false;
        }
        TipoProducto that = (TipoProducto) other;
        if (this.getIdProducto() != that.getIdProducto()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TipoProducto.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TipoProducto)) return false;
        return this.equalKeys(other) && ((TipoProducto)other).equalKeys(this);
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
        i = getIdProducto();
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
        StringBuffer sb = new StringBuffer("[TipoProducto |");
        sb.append(" idProducto=").append(getIdProducto());
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
        ret.put("idProducto", Integer.valueOf(getIdProducto()));
        return ret;
    }

}
