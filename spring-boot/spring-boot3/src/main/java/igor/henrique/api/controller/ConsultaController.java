package igor.henrique.api.controller;

import igor.henrique.api.dto.consulta.DadosAgendamentoConsultaDTO;
import igor.henrique.api.dto.consulta.DadosDetalhamentoConsultaDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsultaDTO dados) {
        System.out.println(dados);
        return ResponseEntity.ok(new DadosDetalhamentoConsultaDTO(null, null, null, null));
    }

}
