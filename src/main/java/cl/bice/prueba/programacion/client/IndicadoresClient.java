package cl.bice.prueba.programacion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.bice.prueba.programacion.message.IndicadoresResponse;
import cl.bice.prueba.programacion.to.Generico;

/**
* Cliente Feign para que tiene los metodos necesarios para consultar los indicadores
*
* @author  Elvis Almenar
* @version 1.0
* @since   2021-05-16 
*/
@FeignClient(name="indicadores", url="https://indecon.site")
public interface IndicadoresClient {

    @RequestMapping(method = RequestMethod.GET, value = "/last")
    IndicadoresResponse getUltimosIndicadores();
    
    @RequestMapping(method = RequestMethod.GET, value = "/date/{key}/{date}")
    Generico getEspecificoPorFecha(@PathVariable(name = "key") String id, @PathVariable(name = "date") String date);

}