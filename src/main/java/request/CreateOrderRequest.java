package request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class CreateOrderRequest {

    @NotNull(message = "BookIdList can not be empty")
    private List<Long> bookIdList;
    @NotNull(message = "UserId can not be empty")
    private Long userId;

}
