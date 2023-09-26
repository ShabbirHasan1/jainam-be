package in.codifi.orders.ws.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(value = JsonInclude.Include.NON_DEFAULT, content = JsonInclude.Include.NON_EMPTY)
public class BracketOrderLeg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("quantity")
	public Integer quantity;
	@JsonProperty("price")
	public Number price;
	@JsonProperty("trigger_price")
	public Number triggerPrice;

}
