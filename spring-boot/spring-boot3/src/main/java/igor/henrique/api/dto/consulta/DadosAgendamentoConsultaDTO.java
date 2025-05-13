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
        //@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data,

        Especialidade especialidade){
}
