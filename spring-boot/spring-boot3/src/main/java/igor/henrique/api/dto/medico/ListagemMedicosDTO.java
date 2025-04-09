package igor.henrique.api.dto.medico;

import igor.henrique.api.entity.Medico;

public record ListagemMedicosDTO(Long id, String nome, String email, String crm, Especialidade especialidade) {

    public ListagemMedicosDTO(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
