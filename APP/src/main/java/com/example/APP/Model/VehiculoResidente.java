package com.example.APP.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VehiculoResidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String marca;
    private String modelo;
    private String color;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
