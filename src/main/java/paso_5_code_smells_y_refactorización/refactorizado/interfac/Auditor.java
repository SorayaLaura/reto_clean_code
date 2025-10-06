package paso_5_code_smells_y_refactorización.refactorizado.interfac;

import java.util.Date;

public interface Auditor {
    void registrar(String tipo, int longitud, Date fecha);
}
