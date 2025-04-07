package igor.henrique.api.controller;

import igor.henrique.api.dto.CadastroMedicoDTO;
import igor.henrique.api.dto.ListagemMedicosDTO;
import igor.henrique.api.entity.Endereco;
import igor.henrique.api.entity.Medico;
import igor.henrique.api.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroMedicoDTO dados){
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<ListagemMedicosDTO> listar(){
        return repository.findAll().stream()
                .map(ListagemMedicosDTO::new)
                .toList();
    }
}
