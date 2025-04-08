package kr.hhplus.be.server.point;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name ="point")
public class PointEntity {
    @Id
    @Column(unique = true)
    String userId;

    long amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    TransactionType type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    Date pointChargeTime;

    @Temporal(TemporalType.TIMESTAMP)
    Date pointUseTime;

}
