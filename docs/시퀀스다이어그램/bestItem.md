```mermaid
sequenceDiagram
    participant 스케줄러
    participant 서버

    Note over 스케줄러: 매일 00:00에 실행
    스케줄러 ->> 서버: 최근3일간(D-3, D-2, D-1) 가장 많이 팔린 상품을 집계한다
```