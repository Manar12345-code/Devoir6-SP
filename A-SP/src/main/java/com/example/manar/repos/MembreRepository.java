package com.example.manar.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.manar.entities.Conservatoire;
import com.example.manar.entities.Membre;



@RepositoryRestResource(path = "rest")
public interface MembreRepository extends JpaRepository<Membre, Long> {
	List<Membre> findByNomM(String nom);
	List<Membre> findByNomMContains(String nom); 
	
	/*@Query("select p from Animal p where p.nomA like %?1 and p.couleur like %?2")
	List<Animal> findByNomCouleur (String nom, String couleur);*/
	
	@Query("select p from Membre p where p.nomM like %:nom and p.telC like %:telC")
	List<Membre> findByNomTel(@Param("nom") String nom,@Param("tel") Long tel);
	
	@Query("select p from Membre p where p.cons = ?1")
	List<Membre> findByCons(Conservatoire cons);

	List<Membre> findByConsNumC(Long num);
	
	List<Membre> findByOrderByNomAAsc();


}
