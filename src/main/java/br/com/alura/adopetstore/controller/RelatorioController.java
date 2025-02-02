package br.com.alura.adopetstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/relatorios")
public class RelatorioController {
    /*
    @Autowired
    private RelatorioService service;

    @GetMapping("estoque")
    public ResponseEntity<RelatorioEstoque> obterInfoEstoque(){
        var relatorio = service.infoEstoque();
        return ResponseEntity.ok(relatorio);
    }

    @GetMapping("faturamento")
    public ResponseEntity<RelatorioFaturamento> obterInfoFaturamento(){
        var relatorio = service.faturamentoObtido();
        return ResponseEntity.ok(relatorio);
    }
    */
}