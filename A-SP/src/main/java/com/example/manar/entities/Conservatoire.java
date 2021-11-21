package com.example.manar.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.manar.entities.Membre;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conservatoire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numC;
	private String nomC;
	private Long telC;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cons")
	private List<Membre> membres;
	
	public Conservatoire( String nomC, Long telC,  List<Membre> membres) {
		super();
		this.nomC = nomC;
		this.telC = telC;
		this.membres=membres;	
	}
	public Long getNumC() {
		return numC;
	}

	public void setNumC(Long numC) {
		this.numC = numC;
	}

	public String getNomC() {
		return nomC;
	}

	public void setNomC(String nomC) {
		this.nomC = nomC;
	}

	public Long getTelC() {
		return telC;
	}

	public void setTelf(Long telC) {
		this.telC = telC;
	}

	public List<Membre> getMembres() {
		return membres;
	}

	public void setAnimals(List<Membre> membres) {
		this.membres = membres;
	}
	
	

	@Override
	public String toString() {
		return "Conservatoire [numC=" + numC + ", nomC=" + nomC + ", telC=" + telC + ", membres=" + membres + "]";
	}
	
	
	
	
}
