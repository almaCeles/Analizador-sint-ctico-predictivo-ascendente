/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LALR;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author celes
 */
public class NewClass {
    public static void main(String[] args) {
       ArrayList<String> accionTabla = new ArrayList<String>();
       accionTabla.add("alma");
       accionTabla.add("celeste");
       
       String prueba[]=new String[2];
       prueba[0]="hola";
       prueba[0]="mundo";
       ArrayList a[]=new ArrayList[1];
       a[0]=accionTabla;
        System.out.println(Arrays.asList(a[0].get(0)));
    }
}
