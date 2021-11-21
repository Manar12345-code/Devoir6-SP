package com.example.manar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manar.entities.Conservatoire;
import com.example.manar.entities.Membre;
import com.example.manar.repos.MembreRepository;


@Service
public class MembreServiceImpl implements MembreService {
	
	@Autowired
	private MembreRepository MembreRepository;

	@Override
	public Membre saveMembre(Membre p) {
		return MembreRepository.save(p);
	}

	@Override
	public Membre updateMembre(Membre p) {
		return MembreRepository.save(p);
	}

	@Override
	public void deleteMembre(Membre p) {
		 MembreRepository.delete(p);
		
	}

	@Override
	public void deleteMembreById(Long id) {
		MembreRepository.deleteById(id);

		
	}

	@Override
	public Membre getMembre(Long id) {
		return MembreRepository.findById(id).get();

	}

	@Override
	public List<Membre> getAllMembres() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByNomM(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByNomAContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByNomTel(String nom, Long tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByConservatoire(Conservatoire Conservatoire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByConservatoireNumC(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Membre> findByOrderByNomAAsc() {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public List<Membre> getAllMembres() {
		return MembreRepository.findAll();

	}

	@Override
	public List<Membre> findByNomM(String nom) {
		return MembreRepository.findByNomA(nom);
		}

	@Override
	public List<Membre> findByNomAContains(String nom) {
		
		return MembreRepository.findByNomMContains(nom);
	}

	@Override
	public List<Membre> findByNomTel(String nom, Long tel) {
		return MembreRepository.findByNomTel(nom, tel);
	}

	@Override
	public List<Membre> findByConservatoire(Conservatoire Conservatoire) {
		return MembreRepository.findByCons(Conservatoire);
	}

	@Override
	public List<Membre> findByConservatoireNumC(Long id) {
		return MembreRepository.findByConsNumC(id);
	}

	@Override
	public List<Membre> findByOrderByNomAAsc() {
		return MembreRepository.findByOrderByNomAAsc();
	}


*/
	

}

