/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import LALR.controlador;
import auxiliar.leerArchivo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import static  LALR.controlador.*;
import auxiliar.lista;
import auxiliar.menu;



/**
 *
 * @author celes
 */
public class main {
    
    
    
    static leerArchivo l= new leerArchivo();
    static lista listt= new lista();
    static controlador con=new controlador();
    static menu menu=new menu();
    
    public static void main(String[] args) throws IOException {
        listt.getPilaa().push(0);
        listt.getSimboloo().push("");
       
        
        
        con.controlador();
        con.relacion();
        
        corrida1();
        
        listt.getPilaa().clear();
        listt.getPilaa().push(0);
        
        corrida2();
        
        listt.impresion();
        
        
    }
    
    public static void recorrido() {
        try {
            for (int i=0; i<listt.getPilaa().size(); i++){
              listt.setPilaStr( listt.getPilaStr()+ " "+ listt.getPilaa().get(i));
              listt.setSimboloStr(listt.getSimboloStr()+" "+listt.getSimboloo().get(i));
           }
          /*for (int i=0; i<listt.getEntradaa().size(); i++){
              listt.setEntradaStr(listt.getEntradaStr()+" "+listt.getEntradaa().get(i));
             
              //System.out.println("dentro "+ listt.getEntradaa().get(i));
          }*/
        } catch (Exception e) {
        }
        
        
        
         
    }
    
    public  static void LlenarPila(  Token token, int ultimoEle ){
          
           listt.getPila().add("$"+listt.getPilaStr());
           listt.getAccion().add((String) con.T(ultimoEle, indi).get(1));
           listt.getSimbolo().add(listt.getSimboloStr());
          // listt.getEntrada().add(listt.getEntradaStr());
           listt.setPilaStr("");
           listt.setSimboloStr("");
          // listt.setEntradaStr("");
           
           
    }
    public static String  UltimoElemento(){
      String hola="";
      listt.getEntradaa().pop();
       for(int i = 0; i < listt.getEntradaa().size() ; i++) {
            hola+=listt.getEntradaa().get(i)+" ";
            
        }
        
             return hola;
     } 
    public static String UltimoElemento2(){
      String l="";
       for(int i = 0; i < listt.getEntradaa().size() ; i++) {
            l+=listt.getEntradaa().get(i)+" ";
            
        } 
       
       return l;
    }
    public static void corrida1() throws IOException{
        InputStream is = new ByteArrayInputStream(l.lArchivo().getBytes());
        NewLexer lexer= new NewLexer (is);
         
        Token token = lexer.yylex();
         int op = 0;
        do {
                int ultimoEle = (int) listt.getPilaa().lastElement();
              // System.out.println("Ultimo elemento: " +ultimoEle); 
                con.indice(token);
               // System.out.println("El token es: " + token);
              //System.out.println("indice: " + indi);
	        
                 op = (int) con.T(ultimoEle, indi).get(0);
                
             
            //   System.out.println(con.T(ultimoEle, indi).get(1)+"------accion----------"); 
                recorrido();
                LlenarPila(token, ultimoEle);
		switch (op) 
		{
		case 11111: ////11111 shift
			listt.getPilaa().push(con.R(ultimoEle, indi));
                       // simbolo+=menu.sustitucion(token);
                        listt.getSimboloo().push(menu.sustitucion(token));
                        listt.getEntradaa().add(menu.sustitucion(token));
                        token = lexer.yylex();
			break;
		case 11112: //11112  error
                    //listt.impresion();
                    System.out.println("---------------------Error-----------------------------");
			return;
		case 11113: //11113 acept
			while (!listt.getPilaa().empty()) {
				listt.getPilaa().pop();
			}
			break;
		default://como puse numero en vez de R, pues si se descarta todo lo otro cae a defaul como _reduce
		    //   System.out.println("reduce n: "+numeroPop +" el tamañp : "+ pila.size() );
			for (int i = 0; i < numeroPop;i++) {
                  //          System.out.println(i);
				listt.getPilaa().pop();
                                listt.getSimboloo().pop();
			}
			//System.out.println("44444444444444---"+listt.getPilaa().lastElement()+"accion -----"+Accion);
			listt.getPilaa().push( con.R((int) listt.getPilaa().lastElement(), Accion));
                        listt.getSimboloo().push(menu.strRelacion(Accion));
			//simbolo+=" "+menu.strRelacion(Accion);
			break;
		}
              
	} while (!listt.getPilaa().empty());
         listt.getEntradaa().add("$");

    }
    public static void corrida2() throws IOException{
        InputStream is = new ByteArrayInputStream(l.lArchivo().getBytes());
        NewLexer lexer= new NewLexer (is);
         
        Token token = lexer.yylex();
         int op = 0;
          listt.setEntradaStr(UltimoElemento2());
          listt.getEntrada().add( listt.getEntradaStr());
        do {
            recorrido();
                int ultimoEle = (int) listt.getPilaa().lastElement();
                con.indice(token);
                 op = (int) con.T(ultimoEle, indi).get(0);
               
		switch (op) 
		{
		case 11111: ////11111 shift
                        listt.setEntradaStr(UltimoElemento());
			listt.getPilaa().push(con.R(ultimoEle, indi));
                        
                        listt.getEntrada().add( listt.getEntradaStr());
                        token = lexer.yylex();
			break;
		case 11112: //11112  error
                    listt.impresion();
                    System.out.println("Error");
			return;
		case 11113: //11113 acept
			while (!listt.getPilaa().empty()) {
				listt.getPilaa().pop();
			}
			break;
		default://como puse numero en vez de R, pues si se descarta todo lo otro cae a defaul como _reduce
		            listt.setEntradaStr(UltimoElemento2());
                            listt.getEntrada().add( listt.getEntradaStr());
			for (int i = 0; i < numeroPop;i++) {
                            
				listt.getPilaa().pop();
                                
			}
			listt.getPilaa().push( con.R((int) listt.getPilaa().lastElement(), Accion));
                        
			break;
		}
              
	} while (!listt.getPilaa().empty());

    }
    

}
