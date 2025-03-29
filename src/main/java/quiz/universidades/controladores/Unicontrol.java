package quiz.universidades.controladores;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import quiz.universidades.entidades.Uni;
import quiz.universidades.servicios.ServiciUni;

import java.util.List;

@RestController
@RequestMapping("/Uni")
@AllArgsConstructor
public class Unicontrol {
    ServiciUni serviciUni;

    @PostMapping("/")
    public Uni guardar(@RequestBody Uni usuario){
        System.out.println("Este es el usuario:\n"+ usuario);
        return serviciUni.guardar(usuario);
    }

    @GetMapping("/")
    public List<Uni> listar(){
        return serviciUni.listarTodos();
    }


}


