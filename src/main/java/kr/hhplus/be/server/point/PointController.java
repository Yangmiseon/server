package kr.hhplus.be.server.point;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointController {
    private static final Logger logger = LoggerFactory.getLogger(PointController.class);
    private PointService pointService;

    public PointController(PointService pointService) {

        this.pointService = pointService;
    }

    @GetMapping("/{userId}/pointTotal")
    public long  getUserPoint(@PathVariable String userId){
        return pointService.getUserPoint(userId);
    }

    @PatchMapping("{userId}/charge")
    public PointEntity charge(
            @PathVariable String userId,
            @RequestParam long amount
    ) {
        return pointService.chargeUserPoint(userId,amount);
    }
}