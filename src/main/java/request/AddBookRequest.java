package request;


import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
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
