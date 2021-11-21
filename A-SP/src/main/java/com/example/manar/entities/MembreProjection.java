package com.example.manar.entities;

import org.springframework.data.rest.core.config.Projection;

public interface MembreProjection {
	@Projection(name = "nomM", types = { Membre.class })
	public interface MembeProjection {
	public String getNomM();
}
}