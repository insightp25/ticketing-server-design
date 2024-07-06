package reservation.ticket.concert.presentation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 대기열 토큰에 userId와 concertId
 */
@RestController
@RequestMapping("/concerts")
public class ConcertController {

    @GetMapping("/{id}")
    public ResponseEntity<String> concert(
            @PathVariable Long id
    ) {
        return ResponseEntity
                .ok()
                .body("콘서트 ID, 콘서트 제목, 콘서트 일시, 티켓 가격");
    }

    @GetMapping("/{id}/reservations")
    public ResponseEntity<String> reservation(
            @PathVariable Long id,
            @RequestParam Long user_id
    ) {
        return ResponseEntity
                .ok()
                .body("콘서트 ID, 티켓 가격, 예약 불가 좌석 목록");
    }

    @PostMapping("/{id}/payments")
    public ResponseEntity<String> payment(
            @PathVariable String id,
            @RequestParam String user_id
    ) {
        return ResponseEntity
                .ok()
                .body("콘서트 ID, 콘서트 제목, 콘서트 일시, 사용자 잔여 포인트");
    }
}
