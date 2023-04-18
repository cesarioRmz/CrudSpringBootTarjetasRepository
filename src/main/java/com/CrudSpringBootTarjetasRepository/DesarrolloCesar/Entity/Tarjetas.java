package com.CrudSpringBootTarjetasRepository.DesarrolloCesar.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "AATARJETAS")
public class Tarjetas {

	@Id
	private int id;
	private String tipo_tarjeta;
	private String banco;
	private String titular;
	@Column(name = "NUMTARJETA", columnDefinition="NVARCHAR2(100)")
	private String numTarjeta;
	private Date fechaVencimiento;
	private int cvv;
	private double saldo;
	
}
/*ID NUMBER PRIMARY KEY,
TIPO_TARJETA NVARCHAR2(100),
BANCO NVARCHAR2(100),
TITULAR NVARCHAR2(100),
NUMTARJETA NVARCHAR2(100),
FECHA_VENCIMIENTO DATE,
CVV NUMBER,
SALDO NUMBER*/