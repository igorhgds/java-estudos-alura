package igor.henrique.api.service.validacoes;

import igor.henrique.api.dto.consulta.DadosAgendamentoConsultaDTO;
import igor.henrique.api.infra.exception.ValidacaoException;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta{

    public void validar(DadosAgendamentoConsultaDTO dados) {
        var dataConsulta = dados.data();
        var agora = LocalDate.now();
        var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

        if (diferencaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com antecedencia minima de 30 minutos");
        }
    }
}
