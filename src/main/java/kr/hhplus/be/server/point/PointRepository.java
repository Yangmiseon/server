package kr.hhplus.be.server.point;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.time.LocalDateTime;

public interface  PointRepository extends JpaRepository<PointEntity, String> {
    //사용자 아이디로 사용자의 포인트 리스트 조회
    PointEntity findByUserId(String userId);
    PointEntity insertAndUpdate(String userId, long amount);
}
