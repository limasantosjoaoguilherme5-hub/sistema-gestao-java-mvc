package br.com.projeto.model;

public class Equipamento {
    private int id;
    private String nome;
    private String modelo;
    private String numeroSerie;

    // Construtor vazio (necessário para o DAO)
    public Equipamento() {}

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
}