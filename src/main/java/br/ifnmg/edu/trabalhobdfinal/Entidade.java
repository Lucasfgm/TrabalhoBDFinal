/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.trabalhobdfinal;

/**
 *
 * @author lucas
 */
public abstract class Entidade {
    // Representação da chave primária padrão para a entidade.
    private Long id;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    protected Entidade() {
    }

    protected Entidade(Long id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //</editor-fold>

}
