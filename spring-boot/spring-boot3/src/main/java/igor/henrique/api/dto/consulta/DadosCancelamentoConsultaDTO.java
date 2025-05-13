package igor.henrique.api.dto.consulta;

import igor.henrique.api.enums.MotivoCancelamento;
import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsultaDTO (
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
