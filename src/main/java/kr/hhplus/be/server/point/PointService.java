package kr.hhplus.be.server.point;

import org.springframework.stereotype.Service;

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
}
