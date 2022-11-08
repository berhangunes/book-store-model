package response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {

    private Long userId;
    private String userName;
    private String name;
    private Integer age;
    private String email;
    private String phone;
    private String address;
}
