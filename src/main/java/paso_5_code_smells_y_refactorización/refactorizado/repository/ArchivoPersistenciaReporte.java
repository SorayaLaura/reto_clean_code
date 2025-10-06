package paso_5_code_smells_y_refactorización.refactorizado.repository;

import paso_5_code_smells_y_refactorización.refactorizado.interfac.PersistenciaReporte;

public class ArchivoPersistenciaReporte implements PersistenciaReporte {
    @Override
    public void guardar(String contenido) {
        // Implementar guardado en archivo o base de datos
    }
}
