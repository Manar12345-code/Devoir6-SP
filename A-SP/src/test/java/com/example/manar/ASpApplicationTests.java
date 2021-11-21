package com.example.manar;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.manar.entities.Conservatoire;
import com.example.manar.entities.Membre;
import com.example.manar.repos.MembreRepository;


@SpringBootTest
class ASpApplicationTests {

	@Autowired
	private MembreRepository MembreRepository;
	@Test
	public void testCreateMembre() {
	Membre anim = new Membre("minouche", (long) 12345,new Date());
	MembreRepository.save(anim);
	}
	
	 @Test
	 public void testFindMembre()
	 {
		 Membre p = MembreRepository.findById(1L).get(); 
	 System.out.println(p);
	 }
	 @Test
	 public void testUpdateMembre()
	 {
		 Membre p = MembreRepository.findById(1L).get();
	 p.setTel((long) 12345);
	 MembreRepository.save(p);
	 }
	 @Test
	 public void testDeleteMembre()
	 {
		 MembreRepository.deleteById(1L);;
	 }
	  
	 @Test
	 public void testListerTousMembres()
	 {
	 List<Membre> anim = MembreRepository.findAll();
	 for (Membre p : anim)
	 {
	 System.out.println(p);
	 }
	 }

	 @Test
	 public void testFindByNomA()
	 {
	 List<Membre> prods = MembreRepository.findByNomM("minouche");
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomAContains ()
	 {
	 List<Membre> prods=MembreRepository.findByNomMContains("minouche");
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomTel()
	 {
	 List<Membre> prods = MembreRepository.findByNomTel("minouche", (long) 123457);
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByConservatoire()
	 {
	 Conservatoire cat = new Conservatoire();
	 cat.setNumC(1L);
	 List<Membre> prods = MembreRepository.findByCons(cat);
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByConservatoirenumC()
	 {
	 List<Membre> prods = MembreRepository.findByConsNumC(2L);
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomAAsc()
	 {
	 List<Membre> prods = MembreRepository.findByOrderByNomAAsc();
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 
	 

}
