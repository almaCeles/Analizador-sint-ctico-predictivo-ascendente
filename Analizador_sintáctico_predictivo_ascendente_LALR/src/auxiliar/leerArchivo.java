/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celes
 */
public class leerArchivo {
     FileReader archivo = null;
    public String lArchivo() {
         String ST = "";
        try {
            archivo = new FileReader("D:\\documentos\\Tecnologico\\9\\automatas\\Analizador-sint-ctico-predictivo-ascendente\\Analizador_sintáctico_predictivo_ascendente_LALR\\src\\auxiliar\\input.txt");
            
             ST = new String(Files.readAllBytes((Path) archivo));
            return ST;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(leerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(leerArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
         return ST;
    }
}
