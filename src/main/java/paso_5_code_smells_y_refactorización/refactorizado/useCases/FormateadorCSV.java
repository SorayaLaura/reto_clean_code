package paso_5_code_smells_y_refactorización.refactorizado.useCases;

import paso_5_code_smells_y_refactorización.refactorizado.domain.Empleado;
import paso_5_code_smells_y_refactorización.refactorizado.interfac.FormateadorReporte;

import java.util.List;

public class FormateadorCSV implements FormateadorReporte {
    @Override
    public String formatear(List<Empleado> empleados) {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : empleados) {
            sb.append(e.getId()).append(";")
                    .append(e.getNombre()).append(";")
                    .append(e.getSalario()).append("\n");
        }
        return sb.toString();
    }
}