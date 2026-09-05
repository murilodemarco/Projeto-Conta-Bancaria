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
public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    
    public ContaBancaria() {
        
    }

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) { //Teve que ser utilizado para a subclass ContaCorrete poder atualizar o valor 
        this.saldo = saldo;
    }
    
    
   public void Depositar(double valor){
       if(valor > 0){
           this.saldo = this.saldo + valor;
           JOptionPane.showMessageDialog(null,"Novo saldo: "+this.saldo);
       }else{
           JOptionPane.showMessageDialog(null,"Deposite um valor maior que R$0");
       }
       
   }
   
   public void ExibirDados(){
       JOptionPane.showMessageDialog(null,"Número: " +this.numero +"\n"
               +"Titular: "+this.titular+"\n"
               +"Saldo: "+this.saldo);
   }
   
   public void Sacar(double sacar){
       if((sacar <= this.saldo) && (sacar >0)){
           
           this.saldo = this.saldo - sacar;
           JOptionPane.showMessageDialog(null,"Voce sacou: "+sacar+" \nNovo saldo: " + this.saldo);
       }else{
           JOptionPane.showMessageDialog(null,
                                       "Saque Invalido"); 
       }
   }
   
}
