package pe.edu.idat.dsw1soapL7;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;

//import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("Lunes");
		lunes.setDia("Monday");
		/*
		 * spain.setCapital("Madrid");
		 * spain.setCurrency(Currency.EUR);
		 * spain.setPopulation(46704314);
		 */

		countries.put(lunes.getName(), lunes);

		Country martes = new Country();
		martes.setName("Martes");
		martes.setDia("Tuesday");
		/*
		 * poland.setCapital("Warsaw");
		 * poland.setCurrency(Currency.PLN);
		 * poland.setPopulation(38186860);
		 */

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("Miercoles");
		miercoles.setDia("Wednesday");
		/*
		 * uk.setCapital("London");
		 * uk.setCurrency(Currency.GBP);
		 * uk.setPopulation(63705000);
		 */

		countries.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("Jueves");
		jueves.setDia("Thursday");
		/*
		 * pe.setCapital("Lima");
		 * pe.setCurrency(Currency.GBP);
		 * pe.setPopulation(63705000);
		 */

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("Viernes");
		viernes.setDia("Friday");
		/*
		 * pe.setCapital("Lima");
		 * pe.setCurrency(Currency.GBP);
		 * pe.setPopulation(63705000);
		 */

		countries.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("Sabado");
		sabado.setDia("Saturday");
		/*
		 * pe.setCapital("Lima");
		 * pe.setCurrency(Currency.GBP);
		 * pe.setPopulation(63705000);
		 */

		countries.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("Domingo");
		domingo.setDia("Sunday");
		/*
		 * pe.setCapital("Lima");
		 * pe.setCurrency(Currency.GBP);
		 * pe.setPopulation(63705000);
		 */

		countries.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}
