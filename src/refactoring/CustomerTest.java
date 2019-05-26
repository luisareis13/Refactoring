package refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void statementTest() {
		Customer cliente = new Customer("Jose");
		Movie movie1 = new Movie("Avengers",1);
		Movie movie2 = new Movie ("Star Wars", 0);
		Movie movie3 = new Movie("Moolan", 2);
		Rental rental1 = new Rental(movie1, 1);
		Rental rental2 = new Rental(movie2, 2);
		Rental rental3 = new Rental(movie3,3);
		cliente.addRental(rental1);
		cliente.addRental(rental2);
		cliente.addRental(rental3);
		String retorno = cliente.statement();
		assertEquals(retorno, "Rental Record for Jose\n" + 
				"	Avengers	3.0\n" + 
				"	Star Wars	2.0\n" + 
				"	Moolan	1.5\n" + 
				"Amount owed is 6.5\n" + 
				"You earned 3 frequent renter points");
	}

}
