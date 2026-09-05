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
 
public class ContaCorrente extends ContaBancaria {
    
    private double limite = 1000;
    
     
   public double getLimite(){
       return this.limite+getSaldo();
   }

   public void definirLimite(double limite) {
       this.limite = limite+getSaldo();
   }
           

    
   @Override //Usado para bloquear a herança
   public void Sacar(double sacar){
       
    double disponivel = getSaldo() + limite;
    
    if ((sacar <= disponivel)&& (sacar >0)){
                
          setSaldo( getSaldo() - sacar);
          JOptionPane.showMessageDialog(null,"Voce sacou: "+sacar+" \nNovo saldo: " + getSaldo());
           
       }else{
         JOptionPane.showMessageDialog(null,
                                       "Saque Invalido"); 
       }

    }
   
   @Override
    public void Depositar(double valor) {

    if (valor <= 0) {
        JOptionPane.showMessageDialog(null, "Depósito inválido");
        return;
    }

    // Se o saldo estiver negativo, está utilizando o limite
    if (getSaldo() < 0) {

        double limiteUtilizado = Math.abs(getSaldo());

        // O depósito não é suficiente para cobrir todo o limite
        if (valor <= limiteUtilizado) {

            setSaldo(getSaldo() + valor);

        } else {

            // Primeiro cobre o limite utilizado
            valor = valor - limiteUtilizado;

            // O restante vai para o saldo
            setSaldo(valor);
        }

    } else {

        // Se não estiver usando o limite,
        // o depósito vai diretamente para o saldo
        setSaldo(getSaldo() + valor);
    }

    JOptionPane.showMessageDialog(null,
            "Depósito realizado: R$ " + valor +
            "\nNovo saldo: R$ " + getSaldo());
    }   
}
