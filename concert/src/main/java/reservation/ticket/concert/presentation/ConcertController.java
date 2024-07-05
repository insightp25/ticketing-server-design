package reservation.ticket.concert.presentation;

import org.springframework.web.bind.annotation.*;

/**
 * 대기열 토큰에 userId와 concertId
 */
@RestController
@RequestMapping("/concerts")
public class ConcertController {

    @GetMapping("/{id}")
    public String concert(
            @PathVariable Long id
    ) {
        return "concertTitle";
    }

    @GetMapping("/{id}/reservations")
    public String reservation(
            @PathVariable Long id,
            @RequestParam Long user_id
    ) {
        return "ticketTitle, ticketPrice, List<Seat>, lastCompletedWaitId";
    }

    @PostMapping("/{id}/payments")
    public String payment(
            @PathVariable String id,
            @RequestParam String user_id
    ) {
        return "reservationId, concertTitle";
    }
}
