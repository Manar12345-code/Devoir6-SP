package com.example.manar.service;

import java.util.List;

import com.example.manar.entities.Conservatoire;
import com.example.manar.entities.Membre;


public interface MembreService {
	Membre saveMembre(Membre p);
	Membre updateMembre(Membre p);
	void deleteMembre(Membre p);
	void deleteMembreById(Long id);
	Membre getMembre(Long id);
	List<Membre> getAllMembres();

	List<Membre> findByNomM(String nom);
	List<Membre> findByNomAContains(String nom);
	List<Membre> findByNomTel(String nom, Long tel);
	List<Membre> findByConservatoire (Conservatoire Conservatoire);
	List<Membre> findByConservatoireNumC(Long id);
	List<Membre> findByOrderByNomAAsc();
	//List<Membre> trierProduitsNomsPrix();
}
