package com.example;

//remove::start[]
import com.example.cc.ProductController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

// remove::end[]

public abstract class BeerRestBase {
	//remove::start[]
	ProducerController producerController = new ProducerController(oldEnough());
	ProductController productController = new ProductController();

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(this.producerController, this.productController);
	}

	private PersonCheckingService oldEnough() {
		return argument -> argument.age >= 20;
	}
	//remove::end[]
}
