package response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class GetOrdersOfUserDto implements Serializable {

    private Long orderId;
    private Double totalPrice;
    private Enum status;


}
