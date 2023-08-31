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
public @Data class Transaction implements IEntity {
    private static final long serialVersionUID = 1L;

    public enum TYPE {
        TRANSFER, PAYMENT, CASH_WITHDRAWAL, REFILL

    }

    private long id;
    private TYPE type;
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDesSerializer.class)
    private LocalDateTime start;
    @JsonSerialize(using = CustomLocalDateTimeSerializer.class)
    @JsonDeserialize(using = CustomLocalDateTimeDesSerializer.class)
    private LocalDateTime finish;
    private double amount;


}
