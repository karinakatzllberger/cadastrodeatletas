package com.crud.portifolio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "atleta")
public class Atleta {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id_atleta")
    private long id;

    @Column (name = "tx_name")
    private String name;

    @Column (name = "int_idade")
    private int idade;

    @Column (name = "tx_posicao")
    private String posicao;



}
