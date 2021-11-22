/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import java.io.File;

/**
 *
 * @author celes
 */
public class lexico {
    public static final String path ="D:\\documentos\\Tecnologico\\9\\automatas\\Analizador-sint-ctico-predictivo-ascendente\\Analizador_sintáctico_predictivo_ascendente_LALR\\src\\lexico\\NewLexer.flex";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generarLexer(path);
	}
	
	public static void generarLexer(String path){
		File file = new File(path);
		jflex.Main.generate(file);
	}

}
