package com.foroalura.domain.respuesta.validaciones.actualizar;

import com.foroalura.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}
