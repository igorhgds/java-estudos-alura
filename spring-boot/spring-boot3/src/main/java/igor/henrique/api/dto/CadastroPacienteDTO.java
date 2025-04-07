package igor.henrique.api.dto;

public record CadastroPacienteDTO(String nome,
                                  String email,
                                  String telefone,
                                  String cpf,
                                  DadosEnderecoDTO endereco) {
}
