package igor.henrique.api.controller;

import igor.henrique.api.dto.CadastroMedicoDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody CadastroMedicoDTO dados){
        System.out.println(dados);
    }
}
