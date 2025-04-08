package kr.hhplus.be.server.point;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PointHistoryRepository extends JpaRepository<PointHistoryEntity, Integer> {
    List<PointHistoryEntity> findByUserId(String userId);

}
