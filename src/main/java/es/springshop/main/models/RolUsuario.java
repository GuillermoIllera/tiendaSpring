// Generated with g9.

package es.springshop.main.models;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="rol_usuario")
public class RolUsuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2676331557727566626L;

	/** Primary key. */
    protected static final String PK = "idUsuario";

    @Id
    @Column(name="id_usuario", unique=true, nullable=false, precision=10)
    private int idUsuario;
    @Column(name="id_rol", nullable=false, precision=10)
    private int idRol;

    /** Default constructor. */
    public RolUsuario() {
        super();
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
     * Access method for idRol.
     *
     * @return the current value of idRol
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Setter method for idRol.
     *
     * @param aIdRol the new value for idRol
     */
    public void setIdRol(int aIdRol) {
        idRol = aIdRol;
    }

    /**
     * Compares the key for this instance with another RolUsuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RolUsuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RolUsuario)) {
            return false;
        }
        RolUsuario that = (RolUsuario) other;
        if (this.getIdUsuario() != that.getIdUsuario()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RolUsuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RolUsuario)) return false;
        return this.equalKeys(other) && ((RolUsuario)other).equalKeys(this);
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
        i = getIdUsuario();
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
        StringBuffer sb = new StringBuffer("[RolUsuario |");
        sb.append(" idUsuario=").append(getIdUsuario());
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
        ret.put("idUsuario", Integer.valueOf(getIdUsuario()));
        return ret;
    }

}
