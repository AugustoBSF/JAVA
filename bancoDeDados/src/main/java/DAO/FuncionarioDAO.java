package DAO;


import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    public void cadastrarFunciuonario(FuncionarioDTO funcionariodto){
        String sql = "insert into tabela(nome,cidade)values(?,?)";
        conn = new Conexao().conectaaBd();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionariodto.getCidadeFuncionario());
            pstm.setString(2, funcionariodto.getCidadeFuncionario());
            pstm.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e + "FuncionarioDAO");
        }
        
    }
    
}

