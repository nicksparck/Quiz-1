package quiz.universidades.servicios;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import quiz.universidades.entidades.Uni;
import quiz.universidades.repositorio.UniRepos;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiciUni {
    UniRepos Unirespos;

    public Uni guardar(Uni usuario){
        return  Unirespos.save(usuario);
    }
    public List<Uni> listarTodos(){
        return Unirespos.findAll();
    }
}
