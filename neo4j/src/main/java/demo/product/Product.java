package demo.product;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * A simple domain class for the {@link Product}
 * concept in the order context.
 *
 * @author Kenny Bastani
 * @author Josh Long
 */
@NodeEntity
public class Product {

	@GraphId
	private Long id;
	private String name, productId;
	private Double unitPrice;

	public Product() {
	}

	public Product(String name, String productId, Double unitPrice) {
		this.name = name;
		this.productId = productId;
		this.unitPrice = unitPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", name='" + name + '\'' + ", productId='"
				+ productId + '\'' + ", unitPrice=" + unitPrice + '}';
	}
}
