/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ifnmg.edu.trabalhobdfinal;

/**
 *
 * @author lucas
 */
public interface IDao <E, K> {
    
    /**
     * Operação de salvamento de entidade no banco de dados
     *
     * @param e Entidade a ser salva
     * @return Chave primária da entidade salva
     */
    public K salvar(E e);
    public Boolean excluir(E o);
}
