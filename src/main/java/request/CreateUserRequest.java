package request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class CreateUserRequest {

    @NotNull(message = "Username can not be empty")
    private String userName;
    @NotNull(message = "Password can not be empty")
    private String password;
    @NotNull(message = "Name can not be empty")
    private String name;
    @Min(value = 18)
    @NotNull(message = "Age can not be empty")
    private Integer age;
    @NotNull(message = "Email can not be empty")
    private String email;
    @NotNull(message = "Phone can not be empty")
    private String phone;
    @NotNull(message = "Address can not be empty")
    private String address;
}
