package br.fiap.assistencia_tecnica.web.controller;

import br.fiap.assistencia_tecnica.domain.Equipamento;
import br.fiap.assistencia_tecnica.service.EquipamentoService;
import br.fiap.assistencia_tecnica.web.dto.EquipamentoDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {
    private final EquipamentoService service;

    public EquipamentoController(EquipamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Equipamento inserir(@RequestBody EquipamentoDTO equipamentoDTO) {
        return service.inserir(equipamentoDTO);
    }
}
