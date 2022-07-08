/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.trabalhobdfinal;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Guerra {
    
    private String nome;
    private LocalDate inicio;
    private LocalDate fim;

    public Guerra() {
    }

    public Guerra(String nome, LocalDate inicio, LocalDate fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Guerra{" + "nome=" + nome + ", inicio=" + inicio + ", fim=" + fim + '}';
    }
    
}
