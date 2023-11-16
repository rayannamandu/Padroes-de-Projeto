package com.SistemaDeLojas.classes;

public class Endereco {

    private String nomeDaRua;
    private String numeroDaCasa;
    private String bairro;
    private String cidade;
    private String sstado;
    private String pais;

    public Endereco(String nomeDaRua, String numeroDaCasa, String bairro, String cidade, String sstado, String pais) {
        this.nomeDaRua = nomeDaRua;
        this.numeroDaCasa = numeroDaCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.sstado = sstado;
        this.pais = pais;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(String numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSstado() {
        return sstado;
    }

    public void setSstado(String sstado) {
        this.sstado = sstado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
