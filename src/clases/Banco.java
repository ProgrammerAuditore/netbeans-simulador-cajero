// Victor Jesus Maximo Abundio
// Ing. Sistemas Computacionales
// Tec Campus Vallarta
// 28/Octubre/2020

package clases;

import javax.swing.JOptionPane;

public class Banco {
    
    public Cuenta cuentas[] = new Cuenta[4];
    
    public void fncInicializarCuentas(){
        cuentas[0] = new Cuenta("Son Goku", "/img/foto2.png");
        cuentas[1] = new Cuenta("Vegueta", "/img/foto3.png");
        cuentas[2] = new Cuenta("Son Gohan", "/img/foto1.png");
        cuentas[3] = new Cuenta("Balck Goku", "/img/foto4.png");
    }
    
    public void fncIngresar(Cuenta cliente){
        try{
            
            double deposito = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad a depositar"));
            if( deposito < 0 || (deposito%100) != 0  ){
                 JOptionPane.showMessageDialog(null, "Lo siento, operación rechazada.\n*** La cantidad tiene que ser multiplo de 100.");
            }else{
                cliente.setDblSaldo( cliente.getDblSaldo() + deposito );
                JOptionPane.showMessageDialog(null, "Enhorabuena, operacion exitosa.\n"
                        + "Saldo depositado: " +  deposito + "\n"
                        + "Saldo disponible: " + (cliente.getDblSaldo() - deposito) + "\n"
                        + "Saldo actual: " + cliente.getDblSaldo() );
            }
            
        }catch(Exception e ){}
        
    }
    
    public void fncRetirar(Cuenta cliente){
        try{
            
            double retirar = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad a retirar"));
            if( retirar > cliente.getDblSaldo()  || (retirar%100) != 0 ){
                JOptionPane.showMessageDialog(null, "Lo siento, operación rechazada.\n*** La cantidad tiene que ser multiplo de 100.\n*** Consulta tu estado de cuenta.");
            }else{
                cliente.setDblSaldo( cliente.getDblSaldo() - retirar );
                JOptionPane.showMessageDialog(null, "Enhorabuena, operacion exitosa.\n"
                        + "Saldo retirado: " +  retirar + "\n"
                        + "Saldo disponible: " + cliente.getDblSaldo() );
            }
        
        }catch(Exception e ){}
    }
    
    public void fncConsulta(Cuenta cliente){
        try{
            
            JOptionPane.showMessageDialog(null, "Enhorabuena, operacion exitosa.\nSaldo disponible: " + cliente.getDblSaldo() );
        
        }catch(Exception e ){}
    }
    
}
