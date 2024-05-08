package com.prueba.Elemento_Tecnologico.servicios;

import com.prueba.Elemento_Tecnologico.entidades.Celular;
import com.prueba.Elemento_Tecnologico.operaciones.OperacionesCelular;
import com.prueba.Elemento_Tecnologico.repositorio.RepositorioCelular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiciosCelular implements OperacionesCelular {

    @Autowired
    RepositorioCelular repositorioCelular;

    public List<Celular> consultarTodos() {
        return repositorioCelular.findAll();
    }

}
