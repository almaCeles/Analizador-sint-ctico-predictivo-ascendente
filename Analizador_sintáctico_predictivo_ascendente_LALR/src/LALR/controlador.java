/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LALR;


import java.util.ArrayList;
import lexico.Token;
import static  lexico.Token.*;
/**
 *
 * @author celes
 */
public class controlador {
    
   static ArrayList  contro   [][]= new ArrayList  [93][36];
   static Object relacion [][]= new Object [93][53];
   public static int Accion;
   public static int numeroPop;
   public static int indi;
   static  ArrayList r;
   

   public int R(int StackTop,int ind) {
	int d =  (int) relacion[StackTop][ind];
	return  d;
}
   public ArrayList T(int v,int indi) {
	 r = contro[v][indi];
	 if ((int)r.get(0) != 11111 && (int)r.get(0) != 11112) {
		 switch ((int)r.get(0)) {
		 case 0: numeroPop = 1;  Accion = 36; break;
		 case 1: numeroPop = 0;  Accion = 38; break;
		 case 2: numeroPop = 0;  Accion = 39; break;
		 case 3: numeroPop=  2;  Accion = 38; break;
		 case 4: numeroPop = 1;  Accion = 41; break;
		 case 5: numeroPop = 1;  Accion = 42; break;
                 case 6: numeroPop = 4;  Accion = 37; break;
                 case 7: numeroPop = 2;  Accion = 39; break;
                 case 8: numeroPop = 1;  Accion = 39; break;
                 case 9: numeroPop=  1;  Accion = 44; break;
		 case 10: numeroPop = 1;  Accion = 43; break;
		 case 11: numeroPop = 3;  Accion = 40; break;
                 case 12: numeroPop = 1;  Accion = 45; break;
                 case 13: numeroPop = 1;  Accion = 46; break;
                 case 14: numeroPop = 1;  Accion = 47; break;
                 case 15: numeroPop = 1;  Accion = 48; break;
                 case 16: numeroPop = 1;  Accion = 49; break;
                 case 17: numeroPop = 1;  Accion = 50; break;
                 case 18: numeroPop = 1;  Accion = 51; break;
                 case 19: numeroPop = 1;  Accion = 52; break;
                 case 20: numeroPop = 4;  Accion = 41; break;
                 case 21: numeroPop = 4;  Accion = 43; break;
                 case 23: numeroPop = 2;  Accion = 51; break;
                 case 24: numeroPop = 4;  Accion = 44; break;
                 case 25: numeroPop = 3;  Accion = 45; break;
                 case 26: numeroPop = 3;  Accion = 46; break;
                 case 27: numeroPop = 3;  Accion = 47; break;
                 case 22: numeroPop = 3;  Accion = 48; break;
                 case 28: numeroPop = 3;  Accion = 49; break;
                 case 29: numeroPop = 3;  Accion = 50; break;
                 case 30: numeroPop = 3;  Accion = 52; break;
                 case 31: numeroPop = 5;  Accion = 43; break;
                 case 32: numeroPop = 5;  Accion = 43; break;
                 case 33: numeroPop = 7;  Accion = 43; break;
                 
                 
                 
                 
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
	for (int i = 0; i < 93 ; i++) {
		for (int t = 0; t < 36; t++) {
			contro[i][t] = llenarArreAcciones(11112,""); 
		}
	}
        
     //estado 0
     contro[0][0] = llenarArreAcciones(11111,"shift(3)"); 
     
     //estado 1
     contro[1][35]=llenarArreAcciones(11113,"Acept");
     //estado 2
     contro[2][35]=llenarArreAcciones(0,"reduce(programa → bloque)");
     //estado 3
     contro[3][0]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][1]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][2]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][7]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][8]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][9]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][10]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][12]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][16]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][17]=llenarArreAcciones(1,"reduce(decls → ε)");
     contro[3][18]=llenarArreAcciones(1,"reduce(decls → ε)");
     
     //estado 4
     contro[4][0]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][1]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][2]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][7]=llenarArreAcciones(11111,"shift(9)"); 
     contro[4][8]=llenarArreAcciones(11111,"shift(10)"); 
     contro[4][9]=llenarArreAcciones(11111,"shift(11)"); 
     contro[4][10]=llenarArreAcciones(11111,"shift(12)"); 
     contro[4][12]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][16]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][17]=llenarArreAcciones(2,"reduce(instrs → ε)");
     contro[4][18]=llenarArreAcciones(2,"reduce(instrs → ε)");
     
     
     //estado 5
     contro[5][0]= llenarArreAcciones(11111,"shift(3)");
     contro[5][1]=llenarArreAcciones(11111,"shift(13)");
     contro[5][2]=llenarArreAcciones(11111,"shift(21)");
     contro[5][12]=llenarArreAcciones(11111,"shift(16)");
     contro[5][16]=llenarArreAcciones(11111,"shift(17)");
     contro[5][17]=llenarArreAcciones(11111,"shift(18)");
     contro[5][18]=llenarArreAcciones(11111,"shift(19)");
     
     //estado 6
     contro[6][0]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][1]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][2]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][7]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][8]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][9]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][10]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][12]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][16]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][17]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     contro[6][18]=llenarArreAcciones(3,"reduce(decls → decls decl)");
     
     //estado 7
     contro[7][2]= llenarArreAcciones(11111,"shift(22)");
     contro[7][4]=llenarArreAcciones(11111,"shift(23)");
     
     //estado 8
     contro[8][2]=llenarArreAcciones(4,"reduce(tipo → basico)");
     contro[8][4]=llenarArreAcciones(4,"reduce(tipo → basico)");
     
      //estado 9
     contro[9][2]=llenarArreAcciones(5,"reduce(basico → int)");
     contro[9][4]=llenarArreAcciones(5,"reduce(basico → int)");
     
       //estado 10
     contro[10][2]=llenarArreAcciones(5,"reduce(basico → float)");
     contro[10][4]=llenarArreAcciones(5,"reduce(basico → float)");
     
        //estado 11
     contro[11][2]=llenarArreAcciones(5,"reduce(basico → char)");
     contro[11][4]=llenarArreAcciones(5,"reduce(basico → char)");
     
        //estado 12
     contro[12][2]=llenarArreAcciones(5,"reduce(basico → boolean)");
     contro[12][4]=llenarArreAcciones(5,"reduce(basico → boolean)");
     
        //estado 13
     contro[13][0]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][1]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][2]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][12]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][15]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][16]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][17]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][18]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     contro[13][35]=llenarArreAcciones(6,"reduce(bloque → { decls instrs })");
     
     //estado 14
     contro[14][0]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][1]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][2]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][12]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][16]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][17]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     contro[14][18]=llenarArreAcciones(7,"reduce(instrs → instrs instr)");
     
     //estado 15
     contro[15][4]=llenarArreAcciones(11111,"shift(25)");
     contro[15][11]=llenarArreAcciones(11111,"shift(24)");
     
     //estado 16
     contro[16][13]=llenarArreAcciones(11111,"shift(26)");
    
     
     //estado 17
     contro[17][13]=llenarArreAcciones(11111,"shift(25)");
     
     //estado 18
     contro[18][0]=llenarArreAcciones(11111,"shift(3)");
     contro[18][2]=llenarArreAcciones(11111,"shift(21)");
     contro[18][12]=llenarArreAcciones(11111,"shift(16)");
     contro[18][16]=llenarArreAcciones(11111,"shift(17)");
     contro[18][17]=llenarArreAcciones(11111,"shift(18)");
     contro[18][18]=llenarArreAcciones(11111,"shift(19)");
     
       //estado 19
     contro[19][3]=llenarArreAcciones(11111,"shift(29)");
     
     //estado 20
     contro[20][0]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][1]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][2]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][12]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][15]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][16]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][17]=llenarArreAcciones(8,"reduce(instr → bloque)");
     contro[20][18]=llenarArreAcciones(8,"reduce(instr → bloque)");
     
     //estado 21
     contro[21][3]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][4]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][5]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][11]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][14]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][19]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][20]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][21]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][22]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][23]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][24]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][25]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][26]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][27]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][28]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][29]=llenarArreAcciones(9,"reduce(loc → id)");
     contro[21][30]=llenarArreAcciones(9,"reduce(loc → id)");
     
     //estado 22
     contro[22][3]=llenarArreAcciones(11111,"shift(30)");
     
     //estado 23
     contro[23][5]=llenarArreAcciones(11111, "shift(31)");
     
     //estado 24
     contro[24][2]=llenarArreAcciones(11111,"shift(21)");
     contro[24][5]=llenarArreAcciones(11111,"shift(44)");
     contro[24][13]=llenarArreAcciones(11111,"shift(42)");
     contro[24][28]=llenarArreAcciones(11111,"shift(40)");
     contro[24][31]=llenarArreAcciones(11111,"shift(39)");
     contro[24][32]=llenarArreAcciones(11111,"shift(45)");
     contro[24][33]=llenarArreAcciones(11111,"shift(46)");
     contro[24][34]=llenarArreAcciones(11111,"shift(47)");
    
     //estado 25
     contro[25][2]=llenarArreAcciones(11111,"shift(21)");
     contro[25][5]=llenarArreAcciones(11111,"shift(44)");
     contro[25][13]=llenarArreAcciones(11111,"shift(42)");
     contro[25][28]=llenarArreAcciones(11111,"shift(40)");
     contro[25][31]=llenarArreAcciones(11111,"shift(39)");
     contro[25][32]=llenarArreAcciones(11111,"shift(45)");
     contro[25][33]=llenarArreAcciones(11111,"shift(46)");
     contro[25][34]=llenarArreAcciones(11111,"shift(47)");

     //estado 26
     contro[26][2]=llenarArreAcciones(11111,"shift(21)");
     contro[26][5]=llenarArreAcciones(11111,"shift(44)");
     contro[26][13]=llenarArreAcciones(11111,"shift(42)");
     contro[26][28]=llenarArreAcciones(11111,"shift(40)");
     contro[26][31]=llenarArreAcciones(11111,"shift(39)");
     contro[26][32]=llenarArreAcciones(11111,"shift(45)");
     contro[26][33]=llenarArreAcciones(11111,"shift(46)");
     contro[26][34]=llenarArreAcciones(11111,"shift(47)");
     
     //estado 27
     contro[27][2]=llenarArreAcciones(11111,"shift(21)");
     contro[27][5]=llenarArreAcciones(11111,"shift(44)");
     contro[27][13]=llenarArreAcciones(11111,"shift(42)");
     contro[27][28]=llenarArreAcciones(11111,"shift(40)");
     contro[27][31]=llenarArreAcciones(11111,"shift(39)");
     contro[27][32]=llenarArreAcciones(11111,"shift(45)");
     contro[27][33]=llenarArreAcciones(11111,"shift(46)");
     contro[27][34]=llenarArreAcciones(11111,"shift(47)");
     
     //estado 28
     contro[28][16]=llenarArreAcciones(11111,"shift(51)");
     
     //estado 29
     contro[29][0]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][1]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][2]=llenarArreAcciones(10,"reduce(instr → break ;))");
     contro[29][12]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][15]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][16]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][17]=llenarArreAcciones(10,"reduce(instr → break ;)");
     contro[29][18]=llenarArreAcciones(10,"reduce(instr → break ;)");
     
     //30
      contro[30][0]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][1]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][2]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][7]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][8]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][9]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][10]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][12]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][16]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][17]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     contro[30][18]=llenarArreAcciones(11,"reduce(decl → tipo id ;)");
     
     //31
     contro[31][6]=llenarArreAcciones(11111,"shift(52)");
     
     //32
     contro[32][3]=llenarArreAcciones(11111,"shift(53)");
     contro[32][19]=llenarArreAcciones(11111,"shift(54)");
     
    //33
    contro[33][3]=llenarArreAcciones(12,"reduce(bool → comb)");
    contro[33][6]=llenarArreAcciones(12,"reduce(bool → comb)");
    contro[33][14]=llenarArreAcciones(12,"reduce(bool → comb)");
    contro[33][19]=llenarArreAcciones(12,"reduce(bool → comb)");
    contro[33][20]=llenarArreAcciones(11111,"shift (55)");
    
    //34
    contro[34][3]=llenarArreAcciones(13,"reduce(comb → igualdad)");
    contro[34][6]=llenarArreAcciones(13,"reduce(comb → igualdad)");
    contro[34][14]=llenarArreAcciones(13,"reduce(comb → igualdad)");
    contro[34][19]=llenarArreAcciones(13,"reduce(comb → igualdad)");
    contro[34][20]=llenarArreAcciones(13,"reduce(comb → igualdad)");
    contro[34][21]=llenarArreAcciones(11111,"shift (56)");
    contro[34][22]=llenarArreAcciones(11111,"shift (57)");
    
    //35
    contro[35][3]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][6]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][14]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][19]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][20]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][21]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][22]=llenarArreAcciones(14,"reduce(igualdad → rel)");
    contro[35][23]=llenarArreAcciones(11111,"shift (58)");
    contro[35][24]=llenarArreAcciones(11111,"shift (59)");
    contro[35][25]=llenarArreAcciones(11111,"shift (60)");
    contro[35][26]=llenarArreAcciones(11111,"shift (61)");
    
    //36
    contro[36][3]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][6]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][14]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][19]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][20]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][21]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][22]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][23]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][24]=llenarArreAcciones(15,"reduce(rel → expr)");
    contro[36][25]=llenarArreAcciones(15,"reduce(rel → expr))");
    contro[36][26]=llenarArreAcciones(15,"reduce(rel → expr)");
     contro[36][27]=llenarArreAcciones(11111,"shift (62)");
    contro[36][28]=llenarArreAcciones(11111,"shift (63)");
    
    //37
     contro[37][3]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][6]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][14]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][19]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][20]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][21]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][22]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][23]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][24]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][25]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][26]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][27]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][28]=llenarArreAcciones(16,"reduce(expr → term)");
    contro[37][29]=llenarArreAcciones(11111,"shift (64)");
    contro[37][30]=llenarArreAcciones(11111,"shift (65)");
    
    //38
     contro[38][3]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][6]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][14]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][19]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][20]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][21]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][22]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][23]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][24]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][25]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][26]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][27]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][28]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][29]=llenarArreAcciones(17,"reduce(term → unario)");
    contro[38][30]=llenarArreAcciones(17,"reduce(term → unario)");
    
    //39
    contro[39][2]=llenarArreAcciones(11111,"shift (21)");
    contro[39][5]=llenarArreAcciones(11111,"shift (44)");
    contro[39][13]=llenarArreAcciones(11111,"shift (42)");
    contro[39][28]=llenarArreAcciones(11111,"shift (40)");
    contro[39][31]=llenarArreAcciones(11111,"shift (39)");
    contro[39][32]=llenarArreAcciones(11111,"shift (45)");
    contro[39][33]=llenarArreAcciones(11111,"shift (46)");
    contro[39][34]=llenarArreAcciones(11111,"shift (47)");
    
    //40
    contro[40][2]=llenarArreAcciones(11111,"shift (21)");
    contro[40][5]=llenarArreAcciones(11111,"shift (44)");
    contro[40][13]=llenarArreAcciones(11111,"shift (42)");
    contro[40][28]=llenarArreAcciones(11111,"shift (40)");
    contro[40][31]=llenarArreAcciones(11111,"shift (39)");
    contro[40][32]=llenarArreAcciones(11111,"shift (45)");
    contro[40][33]=llenarArreAcciones(11111,"shift (46)");
    contro[40][34]=llenarArreAcciones(11111,"shift (47)");
    
    //41
     contro[41][3]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][6]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][14]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][19]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][20]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][21]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][22]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][23]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][24]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][25]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][26]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][27]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][28]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][29]=llenarArreAcciones(18,"reduce(unario → factor)");
    contro[41][30]=llenarArreAcciones(18,"reduce(unario → factor)");
    
      //42
    contro[42][2]=llenarArreAcciones(11111,"shift (21)");
    contro[42][5]=llenarArreAcciones(11111,"shift (44)");
    contro[42][13]=llenarArreAcciones(11111,"shift (42)");
    contro[42][28]=llenarArreAcciones(11111,"shift (40)");
    contro[42][31]=llenarArreAcciones(11111,"shift (39)");
    contro[42][32]=llenarArreAcciones(11111,"shift (45)");
    contro[42][33]=llenarArreAcciones(11111,"shift (46)");
    contro[42][34]=llenarArreAcciones(11111,"shift (47)");
    
    //43
     contro[43][3]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][4]=llenarArreAcciones(11111,"shift(25)");
    contro[43][6]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][14]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][19]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][20]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][21]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][22]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][23]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][24]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][25]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][26]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][27]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][28]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][29]=llenarArreAcciones(19,"reduce(factor → loc)");
    contro[43][30]=llenarArreAcciones(19,"reduce(factor → loc)");
    
    //44
    contro[44][3]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][6]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][14]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][19]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][20]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][21]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][22]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][23]=llenarArreAcciones(19,"reduce(factor → num)"); 
    contro[44][24]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][25]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][26]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][27]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][28]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][29]=llenarArreAcciones(19,"reduce(factor → num)");
    contro[44][30]=llenarArreAcciones(19,"reduce(factor → num)");
    
    //45
    contro[45][3]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][6]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][14]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][19]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][20]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][21]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][22]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][23]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][24]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][25]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][26]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][27]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][28]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][29]=llenarArreAcciones(19,"reduce(factor → real)");
    contro[45][30]=llenarArreAcciones(19,"reduce(factor → real)");
   
    //46
     contro[46][3]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][6]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][14]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][19]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][20]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][21]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][22]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][23]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][24]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][25]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][26]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][27]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][28]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][29]=llenarArreAcciones(19,"reduce(factor → true)");
    contro[46][30]=llenarArreAcciones(19,"reduce(factor → true)");    
    
    //47
     contro[47][3]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][6]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][14]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][19]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][20]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][21]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][22]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][23]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][24]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][25]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][26]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][27]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][28]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][29]=llenarArreAcciones(19,"reduce(factor → false)");
    contro[47][30]=llenarArreAcciones(19,"reduce(factor → false)");
    
    //48
     contro[48][6]=llenarArreAcciones(11111,"shift (69)");
    contro[48][19]=llenarArreAcciones(11111,"shift (54)");
    
    //49
    contro[49][14]=llenarArreAcciones(11111,"shift (70)");
    contro[48][19]=llenarArreAcciones(11111,"shift (54)");
    
    //50
    contro[50][14]=llenarArreAcciones(11111,"shift (71)");
    contro[50][19]=llenarArreAcciones(11111,"shift (54)");
    
    //51
    contro[51][13]=llenarArreAcciones(11111,"shift (72)");
    
    //52
    contro[52][2]=llenarArreAcciones(20,"reduce(tipo → tipo [ num ])");
    contro[52][4]=llenarArreAcciones(20,"reduce(tipo → tipo [ num ])");
    
    //53
    contro[53][0]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][1]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][2]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][12]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][15]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][16]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][17]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     contro[53][18]=llenarArreAcciones(21,"reduce(instr → loc = bool ;)");
     
     //54
     contro[54][2]=llenarArreAcciones(11111,"shift(21)");
     contro[54][5]=llenarArreAcciones(11111,"shift(44)");
     contro[54][13]=llenarArreAcciones(11111,"shift(42)");
     contro[54][28]=llenarArreAcciones(11111,"shift(40)");
     contro[54][31]=llenarArreAcciones(11111,"shift(39)");
     contro[54][32]=llenarArreAcciones(11111,"shift(45)");
     contro[54][33]=llenarArreAcciones(11111,"shift(46)");
     contro[54][34]=llenarArreAcciones(11111,"shift(47)");
     
     //55
     contro[55][2]=llenarArreAcciones(11111,"shift(21)");
     contro[55][5]=llenarArreAcciones(11111,"shift(44)");
     contro[55][13]=llenarArreAcciones(11111,"shift(42)");
     contro[55][28]=llenarArreAcciones(11111,"shift(40)");
     contro[55][31]=llenarArreAcciones(11111,"shift(39)");
     contro[55][32]=llenarArreAcciones(11111,"shift(45)");
     contro[55][33]=llenarArreAcciones(11111,"shift(46)");
     contro[55][34]=llenarArreAcciones(11111,"shift(47)");
    
     //56
      contro[56][2]=llenarArreAcciones(11111,"shift(21)");
     contro[56][5]=llenarArreAcciones(11111,"shift(44)");
     contro[56][13]=llenarArreAcciones(11111,"shift(42)");
     contro[56][28]=llenarArreAcciones(11111,"shift(40)");
     contro[56][31]=llenarArreAcciones(11111,"shift(39)");
     contro[56][32]=llenarArreAcciones(11111,"shift(45)");
     contro[56][33]=llenarArreAcciones(11111,"shift(46)");
     contro[56][34]=llenarArreAcciones(11111,"shift(47)");
     
     //57
      contro[57][2]=llenarArreAcciones(11111,"shift(21)");
     contro[57][5]=llenarArreAcciones(11111,"shift(44)");
     contro[57][13]=llenarArreAcciones(11111,"shift(42)");
     contro[57][28]=llenarArreAcciones(11111,"shift(40)");
     contro[57][31]=llenarArreAcciones(11111,"shift(39)");
     contro[57][32]=llenarArreAcciones(11111,"shift(45)");
     contro[57][33]=llenarArreAcciones(11111,"shift(46)");
     contro[57][34]=llenarArreAcciones(11111,"shift(47)");
    //58
     contro[58][2]=llenarArreAcciones(11111,"shift(21)");
     contro[58][5]=llenarArreAcciones(11111,"shift(44)");
     contro[58][13]=llenarArreAcciones(11111,"shift(42)");
     contro[58][28]=llenarArreAcciones(11111,"shift(40)");
     contro[58][31]=llenarArreAcciones(11111,"shift(39)");
     contro[58][32]=llenarArreAcciones(11111,"shift(45)");
     contro[58][33]=llenarArreAcciones(11111,"shift(46)");
     contro[58][34]=llenarArreAcciones(11111,"shift(47)");
    //59
     contro[59][2]=llenarArreAcciones(11111,"shift(21)");
     contro[59][5]=llenarArreAcciones(11111,"shift(44)");
     contro[59][13]=llenarArreAcciones(11111,"shift(42)");
     contro[59][28]=llenarArreAcciones(11111,"shift(40)");
     contro[59][31]=llenarArreAcciones(11111,"shift(39)");
     contro[59][32]=llenarArreAcciones(11111,"shift(45)");
     contro[59][33]=llenarArreAcciones(11111,"shift(46)");
     contro[59][34]=llenarArreAcciones(11111,"shift(47)");
    //60
     contro[60][2]=llenarArreAcciones(11111,"shift(21)");
     contro[60][5]=llenarArreAcciones(11111,"shift(44)");
     contro[60][13]=llenarArreAcciones(11111,"shift(42)");
     contro[60][28]=llenarArreAcciones(11111,"shift(40)");
     contro[60][31]=llenarArreAcciones(11111,"shift(39)");
     contro[60][32]=llenarArreAcciones(11111,"shift(45)");
     contro[60][33]=llenarArreAcciones(11111,"shift(46)");
     contro[60][34]=llenarArreAcciones(11111,"shift(47)");
    //61
     contro[61][2]=llenarArreAcciones(11111,"shift(21)");
     contro[61][5]=llenarArreAcciones(11111,"shift(44)");
     contro[61][13]=llenarArreAcciones(11111,"shift(42)");
     contro[61][28]=llenarArreAcciones(11111,"shift(40)");
     contro[61][31]=llenarArreAcciones(11111,"shift(39)");
     contro[61][32]=llenarArreAcciones(11111,"shift(45)");
     contro[61][33]=llenarArreAcciones(11111,"shift(46)");
     contro[61][34]=llenarArreAcciones(11111,"shift(47)");
     //62
      contro[62][2]=llenarArreAcciones(11111,"shift(21)");
     contro[62][5]=llenarArreAcciones(11111,"shift(44)");
     contro[62][13]=llenarArreAcciones(11111,"shift(42)");
     contro[62][28]=llenarArreAcciones(11111,"shift(40)");
     contro[62][31]=llenarArreAcciones(11111,"shift(39)");
     contro[62][32]=llenarArreAcciones(11111,"shift(45)");
     contro[62][33]=llenarArreAcciones(11111,"shift(46)");
     contro[62][34]=llenarArreAcciones(11111,"shift(47)");
     //63
      contro[63][2]=llenarArreAcciones(11111,"shift(21)");
     contro[63][5]=llenarArreAcciones(11111,"shift(44)");
     contro[63][13]=llenarArreAcciones(11111,"shift(42)");
     contro[63][28]=llenarArreAcciones(11111,"shift(40)");
     contro[63][31]=llenarArreAcciones(11111,"shift(39)");
     contro[63][32]=llenarArreAcciones(11111,"shift(45)");
     contro[63][33]=llenarArreAcciones(11111,"shift(46)");
     contro[63][34]=llenarArreAcciones(11111,"shift(47)");
     //64
      contro[64][2]=llenarArreAcciones(11111,"shift(21)");
     contro[64][5]=llenarArreAcciones(11111,"shift(44)");
     contro[64][13]=llenarArreAcciones(11111,"shift(42)");
     contro[64][28]=llenarArreAcciones(11111,"shift(40)");
     contro[64][31]=llenarArreAcciones(11111,"shift(39)");
     contro[64][32]=llenarArreAcciones(11111,"shift(45)");
     contro[64][33]=llenarArreAcciones(11111,"shift(46)");
     contro[64][34]=llenarArreAcciones(11111,"shift(47)");
    //65
    contro[65][2]=llenarArreAcciones(11111,"shift(21)");
     contro[65][5]=llenarArreAcciones(11111,"shift(44)");
     contro[65][13]=llenarArreAcciones(11111,"shift(42)");
     contro[65][28]=llenarArreAcciones(11111,"shift(40)");
     contro[65][31]=llenarArreAcciones(11111,"shift(39)");
     contro[65][32]=llenarArreAcciones(11111,"shift(45)");
     contro[65][33]=llenarArreAcciones(11111,"shift(46)");
     contro[65][34]=llenarArreAcciones(11111,"shift(47)");
     
     //66
    contro[66][3]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][6]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][14]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][19]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][20]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][21]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][22]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][23]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][24]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][25]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][26]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][27]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][28]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][29]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    contro[66][30]=llenarArreAcciones(23,"reduce(unario → ! unario)");
    
    //67
   contro[67][3]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][6]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][14]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][19]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][20]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][21]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][22]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][23]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][24]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][25]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][26]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][27]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][28]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][29]=llenarArreAcciones(23,"reduce(unario → - unario)");
    contro[67][30]=llenarArreAcciones(23,"reduce(unario → - unario)");
    
    //68
    contro[68][14]=llenarArreAcciones(11111,"shift(85)");
    contro[68][19]=llenarArreAcciones(11111,"shift(54)");
    
    //69
    contro[69][3]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][4]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][6]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][11]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][14]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][19]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][20]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][21]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][22]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][23]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][24]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][25]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][26]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][27]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][28]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][29]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    contro[69][30]=llenarArreAcciones(24,"reduce(loc → loc [ bool ])");
    
    //70
     contro[70][0]=llenarArreAcciones(11111,"shift(3)");
     contro[70][2]=llenarArreAcciones(11111,"shift(21)");
     contro[70][12]=llenarArreAcciones(11111,"shift(16)");
     contro[70][16]=llenarArreAcciones(11111,"shift(17)");
     contro[70][17]=llenarArreAcciones(11111,"shift(18)");
     contro[70][18]=llenarArreAcciones(11111,"shift(19)");
    //71
     contro[71][0]=llenarArreAcciones(11111,"shift(3)");
     contro[71][2]=llenarArreAcciones(11111,"shift(21)");
     contro[71][12]=llenarArreAcciones(11111,"shift(16)");
     contro[71][16]=llenarArreAcciones(11111,"shift(17)");
     contro[71][17]=llenarArreAcciones(11111,"shift(18)");
     contro[71][18]=llenarArreAcciones(11111,"shift(19)");
     
    //72
    contro[72][2]=llenarArreAcciones(11111,"shift (21)");
    contro[72][5]=llenarArreAcciones(11111,"shift (44)");
    contro[72][13]=llenarArreAcciones(11111,"shift (42)");
    contro[72][28]=llenarArreAcciones(11111,"shift (40)");
    contro[72][31]=llenarArreAcciones(11111,"shift (39)");
    contro[72][32]=llenarArreAcciones(11111,"shift (45)");
    contro[72][33]=llenarArreAcciones(11111,"shift (46)");
    contro[72][34]=llenarArreAcciones(11111,"shift (47)");
    
    //73
    contro[73][3]=llenarArreAcciones(25,"reduce(bool → bool or comb)");
    contro[73][6]=llenarArreAcciones(25,"reduce(bool → bool or comb)");
    contro[73][14]=llenarArreAcciones(25,"reduce(bool → bool or comb)");
    contro[73][19]=llenarArreAcciones(25,"reduce(bool → bool or comb)");
    contro[73][20]=llenarArreAcciones(11111,"shift (55)");
    
    //74
    contro[74][3]=llenarArreAcciones(26,"reduce(comb → comb && igualdad)");
    contro[74][6]=llenarArreAcciones(26,"reduce(comb → comb && igualdad)");
    contro[74][14]=llenarArreAcciones(26,"reduce(comb → comb && igualdad)");
    contro[74][19]=llenarArreAcciones(26,"reduce(comb → comb && igualdad)");
    contro[74][20]=llenarArreAcciones(26,"reduce(comb → comb && igualdad)");
    contro[74][21]=llenarArreAcciones(11111,"shift (56)");
    contro[74][22]=llenarArreAcciones(11111,"shift (57)");
    
    //75
    contro[75][3]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][6]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][14]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][19]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][20]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][21]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][22]=llenarArreAcciones(27,"reduce(igualdad → igualdad == rel)");
    contro[75][23]=llenarArreAcciones(11111,"shift (58)");
    contro[75][24]=llenarArreAcciones(11111,"shift (59)");
    contro[75][25]=llenarArreAcciones(11111,"shift (60)");
    contro[75][26]=llenarArreAcciones(11111,"shift (61)");
    
    //76
    contro[76][3]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][6]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][14]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][19]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][20]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][21]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][22]=llenarArreAcciones(27,"reduce(igualdad → igualdad != rel)");
    contro[76][23]=llenarArreAcciones(11111,"shift (58)");
    contro[76][24]=llenarArreAcciones(11111,"shift (59)");
    contro[76][25]=llenarArreAcciones(11111,"shift (60)");
    contro[76][26]=llenarArreAcciones(11111,"shift (61)");
    
    //77
     contro[77][3]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][6]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][14]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][19]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][20]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][21]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][22]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][23]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][24]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][25]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
    contro[77][26]=llenarArreAcciones(22,"reduce(rel → rel < expr)");
     contro[77][27]=llenarArreAcciones(11111,"shift (62)");
    contro[77][28]=llenarArreAcciones(11111,"shift (63)");
    
    //78
    contro[78][3]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][6]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][14]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][19]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][20]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][21]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][22]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][23]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][24]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][25]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][26]=llenarArreAcciones(22,"reduce(rel → rel > expr)");
    contro[78][27]=llenarArreAcciones(11111,"shift (62)");
    contro[78][28]=llenarArreAcciones(11111,"shift (63)");
    
    //79
      contro[79][3]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][6]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][14]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][19]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][20]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][21]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][22]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][23]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][24]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][25]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
    contro[79][26]=llenarArreAcciones(22,"reduce(rel → rel <= expr)");
     contro[79][27]=llenarArreAcciones(11111,"shift (62)");
    contro[79][28]=llenarArreAcciones(11111,"shift (63)");
    
    //80
    contro[80][3]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][6]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][14]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][19]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][20]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][21]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][22]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][23]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][24]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][25]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
    contro[80][26]=llenarArreAcciones(22,"reduce(rel → rel >= expr)");
     contro[80][27]=llenarArreAcciones(11111,"shift (62)");
    contro[80][28]=llenarArreAcciones(11111,"shift (63)");
    
    //81
      contro[81][3]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][6]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][14]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][19]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][20]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][21]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][22]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][23]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][24]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][25]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][26]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][27]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][28]=llenarArreAcciones(28,"reduce(expr → expr + term)");
    contro[81][29]=llenarArreAcciones(11111,"shift (64)");
    contro[81][30]=llenarArreAcciones(11111,"shift (65)");
    
    //82
   contro[82][3]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][6]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][14]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][19]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][20]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][21]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][22]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][23]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][24]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][25]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][26]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][27]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][28]=llenarArreAcciones(28,"reduce(expr → expr - term)");
    contro[82][29]=llenarArreAcciones(11111,"shift (64)");
    contro[82][30]=llenarArreAcciones(11111,"shift (65)");
    
    //83
     contro[83][3]=llenarArreAcciones(29,"reduce(term → term * unario)");
      contro[83][3]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][6]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][14]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][19]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][20]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][21]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][22]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][23]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][24]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][25]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][26]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][27]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][28]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][29]=llenarArreAcciones(29,"reduce(term → term * unario)");
    contro[83][30]=llenarArreAcciones(29,"reduce(term → term * unario)");
    
    //84
      contro[84][3]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][6]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][14]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][19]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][20]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][21]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][22]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][23]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][24]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][25]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][26]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][27]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][28]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][29]=llenarArreAcciones(29,"reduce(term → term / unario)");
    contro[84][30]=llenarArreAcciones(29,"reduce(term → term / unario)");
    
    //85
   contro[85][3]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][6]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][14]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][19]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][20]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][21]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][22]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][23]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][24]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][25]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][26]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][27]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][28]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][29]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    contro[85][30]=llenarArreAcciones(30,"reduce(factor → ( bool ))");
    
    //86
    contro[86][0]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][0]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][1]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][2]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][12]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][15]=llenarArreAcciones(11111,"shift (89)");
    contro[86][16]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][17]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
    contro[86][18]=llenarArreAcciones(31,"reduce(instr → if ( bool ) instr)");
      
      //87
    contro[87][0]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][1]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][2]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][12]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][15]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][16]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][17]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      contro[87][18]=llenarArreAcciones(31,"reduce(instr → while ( bool ) instr)");
      
      //88
     contro[88][14]=llenarArreAcciones(11111,"shift(90)");
     contro[88][19]=llenarArreAcciones(11111,"shift(54)");
     
     //89
     contro[89][0]=llenarArreAcciones(11111,"shift(3)");
     contro[89][2]=llenarArreAcciones(11111,"shift(21)");
     contro[89][12]=llenarArreAcciones(11111,"shift(16)");
     contro[89][16]=llenarArreAcciones(11111,"shift(17)");
     contro[89][17]=llenarArreAcciones(11111,"shift(18)");
     contro[89][18]=llenarArreAcciones(11111,"shift(19)");
      
     //90
     contro[90][3]=llenarArreAcciones(11111,"shift(92)");
      //91
    contro[91][0]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][1]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][2]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][12]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][15]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][16]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][17]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      contro[91][18]=llenarArreAcciones(33,"reduce(instr → if ( bool ) instr else instr)");
      
      //92
    contro[92][0]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][1]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][2]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][12]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][15]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][16]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][17]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
    contro[92][18]=llenarArreAcciones(33,"reduce(instr → do instr while ( bool ) ;)");
   }
   public void relacion(){
       for (int i = 0; i < 93; i++) {
		for (int t = 0; t < 53; t++) {
			 relacion[i][t] = 11112; 
		}
	}
     //estado 0
      relacion[0][0] = 3; 
      relacion[0][36] =1;
      relacion[0][37] =2;
     //3
     relacion[3][38] =4;
     //4
      relacion[4][7]=9; 
      relacion[4][8]=10; 
      relacion[4][9]=11; 
      relacion[4][10]=12; 
      relacion[4][39] =5;
      relacion[4][40] =6;
      relacion[4][41] =7;
      relacion[4][42] =8;
     //estado 5
      relacion[5][0]= 3;
      relacion[5][1]=13;
      relacion[5][2]=21;
      relacion[5][12]=16;
      relacion[5][16]=17;
      relacion[5][17]=18;
      relacion[5][18]=19;
      relacion[5][37]=20;
      relacion[5][43]=14;
      relacion[5][44]=15;
     
     
     //estado 7
      relacion[7][2]= 22;
      relacion[7][4]=23;
     
     
     //estado 15
      relacion[15][4]=25;
      relacion[15][11]=24;
     
     //estado 16
      relacion[16][13]=26;
    
     
     //estado 17
      relacion[17][13]=25;
     
     //estado 18
      relacion[18][0]=3;
      relacion[18][2]=21;
      relacion[18][12]=16;
      relacion[18][16]=17;
      relacion[18][17]=18;
      relacion[18][18]=19;
      relacion[18][37]=20;
      relacion[18][43]=28;
      relacion[18][44]=15; 
       //estado 19
      relacion[19][3]=29;
     
     
     //estado 22
      relacion[22][3]=30;
     
     //estado 23
      relacion[23][5]=31;
     
     //estado 24
      relacion[24][2]=21;
      relacion[24][5]=44;
      relacion[24][13]=42;
      relacion[24][28]=40;
      relacion[24][31]=39;
      relacion[24][32]=45;
      relacion[24][33]=46;
      relacion[24][34]=47;
      relacion[24][44]=43;
      relacion[24][45]=32;
      relacion[24][46]=33;
      relacion[24][47]=34;
      relacion[24][48]=35;
      relacion[24][49]=36;
      relacion[24][50]=37;
      relacion[24][51]=38;
      relacion[24][52]=41;
    
     //estado 25
      relacion[25][2]=21;
      relacion[25][5]=44;
      relacion[25][13]=42;
      relacion[25][28]=40;
      relacion[25][31]=39;
      relacion[25][32]=45;
      relacion[25][33]=46;
      relacion[25][34]=47;
      relacion[25][44]=43;
      relacion[25][45]=48;
      relacion[25][46]=33;
      relacion[25][47]=34;
      relacion[25][48]=35;
      relacion[25][49]=36;
      relacion[25][50]=37;
      relacion[25][51]=38;
      relacion[25][52]=41;

     //estado 26
      relacion[26][2]=21;
      relacion[26][5]=44;
      relacion[26][13]=42;
      relacion[26][28]=40;
      relacion[26][31]=39;
      relacion[26][32]=45;
      relacion[26][33]=46;
      relacion[26][34]=47;
      relacion[26][44]=43;
      relacion[26][45]=49;
      relacion[26][46]=33;
      relacion[26][47]=34;
      relacion[26][48]=35;
      relacion[26][49]=36;
      relacion[26][50]=37;
      relacion[26][51]=38;
      relacion[26][52]=41;
     
     //estado 27
      relacion[27][2]=21;
      relacion[27][5]=44;
      relacion[27][13]=42;
      relacion[27][28]=40;
      relacion[27][31]=39;
      relacion[27][32]=45;
      relacion[27][33]=46;
      relacion[27][34]=47;
      relacion[27][44]=43;
      relacion[27][45]=50;
      relacion[27][46]=33;
      relacion[27][47]=34;
      relacion[27][48]=35;
      relacion[27][49]=36;
      relacion[27][50]=37;
      relacion[27][51]=38;
      relacion[27][52]=41;
     
     //estado 28
      relacion[28][16]=51;
     
     //31
      relacion[31][6]=52;
     
     //32
      relacion[32][3]=53;
      relacion[32][19]=54;
     
    //33
   
     relacion[33][20]=55;
    
    //34
   
     relacion[34][21]=56;
     relacion[34]   [22]=57;
    
    //35
   
     relacion[35][23]=58;
     relacion[35][24]=59;
     relacion[35][25]=60;
     relacion[35][26]=61;
    
    //36
    
      relacion[36][27]=62;
     relacion[36][28]=63;
    
    //37
    
     relacion[37][29]=64;
     relacion[37][30]=65;
    
    
    //39
     relacion[39][2]=21;
     relacion[39][5]=44;
     relacion[39][13]=42;
     relacion[39][28]=40;
     relacion[39][31]=39;
     relacion[39][32]=45;
     relacion[39][33]=46;
     relacion[39][34]=47;
     relacion[39][44]=43;
     relacion[39][51]=66;
     relacion[39][52]=41;
     
    //40
     relacion[40][2]=21;
     relacion[40][5]=44;
     relacion[40][13]=42;
     relacion[40][28]=40;
     relacion[40][31]=39;
     relacion[40][32]=45;
     relacion[40][33]=46;
     relacion[40][34]=47;
     relacion[40][44]=43;
     relacion[40][51]=66;
     relacion[40][52]=41;
    
      //42
     relacion[42][2]=21;
     relacion[42][5]=44;
     relacion[42][13]=42;
     relacion[42][28]=40;
     relacion[42][31]=39;
     relacion[42][32]=45;
     relacion[42][33]=46;
     relacion[42][34]=47;
     relacion[42][44]=43;
     relacion[42][45]=68;
     relacion[42][46]=33;
     relacion[42][47]=34;
     relacion[42][48]=35;
     relacion[42][49]=36;
     relacion[42][50]=37;
     relacion[42][51]=38;
     relacion[42][52]=41;
    
    //43
     relacion[43][4]=25;
   
    
   
    
    //48
      relacion[48][6]=69;
     relacion[48][19]=54;
    
    //49
     relacion[49][14]=70;
     relacion[48][19]=54;
    
    //50
     relacion[50][14]=71;
     relacion[50][19]=54;
    
    //51
     relacion[51][13]=72;
    
     //54
      relacion[54][2]=21;
      relacion[54][5]=44;
      relacion[54][13]=42;
      relacion[54][28]=40;
      relacion[54][31]=39;
      relacion[54][32]=45;
      relacion[54][33]=46;
      relacion[54][34]=47;
      relacion[54][44]=43;
      relacion[54][46]=73;
      relacion[54][47]=34;
      relacion[54][48]=35;
      relacion[54][49]=36;
      relacion[54][50]=37;
      relacion[54][51]=38;
      relacion[54][52]=41;
     //55
      relacion[55][2]=21;
      relacion[55][5]=44;
      relacion[55][13]=42;
      relacion[55][28]=40;
      relacion[55][31]=39;
      relacion[55][32]=45;
      relacion[55][33]=46;
      relacion[55][34]=47;
      relacion[42][44]=43;
      relacion[42][47]=74;
      relacion[42][48]=35;
      relacion[42][49]=36;
      relacion[42][50]=37;
      relacion[42][51]=38;
      relacion[42][52]=41;
    
     //56
       relacion[56][2]=21;
      relacion[56][5]=44;
      relacion[56][13]=42;
      relacion[56][28]=40;
      relacion[56][31]=39;
      relacion[56][32]=45;
      relacion[56][33]=46;
      relacion[56][34]=47;
      relacion[56][44]=43;
      relacion[56][48]=75;
      relacion[56][49]=36;
      relacion[56][50]=37;
      relacion[56][51]=38;
      relacion[56][52]=41;
     
     //57
       relacion[57][2]=21;
      relacion[57][5]=44;
      relacion[57][13]=42;
      relacion[57][28]=40;
      relacion[57][31]=39;
      relacion[57][32]=45;
      relacion[57][33]=46;
      relacion[57][34]=47;
      relacion[57][44]=43;
      relacion[57][48]=76;
      relacion[57][49]=36;
      relacion[57][50]=37;
      relacion[57][51]=38;
      relacion[57][52]=41;
      
    //58
      relacion[58][2]=21;
      relacion[58][5]=44;
      relacion[58][13]=42;
      relacion[58][28]=40;
      relacion[58][31]=39;
      relacion[58][32]=45;
      relacion[58][33]=46;
      relacion[58][34]=47;
      relacion[58][44]=43;
      relacion[58][49]=77;
      relacion[58][50]=37;
      relacion[58][51]=38;
      relacion[58][52]=41;
    //59
      relacion[59][2]=21;
      relacion[59][5]=44;
      relacion[59][13]=42;
      relacion[59][28]=40;
      relacion[59][31]=39;
      relacion[59][32]=45;
      relacion[59][33]=46;
      relacion[59][34]=47;
      relacion[59][44]=43;
      relacion[59][49]=78;
      relacion[59][50]=37;
      relacion[59][51]=38;
      relacion[59][52]=41;
      
    //60
      relacion[60][2]=21;
      relacion[60][5]=44;
      relacion[60][13]=42;
      relacion[60][28]=40;
      relacion[60][31]=39;
      relacion[60][32]=45;
      relacion[60][33]=46;
      relacion[60][34]=47;
      relacion[60][44]=43;
      relacion[60][49]=79;
      relacion[60][50]=37;
      relacion[60][51]=38;
      relacion[60][52]=41;
    //61
      relacion[61][2]=21;
      relacion[61][5]=44;
      relacion[61][13]=42;
      relacion[61][28]=40;
      relacion[61][31]=39;
      relacion[61][32]=45;
      relacion[61][33]=46;
      relacion[61][34]=47;
      relacion[61][44]=43;
      relacion[61][49]=80;
      relacion[61][50]=37;
      relacion[61][51]=38;
      relacion[61][52]=41;
     //62
       relacion[62][2]=21;
      relacion[62][5]=44;
      relacion[62][13]=42;
      relacion[62][28]=40;
      relacion[62][31]=39;
      relacion[62][32]=45;
      relacion[62][33]=46;
      relacion[62][34]=47;
      relacion[62][44]=43;
      relacion[62][50]=81;
      relacion[62][51]=38;
      relacion[62][52]=41;
     //63
       relacion[63][2]=21;
      relacion[63][5]=44;
      relacion[63][13]=42;
      relacion[63][28]=40;
      relacion[63][31]=39;
      relacion[63][32]=45;
      relacion[63][33]=46;
      relacion[63][34]=47;
      relacion[63][44]=43;
      relacion[63][50]=82;
      relacion[63][51]=38;
      relacion[63][52]=41;
     //64
       relacion[64][2]=21;
      relacion[64][5]=44;
      relacion[64][13]=42;
      relacion[64][28]=40;
      relacion[64][31]=39;
      relacion[64][32]=45;
      relacion[64][33]=46;
      relacion[64][34]=47;
      relacion[64][44]=43;
      relacion[64][51]=83;
      relacion[64][52]=41;
    //65
     relacion[65][2]=21;
      relacion[65][5]=44;
      relacion[65][13]=42;
      relacion[65][28]=40;
      relacion[65][31]=39;
      relacion[65][32]=45;
      relacion[65][33]=46;
      relacion[65][34]=47;
      relacion[65][44]=43;
      relacion[65][51]=84;
      relacion[65][52]=41;
    
   

    //68
     relacion[68][14]=85;
     relacion[68][19]=54;
     
    
    //70
      relacion[70][0]=3;
      relacion[70][2]=21;
      relacion[70][12]=16;
      relacion[70][16]=17;
      relacion[70][17]=18;
      relacion[70][18]=19;
      relacion[70][37]=20;
      relacion[70][43]=86;
      relacion[70][44]=15;
      
    //71
      relacion[71][0]=3;
      relacion[71][2]=21;
      relacion[71][12]=16;
      relacion[71][16]=17;
      relacion[71][17]=18;
      relacion[71][18]=19;
      relacion[71][37]=20;
      relacion[71][43]=87;
      relacion[71][44]=15;
     
    //72
     relacion[72][2]=21;
     relacion[72][5]=44;
     relacion[72][13]=42;
     relacion[72][28]=40;
     relacion[72][31]=39;
     relacion[72][32]=45;
     relacion[72][33]=46;
     relacion[72][34]=47;
     relacion[72][44]=43;
     relacion[72][45]=88;
     relacion[72][46]=33;
     relacion[72][47]=34;
     relacion[72][48]=35;
     relacion[72][49]=36;
     relacion[72][50]=37;
     relacion[72][51]=38;
     relacion[72][52]=41;
    
    //73
    
     relacion[73][20]=55;
    
    //74
     relacion[74][21]=56;
     relacion[74][22]=57;
    
    //75
     relacion[75][23]=58;
     relacion[75][24]=59;
     relacion[75][25]=60;
     relacion[75][26]=61;
    
    //76
     relacion[76][23]=58;
     relacion[76][24]=59;
     relacion[76][25]=60;
     relacion[76][26]=61;
    
    //77
      relacion[77][27]=62;
     relacion[77][28]=63;
    
    //78
     relacion[78][27]=62;
     relacion[78][28]=63;
    
    //79
      relacion[79][27]=62;
     relacion[79][28]=63;
    
    //80
      relacion[80][27]=62;
     relacion[80][28]=63;
    
    //81
     relacion[81][29]=64;
     relacion[81][30]=65;
    
    //82
     relacion[82][29]=64;
     relacion[82][30]=65;
    
   
    //86  
     relacion[86][15]=89;
      
      //88
      relacion[88][14]=90;
      relacion[88][19]=54;
     
     //89
      relacion[89][0]=3;
      relacion[89][2]=21;
      relacion[89][12]=16;
      relacion[89][16]=17;
      relacion[89][17]=18;
      relacion[89][18]=19;
      relacion[89][37]=20;
      relacion[89][43]=91;
      relacion[89][44]=15;
      
     //90
      relacion[90][3]=92;
       
   }
   public ArrayList<Object> llenarArreAcciones(Object token ,String accion){
    ArrayList<Object> accionTabla = new ArrayList<Object>();
       
    accionTabla.add(token);
    accionTabla.add(accion);
    return accionTabla;
   }
}
