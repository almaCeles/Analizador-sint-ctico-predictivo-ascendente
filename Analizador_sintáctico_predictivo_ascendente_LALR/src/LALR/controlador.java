/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LALR;

import com.sun.source.tree.ArrayAccessTree;
import java.util.ArrayList;
import lexico.Token;
import static  lexico.Token.*;
/**
 *
 * @author celes
 */
public class controlador {
    
   static ArrayList  contro   [][]= new ArrayList  [92][35];
   static Object relacion [][]= new Object [92][52];
   static int Accion;
   static int numeroPop;
   static int indi;
   static  ArrayList r;
   

   
   public Object T(int v,int indi) {
	 r = contro[v][indi];
	 if (r. != _shift && r != _error) {
		 switch ((int)r) {
		 case 0: numeroPop = 0;  Accion = 38; break;
		 case 1: numeroPop = 1;  Accion = 36; break;
		 case 2: numeroPop = 2;  Accion = 12; break;
		 case 3: numeroPop= 3;  Accion = 12; break;
		 case 4: numeroPop = 3;  Accion = 11; break;
		 case 5: numeroPop = 3;  Accion = 10; break;
		 case 6: numeroPop = 5;  Accion = 9;  break;
		 case 7: numeroPop = 1;  Accion = 10; break;
		 case 8: numeroPop = 1;  Accion = 9;  break;
		 }
	}
	 return r;
}
   public void indice(Token token) {
	switch (token) {
            case llaveIzq: indi = 0;  break;
            case lleveDere: indi = 1;  break;
            case id: indi = 2;  break;
            case puntoYcoma: indi = 3;  break;
            case corcheteIzq: indi = 4;  break;
            case num:  indi = 5; break;
            case corcheteDere:  indi = 6;  break;
            case iint: indi = 7;  break;
            case ffloat: indi = 8;  break;
            case cchar: indi = 9;  break;
            case bbolean: indi = 10;  break;
            case igual: indi = 11;  break;
            case iif: indi = 12;  break;
            case parentisiIzq: indi = 13;  break;
            case parentisiDere:  indi = 14; break;
            case eelse:  indi = 15;  break;
            case wwhile: indi = 16;  break;
            case ddo: indi = 17;  break;
            case bbreak: indi = 18;  break;
            case or: indi = 19;  break;
            case iss: indi = 20;  break;
            case igualIgual: indi = 21;  break;
            case negacion: indi = 22;  break;
            case menorque: indi = 23;  break;
            case mayorque:  indi = 24; break;
            case menorIgual:  indi = 25;  break;
            case mayorIgual: indi = 26;  break;
            case suma: indi = 27;  break;
            case resta: indi = 28;  break;
            case multiplicacion: indi = 29;  break;
            case divicion: indi = 30;  break;
            case admiracion: indi = 31;  break;
            case real: indi = 32;  break;
            case ttrue: indi = 33;  break;
            case ffalse: indi = 34;  break;
            case _fin: indi = 35;  break;
           
	}
}
   public void controlador(){
	for (int i = 0; i < 92; i++) {
		for (int t = 0; t < 52; t++) {
			contro[i][t] = llenarArreAcciones(_error,""); 
		}
	}
        
     //estado 0
     contro[0][0] = llenarArreAcciones(_shift,"shift(3)"); 
     //estado 1
   /*  contro[1][34]=_accept;
     //estado 2
     contro[2][34]=1;
     //estado 3
     contro[3][0]=0;
     contro[3][1]=0;
     contro[3][2]=0;
     contro[3][7]=0;
     contro[3][8]=0;
     contro[3][9]=0;
     contro[3][10]=0;
     contro[3][12]=0;
     contro[3][16]=0;
     contro[3][17]=0;
     contro[3][18]=0;
     
     //estado 4
     contro[4][0]=0;
     contro[4][1]=0;
     contro[4][2]=0;
     contro[4][7]=_shift;
     contro[4][8]=_shift;
     contro[4][9]=_shift;
     contro[4][10]=_shift;
     contro[4][12]=0;
     contro[4][16]=0;
     contro[4][17]=0;
     contro[4][18]=0;
     
     
     //estado 5
     contro[5][0]= _shift;
     contro[5][1]=_shift;
     contro[5][2]=_shift;
     contro[5][12]=_shift;
     contro[5][16]=_shift;
     contro[5][17]=_shift;
     contro[5][18]=_shift;
     
     //estado 6
     contro[6][0]=0;
     contro[6][1]=0;
     contro[6][2]=0;
     contro[6][7]=0;
     contro[6][8]=_shift;
     contro[6][9]=_shift;
     contro[6][10]=_shift;
     contro[6][12]=0;
     contro[6][16]=0;
     contro[6][17]=0;
     contro[6][18]=0;
     */
   }
   public ArrayList<Object> llenarArreAcciones(Object token ,String accion){
    ArrayList<Object> accionTabla = new ArrayList<Object>();
       
    accionTabla.add(token);
    accionTabla.add(accion);
    return accionTabla;
   }
}
