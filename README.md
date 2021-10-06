# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 파일에 구현할 기능 목록

- src/main/java/Application.java : 실행파일
- src/main/java/AwayTeam.java : 수비팀(컴퓨터)

	- makeNewRandomNumbers() : 3자리 난수로 목표값을 생성한다
	- isPreparingRandomNumbers() : 3자리 난수가 생성중인지 확인한다
	- getListWithUnduplicatedNumbers : 중복숫자가 없는 목록을 반환한다

- src/main/java/HomeTeam.java : 공격팀(사용자)

	- getGuessedNumberFromReadLine() : 입력창으로부터 입력값을 받는다
	- validateGuessedNumber() : 입력값이 유효한지 확인한다
	- stringToIntegerGuessedNumberList() : 입력값을 숫자배열로 변환한다
	- isDuplicatedNumberList() : 입력값에 중복된 숫자가 있는지 확인한다

- src/main/java/Umpire.java : 감독

	- resetResultNumbers() : 결과목록을 초기화한다
	- checkGuessedNumber() : 입력받은 추정값목록을 검토한다
	- checkNumberInRandomNumbers() : 추정값목록을 목표값과 비교한다
	- checkStrikeOrBall() : 스트라이크/볼 여부를 비교한다
	- isStrikeOrBall() : 스트라이크/볼 여부를 결과목록에 추가한다

- src/main/java/Controller.java : 게임흐름 통제

	- startGame() : 게임을 시작한다
	- runGame() : 게임을 진행한다(입력값과 결과통보를 반복한다)
	- isMatchAll() : 3스트라이크 여부를 확인한다
	- askRegame() : 재경기여부를 확인한다

- src/main/java/View.java : 콘솔에 메시지 표시
