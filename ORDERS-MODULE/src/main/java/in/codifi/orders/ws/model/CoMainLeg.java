package in.codifi.orders.ws.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CoMainLeg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("order_type")
	private String orderType;
	@JsonProperty("quantity")
	private int qty;
	@JsonProperty("price")
	private float price;
	@JsonProperty("traded_quantity")
	private int tradedQty;

}
