package quiz.universidades.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.universidades.entidades.Uni;

public interface UniRepos extends JpaRepository<Uni, Long> {
}
