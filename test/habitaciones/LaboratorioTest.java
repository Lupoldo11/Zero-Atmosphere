package habitaciones;

import org.junit.Test;
import static org.junit.Assert.*;
import habitaciones.Laboratorio;
import vehiculos.Nave;  // Asegúrate de que esta clase existe

public class LaboratorioTest {
    
    @Test
    public void testAtributos() {
        Laboratorio lab = new Laboratorio();
        
        // Verificar si los atributos están inicializados correctamente
        assertNull(lab.nave);  // Debería ser null si no se inicializa en el constructor
        assertEquals(0, lab.capsulasHibernacion);  // int por defecto es 0
    }
}
