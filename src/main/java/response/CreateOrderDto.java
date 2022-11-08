package response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class CreateOrderDto implements Serializable {

    private Long orderId;
    private Enum status;
    private Long customerId;
    private Double totalPrice;
    private String address;
}

