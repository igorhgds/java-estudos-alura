package igor.henrique.api.dto.paciente;

import igor.henrique.api.dto.DadosEnderecoDTO;
import jakarta.validation.Valid;

public record AtualizacaoPacienteDTO(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEnderecoDTO endereco
) {
}
