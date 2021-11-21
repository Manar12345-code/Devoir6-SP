package com.example.manar.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numM;
	private String nomM;
	private Long tel;
	private Date dateInscription;
	@ManyToOne
	private Conservatoire cons;
	public Membre( String nomM, Long tel, Date dateInscription) {
		super();
		this.nomM = nomM;
		this.tel = tel;
		this.dateInscription = dateInscription;
	}
	public Membre() {
		super();
	}
	public Long getNumM() {
		return numM;
	}
	public void setNumM(Long numM) {
		this.numM = numM;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Conservatoire getCons() {
		return cons;
	}
	public void setCons(Conservatoire cons) {
		this.cons = cons;
	}
	@Override
	public String toString() {
		return "Membre [numM=" + numM + ", nomM=" + nomM + ", tel=" + tel + ", dateInscription=" + dateInscription
				+ ", cons=" + cons + "]";
	}
}
