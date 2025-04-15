package igor.henrique.api.controller;

import igor.henrique.api.dto.medico.AtualizacaoMedicoDTO;
import igor.henrique.api.dto.medico.CadastroMedicoDTO;
import igor.henrique.api.dto.medico.DadosDetalhamentoMedicoDTO;
import igor.henrique.api.dto.medico.ListagemMedicosDTO;
import igor.henrique.api.entity.Medico;
import igor.henrique.api.repository.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid CadastroMedicoDTO dados){
        repository.save(new Medico(dados));

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<ListagemMedicosDTO>> listar(@PageableDefault(size = 5, sort = "nome") Pageable paginacao){
        var page = repository.findAllByAtivoTrue(paginacao).map(ListagemMedicosDTO::new);

        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid AtualizacaoMedicoDTO dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoMedicoDTO(medico));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity remover(@PathVariable Long id){
        //repository.deleteById(id); exclui de uma vez do banco de dados
        var medico = repository.getReferenceById(id);
        medico.excluir();

        return ResponseEntity.noContent().build();
    }
}