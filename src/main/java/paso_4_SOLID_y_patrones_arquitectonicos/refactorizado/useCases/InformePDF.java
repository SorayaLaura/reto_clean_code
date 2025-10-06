package paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.useCases;

import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.domain.InformeData;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.GeneradorInforme;

class InformePDF implements GeneradorInforme {
    @Override
    public void generar(InformeData data) { /* generar PDF */ }
}