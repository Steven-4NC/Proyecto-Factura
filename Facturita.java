package Facturita;

import java.text.DecimalFormat;
import java.time. LocalDate;
import java.util.Scanner;

/*
 * Facilito no sierto
 *  @Autores: Sebastian, Emilio, Jostin, Gyna, Steven, Yahir...
 */

public class Main {
  private static float IVA = 0.15f;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Producto Creatina1 = new Producto ("DP001", "Dragon Pharma", 30.00f, 100);
    Producto Creatina2 = new Producto("GS002", "Sebas Strong  ", 25.00f, 100);
    Producto Creatina3 = new Producto("PP003", "Pepe's Muscle", 40.00f, 100);
    Producto Creatina4 = new Producto("JS004", "Java's ++    ", 35.00f, 100);
    Producto Creatina5 = new Producto("ML005", "Mamalong     ", 27.00f, 100);

    Receptor receptor = ingresar = ingresarDatosReceptor(sc);
    realizarCompra(sc, Creatina1, Creatina2, Creatina3, Creatina4, Creatina5, receptor);

    sc.close();

  }
}
