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

@Entity(name="productos")
public class Productos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6002286056060619076L;

	/** Primary key. */
    protected static final String PK = "idProducto";

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto", unique=true, nullable=false, precision=10)
    private int idProducto;
    @Column(name="nombre_producto", nullable=false, length=30)
    private String nombreProducto;
    @Column(name="descripcion_producto", nullable=false)
    private String descripcionProducto;
    @Column(name="stock_producto", nullable=false, precision=10)
    private int stockProducto;
    @Column(name="precio_producto", nullable=false, precision=22)
    private double precioProducto;

    /** Default constructor. */
    public Productos() {
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
     * Access method for nombreProducto.
     *
     * @return the current value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Setter method for nombreProducto.
     *
     * @param aNombreProducto the new value for nombreProducto
     */
    public void setNombreProducto(String aNombreProducto) {
        nombreProducto = aNombreProducto;
    }

    /**
     * Access method for descripcionProducto.
     *
     * @return the current value of descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Setter method for descripcionProducto.
     *
     * @param aDescripcionProducto the new value for descripcionProducto
     */
    public void setDescripcionProducto(String aDescripcionProducto) {
        descripcionProducto = aDescripcionProducto;
    }

    /**
     * Access method for stockProducto.
     *
     * @return the current value of stockProducto
     */
    public int getStockProducto() {
        return stockProducto;
    }

    /**
     * Setter method for stockProducto.
     *
     * @param aStockProducto the new value for stockProducto
     */
    public void setStockProducto(int aStockProducto) {
        stockProducto = aStockProducto;
    }

    /**
     * Access method for precioProducto.
     *
     * @return the current value of precioProducto
     */
    public double getPrecioProducto() {
        return precioProducto;
    }

    /**
     * Setter method for precioProducto.
     *
     * @param aPrecioProducto the new value for precioProducto
     */
    public void setPrecioProducto(double aPrecioProducto) {
        precioProducto = aPrecioProducto;
    }

    /**
     * Compares the key for this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Productos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Productos)) {
            return false;
        }
        Productos that = (Productos) other;
        if (this.getIdProducto() != that.getIdProducto()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Productos)) return false;
        return this.equalKeys(other) && ((Productos)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Productos |");
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
