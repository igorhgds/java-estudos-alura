package igor.henrique.api.service.validacoes;

import igor.henrique.api.dto.consulta.DadosAgendamentoConsultaDTO;
import igor.henrique.api.infra.exception.ValidacaoException;
import igor.henrique.api.repository.MedicoRepository;

public class ValidadoMedicoAtivo {

    private MedicoRepository medicoRepository;

    public void validar(DadosAgendamentoConsultaDTO dados) {
        //escolha do medico opcional
        if (dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = medicoRepository.findAtivoById(dados.idMedico());
        if (!medicoEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendado com médido excluido");
        }

    }
}
