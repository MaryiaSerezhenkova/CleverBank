package clevertec.domain.entity;

import clevertec.utils.CustomLocalDateTimeDesSerializer;
import clevertec.utils.CustomLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public  @Data class Account implements IEntity {
    private static final long serialVersionUID = 1L;

    private long id;
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDesSerializer.class)
    private LocalDateTime dtCreate;
    private String iban;
    private String currency;
    private long bankId;
    private long userId;
    private double amount;


}
