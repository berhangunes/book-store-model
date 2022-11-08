package response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class GetOrderByIdDto implements Serializable{
    private Long orderId;
    private Enum status;
    private Long customerId;
    private Double totalPrice;
    private String address;
    private Long [] orderedBooks;

}