# Software Architecture Start
### 🎯 Goal
프로젝트에서 반복적으로 사용될 수 있는 공통 설정에 대해 common 모듈 or Boilerplate를 생성하여 추후 프로젝트에 활용할 수 있도록 하고자 함

<br><br>

### ✅ Requirements
- 방식 결정: common 모듈(multi-module 방식) 또는 Boilerplate 중 본인이 추구하고자 하는 방식을 선택
- 공통 설정 정의: Response, Custom Error, Global ExceptionHandler 등 반복적으로 사용될 수 있는 설정 포함
- 테스트 API 생성: 공통 설정이 정상적으로 동작하는지 확인하기 위한 간단한 API 구현
  - ping api : `GET` /ping

<br><br>

### ☝️ Thinking Point
- 선택한 방식(common 모듈 vs. Boilerplate)의 장단점과 적합성
- 앞으로 진행할 프로젝트에서 어떤 아키텍처와 테스트 전략을 적용할지 고민
- 리뷰어에게 받을 피드백의 중점 사항 정의 (예: 설계의 확장성, 코드의 가독성, 테스트 전략 등)
