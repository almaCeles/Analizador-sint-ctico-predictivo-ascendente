/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author celes
 */
public class lista {
        private ArrayList<String> pila = new ArrayList<String>();
        private ArrayList<String> simbolo = new ArrayList<String>();
        private ArrayList<String> entrada = new ArrayList<String>();
        private ArrayList<String> accion = new ArrayList<String>();

        private Stack pilaa = new Stack();
        private Stack simboloo = new Stack();
        private LinkedList entradaa = new LinkedList();
        private Stack accionn = new Stack();
       
        
        private  String pilaStr="";
        private String simboloStr="";
        private String entradaStr="";

    public LinkedList getEntradaa() {
        return entradaa;
    }
        
      

    public String getPilaStr() {
        return pilaStr;
    }

    public void setPilaStr(String pilaStr) {
        this.pilaStr = pilaStr;
    }

    public String getSimboloStr() {
        return simboloStr;
    }

    public void setSimboloStr(String simboloStr) {
        this.simboloStr = simboloStr;
    }

    public String getEntradaStr() {
        return entradaStr;
    }

    public void setEntradaStr(String entradaStr) {
        this.entradaStr = entradaStr;
    }
        
    public ArrayList<String> getPila() {
        return pila;
    }

    public Stack getPilaa() {
        return pilaa;
    }

    public Stack getSimboloo() {
        return simboloo;
    }

   

    public Stack getAccionn() {
        return accionn;
    }

    public ArrayList<String> getSimbolo() {
        return simbolo;
    }

    public ArrayList<String> getEntrada() {
        return entrada;
    }

    public ArrayList<String> getAccion() {
        return accion;
    }
     
    
    public  void   impresion( ){
        for(int i = 0; i < getPila().size(); i++) {
            System.out.print("Pila :");
            System.out.println(getPila().get(i));
            System.out.print("Simbolo :");
            System.out.println(getSimbolo().get(i));
            System.out.print("Entrada :");
            System.out.println(getEntrada().get(i));
            System.out.print("Accion :");
            System.out.println(getAccion().get(i));
            System.out.println("-----------------");
            
        }
    }
}
