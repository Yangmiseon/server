```mermaid
sequenceDiagram
    participant 사용자
    participant 로그인
    participant 포인트

    사용자 ->> 로그인: 쇼핑몰에 접속한다
    사용자 ->> 포인트: 포인트를 충전한다 (최대 100만원)
    포인트 -->> 사용자: 충전된 잔액을 보여준다
```