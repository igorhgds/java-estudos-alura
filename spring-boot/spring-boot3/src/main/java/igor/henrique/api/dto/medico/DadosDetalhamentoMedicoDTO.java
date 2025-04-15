package igor.henrique.api.dto.medico;

import igor.henrique.api.entity.Endereco;
import igor.henrique.api.entity.Medico;
import igor.henrique.api.enums.Especialidade;

public record DadosDetalhamentoMedicoDTO(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {
    public DadosDetalhamentoMedicoDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
