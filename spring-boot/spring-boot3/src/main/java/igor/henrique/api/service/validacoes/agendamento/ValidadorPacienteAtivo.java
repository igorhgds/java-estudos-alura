package igor.henrique.api.service.validacoes.agendamento;

import igor.henrique.api.dto.consulta.DadosAgendamentoConsultaDTO;
import igor.henrique.api.infra.exception.ValidacaoException;
import igor.henrique.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private PacienteRepository pacienteRepository;

    public void validar(DadosAgendamentoConsultaDTO dados){
        var pacienteEstaAtivo = pacienteRepository.findAtivoById(dados.idPaciente());
        if (!pacienteEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com paciente excluido");
        }
    }
}
