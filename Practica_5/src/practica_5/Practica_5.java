/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Juan Carlos
 */
public class Practica_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Scanner obj = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Automovil[] audi = new Automovil[5];
        
        for(int i = 0; i < audi.length; i++){
            
            System.out.println("Datos del auto " + (i + 1) + ": ");
            audi[i] = new Automovil();
            
            System.out.println("Ingresa marca " + (i + 1) + ":");
            audi[i].setMarca(obj.nextLine());
            System.out.println("Ingresa modelo " + (i + 1) + ":");
            audi[i].setModelo(obj.nextLine());
            System.out.println("Ingresa color " + (i + 1) + ":");
            audi[i].setColor(obj.nextLine());
            System.out.println("Ingresa precio " + (i + 1) + ":");
            double s = Double.parseDouble(in.readLine());
            audi[i].setPrecio(s);
            System.out.println("Ingresa el gas disponible del auto " + (i +1) + " :");
            double t = Double.parseDouble(in.readLine());
            audi[i].setGas(t);
        }
        
        for(Automovil auto: audi){
          
            
            System.out.println("------DATOS DEL AUTO------");
            System.out.println(auto.getMarca());
            System.out.println(auto.getModelo());
            System.out.println(auto.getColor());
            System.out.println(auto.getPrecio());
            auto.acelerar(auto.getGas());
            auto.avanzaDerecha(auto.getGas());
            auto.avanzaIzquierda(auto.getGas());
            auto.frenar();
            
            
            System.out.println("\n");
        }
        
    }
    
}
