## 옵저버 패턴

고양이, 강아지 사료주기 예시를 통한 옵저버 패턴 구현

* 동물
    * 고양이
    * 강아지
* `AnimalEventListener`
    * `AnimalEventListener`를 구독한 동물에게 특정 `action`이라는 이벤트가 들어올 때 메세지를 전달한다

* TODO
    * 발행해야하는 이벤트 목록을 상수로 정의할 수 있다