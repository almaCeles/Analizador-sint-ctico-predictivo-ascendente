/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import lexico.Token;

/**
 *
 * @author celes
 */
public class menu {
    public String strRelacion(int n){
        String hola="";
        switch(n){
                case 36: hola= "programa"; break;
                case 37: hola="bloque"; break;
                case 38:hola="decls"; break;	
                case 39:hola="instrs"; break;	
                case 40:hola="decl";break;	
                case 41:hola="tipo";break;
                case 42: hola="basico";break;
                case 43: hola="instr";break;
                case 44: hola="loc";break;
                case 45:hola="bool";break;
                case 46:hola="comb"; break;
                case 47: hola="igualdad"; break;
                case 48:hola="rel";break;
                case 49:hola="expr"; break;
                case 50:hola="term"; break;
                case 51: hola="unario"; break;
                case 52: hola="factor";  break;
        }
        return hola;
    }
    
    
    public String sustitucion(Token t){
        String hola="";
        
        switch(t){
             case llaveIzq: hola="{";  break;
            case lleveDere: hola="}";  break;
            case id: hola="id";   break;
            case puntoYcoma: hola=";";   break;
            case corcheteIzq: hola="[";  break;
            case num:  hola="num"; break;
            case corcheteDere:  hola="]";   break;
            case iint: hola="int";  break;
            case ffloat:  hola="float";  break;
            case cchar: hola="char";   break;
            case bbolean: hola="blolean";   break;
            case igual: hola="=";   break;
            case iif: hola="if";   break;
            case parentisiIzq: hola="(";   break;
            case parentisiDere:  hola=")";  break;
            case eelse:  hola="else";   break;
            case wwhile: hola="while";   break;
            case ddo: hola="do";   break;
            case bbreak: hola="break";   break;
            case or: hola="or";  break;
            case iss: hola="&&";   break;
            case igualIgual: hola="==";  break;
            case negacion: hola="!=";  break;
            case menorque: hola="<";   break;
            case mayorque:  hola=">"; break;
            case menorIgual:  hola="<=";   break;
            case mayorIgual: hola=">=";   break;
            case suma: hola="+";   break;
            case resta: hola="-";  break;
            case multiplicacion: hola="*";   break;
            case divicion: hola="/";  break;
            case admiracion: hola="!"; break;
            case real: hola="real";   break;
            case ttrue: hola="true";   break;
            case ffalse: hola="false";   break;
            case _fin: hola="";   break;
        }
        return hola;
    }
}
