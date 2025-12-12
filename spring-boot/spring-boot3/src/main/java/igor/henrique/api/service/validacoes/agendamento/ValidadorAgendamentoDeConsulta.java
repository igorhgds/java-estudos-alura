package igor.henrique.api.service.validacoes.agendamento;

import igor.henrique.api.dto.consulta.DadosAgendamentoConsultaDTO;

public interface ValidadorAgendamentoDeConsulta {

    void validar(DadosAgendamentoConsultaDTO dados);
}
