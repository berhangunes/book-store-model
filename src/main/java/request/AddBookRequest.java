package request;


import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class AddBookRequest {

    @NotNull(message = "Name can not be empty")
    private String name;
    @NotNull(message = "Author can not be empty")
    private String author;
    @NotNull(message = "Stock can not be empty")
    @Min(1)
    private Integer stock;
    @NotNull(message = "Price can not be empty")
    private Double price;



}
