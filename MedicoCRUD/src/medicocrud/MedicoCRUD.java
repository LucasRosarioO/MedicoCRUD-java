/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicocrud;

import apresentacao.JFrameMedico;

/**
 *
 * @author Lucas Rosario de Oliveira - 2017101742
 */
public class MedicoCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameMedico jFrameMedico = new JFrameMedico(); //Cria o objeto Janela
        jFrameMedico.setTitle("Cadastro de Médicos"); //Define o título na Janela
        jFrameMedico.setLocationRelativeTo(null); //Coloca a janela no centro da tela
        jFrameMedico.setVisible(true); //Mostra a janela

    }
    
}
