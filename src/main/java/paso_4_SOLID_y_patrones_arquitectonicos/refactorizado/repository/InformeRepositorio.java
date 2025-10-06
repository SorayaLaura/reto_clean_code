package paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.repository;

import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.domain.InformeData;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.Repositorio;

class InformeRepositorio implements Repositorio {
    @Override
    public void guardar(InformeData data) { /* guardar BD */ }
}