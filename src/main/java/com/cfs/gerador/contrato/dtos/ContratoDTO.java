package com.cfs.gerador.contrato.dtos;

import com.cfs.gerador.contrato.entities.Contrato;
import lombok.Data;

import java.util.Date;

@Data
public class ContratoDTO {
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

    public ContratoDTO(Contrato entity){
        this.id = entity.getId();
        this.dataAbertura = entity.getDataAbertura();
        this.dataTermino = entity.getDataTermino();
        this.valor = entity.getValor();
        this.valorParcela = entity.getValorParcela();
        this.numeroParcelas = entity.getNumeroParcelas();
        this.razãoSocialContratada = entity.getRazãoSocialContratada();
        this.nomeFantasiaContratada = entity.getNomeFantasiaContratada();
        this.cepContratada = entity.getCepContratada();
        this.CNPJContratada = entity.getCNPJContratada();
        this.logradouroContratada = entity.getLogradouroContratada();
        this.cidadeContratada = entity.getCidadeContratada();
        this.estadoContratada = entity.getEstadoContratada();
        this.numeroLojas = entity.getNumeroLojas();
        this.faturamentoContratada = entity.getFaturamentoContratada();
        this.bairroContratada = entity.getBairroContratada();
        this.razãoSocialContratante = entity.getRazãoSocialContratante();
        this.nomeFantasiaContratante = entity.getNomeFantasiaContratante();
        this.CNPJContratante = entity.getCNPJContratante();
        this.logradouroContratante = entity.getLogradouroContratante();
        this.bairroContratante = entity.getBairroContratante();
        this.cidadeContratante = entity.getCidadeContratante();
        this.estadoContratante = entity.getEstadoContratante();
        this.cepContratante = entity.getCepContratante();
        this.diaVencimentoParcela = entity.getDiaVencimentoParcela();
        this.valorParcelaLoja = entity.getValorParcelaLoja();
    }
}
