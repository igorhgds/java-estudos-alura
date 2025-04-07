package igor.henrique.api.dto;

import igor.henrique.api.medico.Especialidade;

public record CadastroMedicoDTO(String nome, String email, String crm, Especialidade especialidade, DadosEnderecoDTO endereco) {
}
