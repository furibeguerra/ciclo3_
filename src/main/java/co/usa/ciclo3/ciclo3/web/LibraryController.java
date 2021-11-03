package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.model.Library;
import co.usa.ciclo3.ciclo3.service.ServiciosLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Library")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class LibraryController {
    @Autowired
    private ServiciosLibrary serviciosLibrary;

    @GetMapping("/all")
    public List<Library> getLibrary(){
        return serviciosLibrary.getAll();
    }
    @GetMapping("/id")
    public Optional<Library> getLibrary(@PathVariable("id") int id){
        return serviciosLibrary.getLibrary(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Library save(@RequestBody Library m){
        return serviciosLibrary.save(m);
    }
}
