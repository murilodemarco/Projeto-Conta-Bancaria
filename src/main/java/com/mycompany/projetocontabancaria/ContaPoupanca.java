/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocontabancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author 26175138
 */
public class ContaPoupanca extends ContaBancaria {
    
   private double rendimento;
    
    public void aplicarRendimento(){
        setSaldo(getSaldo() * 0.05 + getSaldo());
        JOptionPane.showMessageDialog(null,
                                       "Rendimento Aplicado!");
    }
}
