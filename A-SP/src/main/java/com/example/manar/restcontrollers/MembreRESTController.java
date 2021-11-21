package com.example.manar.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.manar.entities.Membre;
import com.example.manar.service.MembreService;


@RestController
@RequestMapping("/api")
@CrossOrigin (origins="*")
public class MembreRESTController {
@Autowired
MembreService animalService;
@RequestMapping(path="all",method = RequestMethod.GET)
public List<Membre> getAllMembres() {
return animalService.getAllMembres();
}


@RequestMapping(value="/{numM}",method = RequestMethod.GET)
public Membre getMembreById(@PathVariable("numM") Long numM) {
return animalService.getMembre(numM);
 }

@RequestMapping(method = RequestMethod.POST)
public Membre createMembre(@RequestBody Membre animal) {
return animalService.saveMembre(animal);
}

@RequestMapping(method = RequestMethod.PUT)
public Membre updateMembre(@RequestBody Membre animal) {
return animalService.updateMembre(animal);
}

@RequestMapping(value="/{numM}",method = RequestMethod.DELETE)
public void Membre(@PathVariable("numM") Long numM)
{
	animalService.deleteMembreById(numM);
}

@RequestMapping(value="/membrecons/{numC}",method = RequestMethod.GET)
public List<Membre> getMembresByCatId(@PathVariable("numC") Long numC) {
return animalService.findByConservatoireNumC(numC);
}


}
