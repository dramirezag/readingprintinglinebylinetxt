/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionfiles2;

/**
 *
 * @author diego
 */
import java.io.*; 
public class AplicacionFiles2 {
    public static void main(String[] args) throws IOException {
    
    BufferedReader ent = new BufferedReader(new FileReader("datos.txt"));
PrintWriter sal = new PrintWriter(System.out,true); 
PrintWriter salErr = new PrintWriter(System.err, true);
String linea = ent.readLine();
int numero;
while (linea != null) {
numero = Integer.parseInt(linea);
sal.println("" + numero); 
    linea = ent.readLine(); 
}
salErr.println("Fin");
ent.close();

    }
}


