package com.example.manar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.manar.entities.Membre;


/*@SpringBootApplication
public class ASpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ASpApplication.class, args);
	}*/
@SpringBootApplication
public class MembresApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
public static void main(String[] args) {
SpringApplication.run(MembresApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(Membre.class);
}

}
