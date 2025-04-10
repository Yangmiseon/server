package kr.hhplus.be.server.point;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name ="point")
public class PointEntity {
    @Id
    @Column(unique = true, nullable = false)
    String userId;

    @Column(nullable = false)
    long amount;

    @Column(nullable = false)
    long pointTotal;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    TransactionType type;

    @Column
    LocalDateTime pointChargeTime;

    @Column
    LocalDateTime pointUseTime;

}
