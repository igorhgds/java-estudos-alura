package igor.henrique.api.dto.consulta;

import com.fasterxml.jackson.annotation.JsonFormat;
import igor.henrique.api.enums.Especialidade;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsultaDTO (
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
        LocalDateTime data,

        Especialidade especialidade){
}
