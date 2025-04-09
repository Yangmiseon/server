package kr.hhplus.be.server.point;

import org.springframework.stereotype.Service;
import kr.hhplus.be.server.point.PointEntity;
import kr.hhplus.be.server.point.PointRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PointService {
    private final PointRepository pointRepository;
    private final PointHistoryRepository pointHistoryRepository;

    public PointService(
            PointRepository pointRepository,
            PointHistoryRepository pointHistoryRepository
    ) {
        this.pointRepository = pointRepository;
        this.pointHistoryRepository = pointHistoryRepository;
    }
    //userId로 현재 포인트 조회
    public long getUserPoint(String userId) {
        PointEntity point = pointRepository.findByUserId(userId);
        return point.getPointTotal();
    }

    //userId로 포인트 히스토리 조회
    public List<PointHistoryEntity> getUserPointHistory(String userId) {
        return pointHistoryRepository.findByUserId(userId);
    }

    //포인트 충전
    public PointEntity chargeUserPoint(String userId, long amount){
        PointEntity curPoint = pointRepository.findByUserId(userId);
        amount +=curPoint.getPointTotal();
        pointHistoryRepository.insert(userId, amount, TransactionType.CHARGE, LocalDateTime.now());
        return pointRepository.insertAndUpdate(userId, amount);
    }
}
