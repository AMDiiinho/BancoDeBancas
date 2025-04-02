/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.ufmt.poo.BandoDeBancas.service;

import java.util.*;
import main.PessoaDTO;

/**
 *
 * @author aluno
 */
public interface PessoaService {
    
    public void salvar(PessoaDTO dto);
    
    public void remover(PessoaDTO dto);
    
    public List<PessoaDTO> listar();
    
    public void testar();
    
}
