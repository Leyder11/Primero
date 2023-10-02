package Main;

import javax.swing.JOptionPane;

public class Main {
static Operacion o = new Operacion ();
    public static void main(String[] args) {
      int ope, trm, rsl;
      rsl = 0;
      ope = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la operacion: 1 Sumar, 2 Resta, 3 multiplicacion, 4 division"));
       while (ope<=4){
           trm = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el termino"));
           switch (ope) {
              case 1: 
              rsl = o.sumar(rsl, trm);
              
              break;
              case 2: 
              rsl = o.restar(rsl, trm);
              
              break;
              case 3:
              rsl = o.multi(rsl, trm);
              
              break;
              case 4:
              rsl = o.divi(rsl, trm);
              
              break;
           }
         JOptionPane.showMessageDialog(null, rsl);
         ope = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la operacion: 1 Sumar, 2 Resta, 3 multiplicacion, 4 division"));
         }
        }
    }

