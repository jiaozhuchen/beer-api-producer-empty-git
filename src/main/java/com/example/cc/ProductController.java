package com.example.cc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value = "/updatePrice",
			method= RequestMethod.POST,
			consumes="application/json",
			produces="application/json")
	public Product updatePrice(@RequestBody ProductPriceRequest priceRequest) throws Exception {
		if(priceRequest != null && priceRequest.getProductId() < 1000L) {
			Product product = new Product();
			product.setId(priceRequest.getProductId());
			product.setPrice(priceRequest.getPrice());
			return product;
		}
		throw new Exception();
	}
}
