/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import auxiliar.leerArchivo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import static  lexico.Token.*;



/**
 *
 * @author celes
 */
public class main {
    static leerArchivo l= new leerArchivo();
    static Stack pila = new Stack();
    
    
    public static void main(String[] args) throws IOException {
        InputStream is = new ByteArrayInputStream(l.lArchivo().getBytes());
        NewLexer lexer= new NewLexer (is);
        Token token = lexer.yylex();
        
        do {
		Token op =  _shift;
		switch (op)
		{
		case _shift:
			
			break;
		case _error:
                    System.out.println("eror");
			return;
		case _accept:
			/*while (!stack.empty()) {
				stack.pop();
			}*/
			break;
		default://como puse numero en vez de R, pues si se descarta todo lo otro cae a defaul como _reduce
			
			/*for (int i = 0; i < n;i++) {
				stack.pop();
			}
			
			stack.push(R(stack.top(), A));
			*/
			break;
		}
	} while (!pila.empty());
        
    }
}
