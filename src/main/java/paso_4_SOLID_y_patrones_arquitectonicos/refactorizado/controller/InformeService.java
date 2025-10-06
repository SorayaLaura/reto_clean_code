package paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.controller;

import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.domain.InformeData;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.GeneradorInforme;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.Notificador;
import paso_4_SOLID_y_patrones_arquitectonicos.refactorizado.interfac.Repositorio;

class InformeService {
    private final GeneradorInforme generador;
    private final Notificador notificador;
    private final Repositorio repositorio;

    public InformeService(GeneradorInforme generador, Notificador notificador, Repositorio repositorio) {
        this.generador = generador;
        this.notificador = notificador;
        this.repositorio = repositorio;
    }

    public void procesar(InformeData data) {
        generador.generar(data);
        notificador.notificar(data);
        repositorio.guardar(data);
    }
}