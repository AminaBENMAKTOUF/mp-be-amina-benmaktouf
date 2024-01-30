package soa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import soa.entities.Categorie;

import soa.repository.CategorieRepository;


@RestController // pour déclarer un service web de type REST
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories")  //    http://localhost:3333/categories
public class CategorieRESTController {

    @Autowired // pour l'injection de dépendances
    private CategorieRepository categRepos;

    @GetMapping(
        // spécifier le path de la méthode
        value= "/",
        // spécifier le format de retour en XML
        produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
)
public  List<Categorie> getAllCategories() {
    return categRepos.findAll();

}





}