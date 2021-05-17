package cl.bice.prueba.programacion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bice.prueba.programacion.client.IndicadoresClient;
import cl.bice.prueba.programacion.message.IndicadoresResponse;
import cl.bice.prueba.programacion.to.Generico;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
* Servicio que obtiene los indicadores del site https://indecon.site
*
* @author  Elvis Almenar
* @version 1.0
* @since   2021-05-16 
*/
@RestController
@RequestMapping("/indicadores")
@Api(value="Servicio encargado de obtener los indicadores comerciales")
public class IndicadoresController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndicadoresController.class);

	@Autowired
	IndicadoresClient client;
	

	/**
	 * Devuelve 3 indicadores especificos del ultimo dia
	 *
	 * @return ResponseEntity con el resultado de la operación <code>IndicadoresResponse</code>
	 *         
	 */
	@GetMapping(path = "/indicadores/ultimos")
	@ApiOperation(value = "Servicio que devuelve 3 indicadores especificos del ultimo dia", response = IndicadoresResponse.class)
	public ResponseEntity<IndicadoresResponse> obtenerUltimos() {
		IndicadoresResponse rs = null;
		LOGGER.info("Detalle de los últimos indicadores");
		try {
			rs = client.getUltimosIndicadores();
		} catch (Exception e) {
			LOGGER.error("Falla con consultar ultimos indicadores");
			return new ResponseEntity<IndicadoresResponse>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		return new ResponseEntity<IndicadoresResponse>(rs, HttpStatus.OK);
	}
	
	/**
	 * Retorna un indicador de una fecha especifica obtenido a traves de su sombre
	 *
	 * @return Generico con el resultado de la operación <code>IndicadoresResponse</code>
	 *         
	 */
	@GetMapping(path = "/indicadores/especifico/{key}/{date}")
	@ApiOperation(value = "Retorna un indicador de una fecha especifica obtenido a traves de su sombre", response = IndicadoresResponse.class)
	public ResponseEntity<Generico> obtenerEspecifico(@PathVariable(name = "key") String key, String date) {
		Generico rs = null;
		LOGGER.info("Detalle de un indicador especifico");
		try {
			rs = client.getEspecificoPorFecha(key,date);
		} catch (Exception e) {
			LOGGER.error("Falla al consultar indicador especifico");
			return new ResponseEntity<Generico>(HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		return new ResponseEntity<Generico>(rs, HttpStatus.OK);
	}

	

}
