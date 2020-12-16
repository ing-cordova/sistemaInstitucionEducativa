package com.unab.adminEscolar.Entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Data;

@Data
@Entity
@Table(name = "materias")
public class Materias {
	
private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmateria")
	private Long idMateria;
	
	@ManyToOne
	@JoinColumn(name = "idgradoacademico")
	private Grados_Academicos idGradoAcademico;
	
	@Column(name = "nombre_materia")
	private String Nombre_Materia;
	
	@Column(name = "ultima_modificacion")
	private Date Ultima_Modificacion;
	
	@Column(name = "estado")
	private int Estado;

	public Long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	public Grados_Academicos getIdGradoAcademico() {
		return idGradoAcademico;
	}

	public void setIdGradoAcademico(Grados_Academicos idGradoAcademico) {
		this.idGradoAcademico = idGradoAcademico;
	}

	public String getNombre_Materia() {
		return Nombre_Materia;
	}

	public void setNombre_Materia(String nombre_Materia) {
		Nombre_Materia = nombre_Materia;
	}

	public Date getUltima_Modificacion() {
		return Ultima_Modificacion;
	}

	public void setUltima_Modificacion(Date ultima_Modificacion) {
		Ultima_Modificacion = ultima_Modificacion;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
