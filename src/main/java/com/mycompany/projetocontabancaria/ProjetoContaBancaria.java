/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetocontabancaria;

import javax.swing.JOptionPane;

/**
 *
 * @author 26175138
 */
public class ProjetoContaBancaria {

    public static void main(String[] args) {
        
       ContaBancaria conta1 = new ContaBancaria(389,"Tony Stark");
       ContaCorrente conta2 = new ContaCorrente();
       ContaPoupanca conta3 = new ContaPoupanca();
       
       conta2.setTitular("Peter Parker");
       conta2.setNumero(125);
       
       conta3.setNumero(555);
       conta3.setTitular("Bruce Wayne");
       
       
               
       
       
       int opcao = 0;
       int menu_cb = 0;
       int menu_cc = 0;
       int menu_cp = 0;
       
       do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
               "** SISTEMA BANCÁRIO **"
                    +"\n1 - Conta Bancária"   
                    +"\n2 - Conta Corrente"
                    +"\n3 - Conta Poupança"
                    +"\n0 -  Sair"));
            
         switch (opcao) {
             
                case 1:
                    do{
                       menu_cb = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "** CONTA BANCÁRIA **"
                        +"\n1 - Consultar saldo"
                        +"\n2 - Depositar"
                        +"\n3 - Sacar"
                        +"\n4 - Exibir Dados"
                        +"\n0 - Voltar"
                        +"\n\nConta: "+conta1.getNumero()+
                          "\nTitular: "+conta1.getTitular()));
                       
                       switch(menu_cb){
                           case 1:
                               JOptionPane.showMessageDialog(null,
                                       "Saldo: " + conta1.getSaldo());
                               break;
                           case 2:
                               conta1.Depositar(Double.parseDouble(JOptionPane.showInputDialog(null,
                                       "Depositar")));
                               break;
                           case 3:
                               conta1.Sacar (Double.parseDouble(JOptionPane.showInputDialog(null,
                                       "Sacar")));;
                               break;
                           case 4:
                               conta1.ExibirDados();
                              
                               break;
                           case 0:
                               break;
                               
                           default: 
                               JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                       }
                            
                       
                    }while(menu_cb != 0 );
                    
                    
                    break;
                 
                case 2:
                    do{
                       menu_cc = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "** CONTA CORRENTE **"
                        +"\n1 - Consultar saldo"
                        +"\n2 - Depositar"
                        +"\n3 - Sacar"
                        +"\n4 - Consultar Limite"
                        +"\n0 - Voltar"
                        +"\n\nConta: "+conta2.getNumero()+
                          "\nTitular: "+conta2.getTitular()));
                       
                       switch(menu_cc){
                           case 1:
                               JOptionPane.showMessageDialog(null,
                                       "Saldo = " + conta2.getSaldo());
                               break;
                           case 2:
                               conta2.Depositar(Integer.parseInt(JOptionPane.showInputDialog(null,
                                       "Depositar")));
                               break;
                           case 3:
                               conta2.Sacar (Integer.parseInt(JOptionPane.showInputDialog(null,
                                       "Sacar")));;
                               break;
                           case 4:
                               JOptionPane.showMessageDialog(null,""+ conta2.getLimite());
                              
                               break;
                           case 0:
                               break;
                               
                           default: 
                               JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                       }
                            
                       
                    }while(menu_cc != 0 );

                    
                    
                    break;
                case 3:
                     do{
                       menu_cp = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "** CONTA POUPANÇA **"
                        +"\n1 - Consultar saldo"
                        +"\n2 - Depositar"
                        +"\n3 - Sacar"
                        +"\n4 - Aplicar Rendimento"
                        +"\n0 - Voltar"
                        +"\n\nConta: "+conta3.getNumero()+
                          "\nTitular: "+conta3.getTitular()));
                       
                       switch(menu_cp){
                           case 1:
                               JOptionPane.showMessageDialog(null,
                                       "Saldo = " + conta3.getSaldo());
                               break;
                           case 2:
                               conta3.Depositar(Integer.parseInt(JOptionPane.showInputDialog(null,
                                       "Depositar")));
                               break;
                           case 3:
                               conta3.Sacar (Integer.parseInt(JOptionPane.showInputDialog(null,
                                       "Sacar")));;
                               break;
                           case 4:
                               conta3.aplicarRendimento();
                                                             
                               break;
                           case 0:
                               break;
                               
                           default: 
                               JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
                       }
                            
                       
                    }while(menu_cp != 0 );
                    break;
                    
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }

                
                    
       }while(opcao != 0 );

       
    }
}
