package paso_5_code_smells_y_refactorización.refactorizado.controller;

import paso_5_code_smells_y_refactorización.refactorizado.domain.Empleado;
import paso_5_code_smells_y_refactorización.refactorizado.interfac.Auditor;
import paso_5_code_smells_y_refactorización.refactorizado.interfac.FormateadorReporte;
import paso_5_code_smells_y_refactorización.refactorizado.interfac.NotificadorReporte;
import paso_5_code_smells_y_refactorización.refactorizado.interfac.PersistenciaReporte;

import java.util.List;

public class ReporteEmpleadosRefactor {
    private final FormateadorReporte formateador;
    private final NotificadorReporte notificador;
    private final PersistenciaReporte persistencia;
    private final Auditor auditor;

    public ReporteEmpleadosRefactor(FormateadorReporte f, NotificadorReporte n, PersistenciaReporte p, Auditor a) {
        this.formateador = f;
        this.notificador = n;
        this.persistencia = p;
        this.auditor = a;
    }

    public String generarReporte(List<Empleado> empleados) {
        String contenido = formateador.formatear(empleados);
        notificador.enviar(contenido);
        persistencia.guardar(contenido);
        auditor.registrar("REPORTE", contenido.length(), new java.util.Date());
        return contenido;
    }
}

