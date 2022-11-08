package response;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@Builder
public class GetAllBooksDto implements Serializable {

    private Long id;
    private String name;
    private String author;
    private Integer stock;
    private Double price;

}
