package response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class GetUserByIdDto implements Serializable{

        private Long userId;
        private String name;
        private String email;
        private String phone;
        private String address;
}
