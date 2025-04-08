package kr.hhplus.be.server.point;

import org.springframework.stereotype.Service;

@Service
public class PointService {
    private final PointRepository pointRepository;

    public PointService(PointRepository pointRepository){
        this.pointRepository = pointRepository;
    }

    public PointEntity getUserPoint(String userId) {
        return pointRepository.findByUserId(userId);
    }
}
