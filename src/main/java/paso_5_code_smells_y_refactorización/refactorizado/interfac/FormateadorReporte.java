package paso_5_code_smells_y_refactorización.refactorizado.interfac;

import paso_5_code_smells_y_refactorización.refactorizado.domain.Empleado;

import java.util.List;

public interface FormateadorReporte {
    String formatear(List<Empleado> empleados);
}
