package paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.useCases;

import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.domain.InformeData;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.Notificador;

class EmailNotificador implements Notificador {
    @Override
    public void notificar(InformeData data) { /* enviar email */ }
}