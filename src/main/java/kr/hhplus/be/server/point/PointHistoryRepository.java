package kr.hhplus.be.server.point;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PointHistoryRepository extends JpaRepository<PointHistoryEntity, Integer> {
    List<PointHistoryEntity> findByUserId(String userId);
    PointHistoryEntity insert(String userId, long amount, TransactionType type, LocalDateTime pointChargeTime );
}
