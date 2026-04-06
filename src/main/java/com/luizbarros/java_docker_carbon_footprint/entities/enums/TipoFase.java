package com.luizbarros.java_docker_carbon_footprint.entities.enums;

public enum TipoFase {
    PRE_PALESTRA("Dados antes da palestra"),
    POS_PALESTRA("Dados após a palestra");

    private String descricao;

    TipoFase(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
