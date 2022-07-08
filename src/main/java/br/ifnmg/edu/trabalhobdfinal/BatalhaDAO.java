/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifnmg.edu.trabalhobdfinal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lucas
 */

/*
CREATE TABLE BATALHA (
NOMEGUERRA VARCHAR2(100),
NOME VARCHAR2(50),
LOCAL VARCHAR2(100)
);
*/
public class BatalhaDAO extends DAO <Batalha, Long> {

    @Override
    public String obterSentencaInsert() {
        return "INSERT INTO BATALHA (NOMEGUERRA, NOME, LOCAL) VALUES(?,?,?);";
    }

    @Override
    public String obterSentencaUpdate() {
      return "update batalha set NOMEGUERRA = ?, NOME = ?, LOCAL = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
         return "select id, NOMEGUERRA, NOME, LOCAL from batalha where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, NOMEGUERRA, NOME, LOCAL from batalha where excluido = false;";
    }


    @Override
    public String getDeclaracaoDelete() {
        return "delete from batalha where id = ?";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Batalha e) {
           
         
        try{
             pstmt.setString(1, e.getNomeGuerra());
             pstmt.setString(2, e.getNome());
             pstmt.setString(3, e.getLocal());
              
        }catch 
        
    }

    @Override
    public Batalha extrairObjeto(ResultSet resultSet) {
        
    }

 @Override
    public String obterSentencaMoverParaLixeira() {
        
    }
}
