package adopet.api.repository;

import adopet.api.model.StatusAdocao;
import adopet.api.model.Tutor;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {

    Integer countByTutorIdAndStatus(Long idTutor, StatusAdocao statusAdocao);
}
