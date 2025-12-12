package igor.henrique.api.service.validacoes.cancelamento;

import igor.henrique.api.dto.consulta.DadosCancelamentoConsultaDTO;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsultaDTO dados);
}
