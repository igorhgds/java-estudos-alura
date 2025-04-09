package igor.henrique.api.dto;

import jakarta.validation.constraints.NotNull;

public record AtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO endereco) {

}
