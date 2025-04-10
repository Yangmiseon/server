```mermaid
sequenceDiagram
    participant 사용자
    participant 로그인
    participant 쿠폰

    사용자 ->> 로그인: 쇼핑몰에 접속한다
    로그인 ->> 쿠폰: 쿠폰 수량 확인 (선착순 대상인지 판단)
    쿠폰   -->> 사용자: 대상일 경우 쿠폰을 발급한다

```