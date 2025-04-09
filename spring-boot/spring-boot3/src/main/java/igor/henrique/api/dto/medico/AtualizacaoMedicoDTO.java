package igor.henrique.api.dto.medico;

import igor.henrique.api.dto.DadosEnderecoDTO;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoMedicoDTO(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEnderecoDTO endereco) {

}
