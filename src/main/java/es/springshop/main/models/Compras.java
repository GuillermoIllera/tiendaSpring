// Generated with g9.

package es.springshop.main.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="compras")
public class Compras implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7193994173224355010L;

	/** Primary key. */
    protected static final String PK = "idCompra";
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_compra", unique=true, nullable=false, precision=10)
    private int idCompra;
    @Column(name="id_producto", nullable=false, precision=10)
    private int idProducto;
    @Column(name="id_usuario", nullable=false, precision=10)
    private int idUsuario;
    @Column(name="fecha_compra", nullable=false)
    private LocalDate fechaCompra;

    /** Default constructor. */
    public Compras() {
        super();
    }

    /**
     * Access method for idCompra.
     *
     * @return the current value of idCompra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Setter method for idCompra.
     *
     * @param aIdCompra the new value for idCompra
     */
    public void setIdCompra(int aIdCompra) {
        idCompra = aIdCompra;
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
     * Access method for idUsuario.
     *
     * @return the current value of idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Setter method for idUsuario.
     *
     * @param aIdUsuario the new value for idUsuario
     */
    public void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    /**
     * Access method for fechaCompra.
     *
     * @return the current value of fechaCompra
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Setter method for fechaCompra.
     *
     * @param aFechaCompra the new value for fechaCompra
     */
    public void setFechaCompra(LocalDate aFechaCompra) {
        fechaCompra = aFechaCompra;
    }

    /**
     * Compares the key for this instance with another Compras.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Compras and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Compras)) {
            return false;
        }
        Compras that = (Compras) other;
        if (this.getIdCompra() != that.getIdCompra()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Compras.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Compras)) return false;
        return this.equalKeys(other) && ((Compras)other).equalKeys(this);
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
        i = getIdCompra();
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
        StringBuffer sb = new StringBuffer("[Compras |");
        sb.append(" idCompra=").append(getIdCompra());
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
        ret.put("idCompra", Integer.valueOf(getIdCompra()));
        return ret;
    }

}
