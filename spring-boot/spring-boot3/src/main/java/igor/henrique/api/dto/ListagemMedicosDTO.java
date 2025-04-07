package igor.henrique.api.dto;

import igor.henrique.api.entity.Medico;
import igor.henrique.api.medico.Especialidade;

public record ListagemMedicosDTO(String nome, String email, String crm, Especialidade especialidade) {

    public ListagemMedicosDTO(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
