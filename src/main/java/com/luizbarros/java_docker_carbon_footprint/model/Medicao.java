package com.luizbarros.java_docker_carbon_footprint.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataLeitura;
    private Double kmRodados;
    private Double kwhConsumido;
    private Double totalCo2;

    @Enumerated(EnumType.STRING)
    private TipoFase tipo;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public Medicao() {
    }
    
    public Medicao(LocalDate dataLeitura, Double kmRodados, Double kwhConsumido, TipoFase tipo, Funcionario funcionario) {
        this.dataLeitura = dataLeitura;
        this.kmRodados = kmRodados;
        this.kwhConsumido = kwhConsumido;
        this.tipo = tipo;
        this.funcionario = funcionario;  
    }
   
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataLeitura() {
		return dataLeitura;
	}

	public void setDataLeitura(LocalDate dataLeitura) {
		this.dataLeitura = dataLeitura;
	}

	public Double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(Double kmRodados) {
		this.kmRodados = kmRodados;
	}

	public Double getKwhConsumido() {
		return kwhConsumido;
	}

	public void setKwhConsumido(Double kwhConsumido) {
		this.kwhConsumido = kwhConsumido;
	}

	public Double getTotalCo2() {
		return totalCo2;
	}

	public void setTotalCo2(Double totalCo2) {
		this.totalCo2 = totalCo2;
	}

	public TipoFase getTipo() {
		return tipo;
	}

	public void setTipo(TipoFase tipo) {
		this.tipo = tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicao other = (Medicao) obj;
		return Objects.equals(id, other.id);
	}
}
