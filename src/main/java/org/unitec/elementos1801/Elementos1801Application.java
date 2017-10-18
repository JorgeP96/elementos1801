package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner{

    @Autowired RepositorioMensajito repoMensa;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // repoMensa
        //repoMensa.save(new Mensaje("17 de Octubre", "No temblo"));
        //System.out.println("Si se guardo");

        /*System.out.println("Vamos a buscar todos");
        for(Mensaje mensa:repoMensa.findAll()){
            System.out.println(mensa);
        }

        System.out.println("Vamos a buscar por id");
        System.out.println(repoMensa.findOne(1));

        System.out.println("Actualizar");
        repoMensa.save(new Mensaje(1,"Nuevo titulo", "Nuevo cuerpo"));*/

        //System.out.println("Eliminar por id");
        //repoMensa.delete(1);

        System.out.println("Buscar por titulo");
        for(Mensaje mensa:repoMensa.findByTitulo("Nuevo titulo")){
            System.out.println(mensa)
        }
    }
}
