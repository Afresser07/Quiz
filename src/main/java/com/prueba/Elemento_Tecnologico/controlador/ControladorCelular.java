package com.prueba.Elemento_Tecnologico.controlador;

import com.prueba.Elemento_Tecnologico.entidades.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.prueba.Elemento_Tecnologico.servicios.ServiciosCelular;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorCelular {

    @Autowired
    ServiciosCelular serviciosCelular;

    @GetMapping("/listarCelulares")
    public String listarCelulares(Model model) {
        model.addAttribute("listaCelulares", serviciosCelular.consultarTodos());

        for (Celular celular : serviciosCelular.consultarTodos()) {
            System.out.println(celular);
        }

        System.out.println("Listar");

        return "listaCelulares"; // nombre de la vista que se mostrará
    }
}