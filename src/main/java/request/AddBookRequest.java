package request;


import lombok.Data;

@Data
public class AddBookRequest {

    private String name;
    private String author;
    private Integer stock;
    private Double price;



}
