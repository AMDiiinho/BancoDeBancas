/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufmt.poo.BandoDeBancas.service.impl;

import br.ufmt.poo.BandoDeBancas.service.PessoaService;
import java.util.List;
import main.PessoaDTO;

/**
 *
 * @author aluno
 */
public class PessoaServiceImpl implements PessoaService {

    @Override
    public void salvar(PessoaDTO dto) {
        if(dto.getNome().equals("")){
            throw new RuntimeException("O campo nome não pode estar vazio!");
        }
    }

    @Override
    public void remover(PessoaDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PessoaDTO> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
