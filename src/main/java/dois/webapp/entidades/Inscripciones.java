package dois.webapp.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="inscripciones")
public class Inscripciones implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inscripciones_id_seq")
    @SequenceGenerator(name = "inscripciones_id_seq", sequenceName = "inscripciones_id_seq", allocationSize = 1)
    
    @Column(name="id")
    private Integer id;
    
    @Column(name="idusuario")
    private Integer idusuario;
    
    @Column(name="idmateria")
    private Integer idmateria;
    
    @Column(name="ciclo")
    private String ciclo;
    
    @Column(name="anio")
    private short anio;
    
    @Column(name="fechadeinscripcion")
    private Date fechadeinscripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Integer idmateria) {
        this.idmateria = idmateria;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public Date getFechadeinscripcion() {
        return fechadeinscripcion;
    }

    public void setFechadeinscripcion(Date fechadeinscripcion) {
        this.fechadeinscripcion = fechadeinscripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inscripciones other = (Inscripciones) obj;
        return Objects.equals(this.id, other.id);
    }

    public Inscripciones(Integer id) {
        this.id = id;
    }

    public Inscripciones(Integer id, Integer idusuario, Integer idmateria, String ciclo, short anio, Date fechadeinscripcion) {
        this.id = id;
        this.idusuario = idusuario;
        this.idmateria = idmateria;
        this.ciclo = ciclo;
        this.anio = anio;
        this.fechadeinscripcion = fechadeinscripcion;
    }

    public Inscripciones() {
    }

    public Inscripciones(Integer idusuario, Integer idmateria, String ciclo, short anio, Date fechadeinscripcion) {
        this.idusuario = idusuario;
        this.idmateria = idmateria;
        this.ciclo = ciclo;
        this.anio = anio;
        this.fechadeinscripcion = fechadeinscripcion;
    }
    
}
