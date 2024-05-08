package com.prueba.Elemento_Tecnologico.entidades;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "celulares")
@Builder
@ToString

public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cel_codigo")
    private int codigo;

    @Column(name = "cel_marca")
    private String marca;

    @Column(name = "cel_modelo")
    private String modelo;

    @Column(name = "cel_color")
    private String color;

    @Column(name = "cel_referencia")
    private String referencia;

}
