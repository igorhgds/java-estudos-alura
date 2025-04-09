package igor.henrique.api.dto;

import jakarta.validation.Valid;

public record AtualizacaoPacienteDTO(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEnderecoDTO endereco
) {
}
