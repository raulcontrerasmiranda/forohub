package com.alura.forohub.controlador;

import com.alura.forohub.modelo.Topico;
import com.alura.forohub.servicio.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @GetMapping
    public List<Topico> listarTopicos() {
        return topicoService.listarTopicos();
    }

    @PostMapping
    public Topico crearTopico(@RequestBody Topico topico) {
        return topicoService.crearTopico(topico);
    }

    @DeleteMapping("/{id}")
    public String eliminarTopico(@PathVariable Long id) {
        topicoService.eliminarTopico(id);
        return "Tópico eliminado exitosamente";
    }
}
