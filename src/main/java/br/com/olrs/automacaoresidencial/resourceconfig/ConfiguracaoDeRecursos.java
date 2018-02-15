package br.com.olrs.automacaoresidencial.resourceconfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

//http://localhost:8080/
@ApplicationPath("rest")
public class ConfiguracaoDeRecursos extends ResourceConfig{

    public ConfiguracaoDeRecursos() {
        packages("br.com.olrs");
    }
	
}
