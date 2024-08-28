package edu.ifmt.adocao.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeAdotante;
	private String animal;
    private String racaAdotada;
    private int idade;
	@Enumerated(EnumType.STRING) //salvará no db como String
	private StatusTitulo status;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
    private LocalDate dataDeAdocao;
    
	public Long getId() {
		return id;
	}
	public String getNomeAdotante() {
		return nomeAdotante;
	}
	public void setNomeAdotante(String nomeAdotante) {
		this.nomeAdotante = nomeAdotante;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getRacaAdotada() {
		return racaAdotada;
	}
	public void setRacaAdotada(String racaAdotada) {
		this.racaAdotada = racaAdotada;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public StatusTitulo getStatus() {
		return status;
	}
	public void setStatus(StatusTitulo status) {
		this.status = status;
	}
	public LocalDate getDataDeAdocao() {
		return dataDeAdocao;
	}
	public void setDataDeAdocao(LocalDate dataDeAdocao) {
		this.dataDeAdocao = dataDeAdocao;
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
		Titulo other = (Titulo) obj;
		return Objects.equals(id, other.id);
	}
	public boolean isVacinado() {
		return StatusTitulo.VACINADO.equals(this.status);
	}
}
