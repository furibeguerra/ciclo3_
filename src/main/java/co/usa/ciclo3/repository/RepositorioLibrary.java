
package co.usa.ciclo3.repository;

import co.usa.ciclo3.ciclo3.repository.crud.InterfaceLibrary;
import co.usa.ciclo3.ciclo3.model.Library;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RepositorioLibrary {
  @Autowired
    private InterfaceLibrary interfacelibrary;
    public List<Library> getAll(){
        return (List<Library>) interfacelibrary.findAll();
    }
    public Optional<Library> getLibrary(int id){
        return interfacelibrary.findById(id);
    }
    public Library save(Library m){
        return interfacelibrary.save(m);
    }
}
