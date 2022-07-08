/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.trabalhobdfinal;

/**
 *
 * @author lucas
 */
public class Batalha {
    
    private String nomeGuerra;
    private String nome;
    private String local;

    public Batalha() {
    }

    public Batalha(String nomeGuerra, String nome, String local) {
        this.nomeGuerra = nomeGuerra;
        this.nome = nome;
        this.local = local;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Batalha{" + "nomeGuerra=" + nomeGuerra + ", nome=" + nome + ", local=" + local + '}';
    }
    
}
