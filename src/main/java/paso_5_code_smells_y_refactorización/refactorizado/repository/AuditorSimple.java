package paso_5_code_smells_y_refactorización.refactorizado.repository;

import paso_5_code_smells_y_refactorización.refactorizado.interfac.Auditor;

import java.util.Date;

public class AuditorSimple implements Auditor {
    @Override
    public void registrar(String tipo, int longitud, Date fecha) {
        // Implementar registro de auditoría
    }
}