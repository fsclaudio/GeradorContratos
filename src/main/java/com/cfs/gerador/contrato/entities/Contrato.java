package com.cfs.gerador.contrato.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String razãoSocialContratada;
    private String nomeFantasiaContratada;
    private String CNPJContratada;
    private String logradouroContratada;
    private String bairroContratada;
    private String cidadeContratada;
    private String estadoContratada;
    private String cepContratada;
    private float faturamentoContratada;
    private int numeroLojas;
    private String razãoSocialContratante;
    private String nomeFantasiaContratante;
    private String CNPJContratante;
    private String logradouroContratante;
    private String bairroContratante;
    private String cidadeContratante;
    private String estadoContratante;
    private String cepContratante;
    private Date dataAbertura;
    private Date dataTermino;
    private float valor;
    private int numeroParcelas;
    private int diaVencimentoParcela;
    private float valorParcela ;
    private float valorParcelaLoja;
}
