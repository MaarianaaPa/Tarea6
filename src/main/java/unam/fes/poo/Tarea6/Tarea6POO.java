/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unam.fes.poo.tarea6poo;

import java.awt.Color;

/**
 *
 * @author ZaraL
 */
public class Tarea6POO {

    public static void main(String[] args) {
        //objeto
        Monitor mon = new Monitor(27.4, "Samsung", "SM10", "LED", 6500.0);
        Persona per = new Persona(20,"Jose", 1.76,56.0, "H");
        Automovil auto = new Automovil("NISSAN", "No se de autos", 21, Color.BLUE);
        MxtxNovels novel = new MxtxNovels("TGCF", 2016,"MXTX",1828.79,5);
        System.out.println(mon);
        System.out.println(per);
        System.out.println(auto);
        System.out.println(novel);
    }
}
