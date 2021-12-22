package ar.edu.davinci.dvds20212cg7.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



// Configuración inicial de JPA de la entidad prendas
@Entity
@Table(name="prendas")

// Configuración de lombok
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Prenda {
	
	
	// Configuración por JPA de la PK de la tabla
	@Id
	// Configuración por JPA de la manera en que se generan los IDs autogenerados en MySQL
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	// Configuración por JPA del nombre de la columna
	@Column(name = "prd_id")
	private Long id;
	
	@Column(name =  "prd_descripcion", nullable=false)
	private String descripcion;
	
	@Column(name = "prd_tipo_prenda")
	@Enumerated(EnumType.STRING)
	private TipoPrenda tipo;
	
	@Column(name = "prd_precio_base")
	private BigDecimal precioBase;
	
	public BigDecimal getPrecioFinal(){
		return precioBase;
	}

}
