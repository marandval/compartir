package com.mycompany.examenprogramacion1ev;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Principal {
    public static void main(String[] args) {
        double masa;
        String planeta;
        System.out.println("Introduce tu masa");
        Scanner teclado=new Scanner(System.in);
        masa=teclado.nextDouble();
        System.out.println("Introduce el planeta en el que quieres saber tu peso");
        planeta=teclado.next();
        switch(planeta){
            case "Marte":
                Marte objetoM=new Marte();
                objetoM.peso(masa);
                break;
            case "Tierra":
                Tierra objetoT=new Tierra();
                objetoT.peso(masa);
                break;
            case "Jupiter":
                Jupiter objetoJ=new Jupiter();
                objetoJ.peso(masa);
                break;
            case "Saturno":
                Saturno objetoS=new Saturno();
                objetoS.peso(masa);
                break;
            case "Pluton":
                Pluton objetoP=new Pluton();
                objetoP.peso(masa);
                break;
            default:
                System.out.println("Ese planeta no lo tengo, solo tengo Marte, Tierra, Saturno, Jupiter y Pluton");
        }
        
        
    }
}
