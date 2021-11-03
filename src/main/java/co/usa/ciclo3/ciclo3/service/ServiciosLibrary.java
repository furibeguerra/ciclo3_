
package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.repository.RepositorioLibrary;
import co.usa.ciclo3.ciclo3.model.Library;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosLibrary {
    
    @Autowired
    private RepositorioLibrary metodosCrud;
    
    public List<Library> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Library> getLibrary(int IdLibrary) {
        return metodosCrud.getLibrary(IdLibrary);
    }
    
    public Library save (Library library){
        if (library.getIdLibrary()==null){
            return metodosCrud.save(library);
        }else{
            Optional<Library> evt=metodosCrud.getLibrary(library.getIdLibrary());
            if(evt.isEmpty()){
            return metodosCrud.save(library);
            }else{
                return library;
            }
        }   
    }
}       
 