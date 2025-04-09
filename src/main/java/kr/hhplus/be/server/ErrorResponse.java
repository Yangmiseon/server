package kr.hhplus.be.server;

public record ErrorResponse(
        String code,
        String message
) {
}
