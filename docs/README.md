## 다리건너기

### 게임 개요

> **둘 중 하나의 칸만 건널 수 있는 다리를 끝까지 건너가는 게임**   
> <br />
> a. **[ 사용자 ]** 전체 다리 길이를 입력한다.
>
> b. **[ 컴퓨터 ]** 다리를 생성한다.
>   * 위 칸과 아래 칸 중 건널 수 있는 칸은 무작위로 지정한다.
>   * 무작위 값 0, 1 중 0이면 아래 칸, 1이면 윗 칸을 건널 수 있다.
>
> c. **[ 사용자 ]** 이동할 칸을 선택한다.
>   * 칸 선택은 U(윗칸) 또는 D(아래칸)으로 한다.
>
> d. **[ 컴퓨터 ]** 이동한 칸에 대해 출력한다. 
>   * 이동한 칸을 건널 수 있다면 O로 표시한다. 건널 수 없다면 X로 표시한다.
>   * 현재까지 건넌 다리를 모두 출력한다.
> 
> e. **[ 컴퓨터 ]** 게임 종료 여부를 판단하고 출력한다.
>   * 사용자가 실패했다면 게임 재시도 여부를 묻고 입력 받는다.
>   * 사용자가 성공했다면 결과와 총 시도 횟수를 출력한다. 

### 구현 기능 목록

1. 난수 생성
* 정보
    * 컴퓨터가 제출하는 문제로 사용자가 입력한 수 만큼 0 혹은 1을 생성한다. 
* 구현 방법
    * BridgeRandomNumberGenerator 클래스 내에서 구현한다.
    * bridge.BridgeRandomNumberGenerator의 generate()를 활용한다.

<br />

2. 사용자 입력
* 정보
    * 다리의 길이
    * 이동할 칸의 위치
    * 재시도 여부
* 구현 방법
    * InputView Class에서 camp.nextstep.edu.missionutils.Console의 readLine()을 활용

<br />

3. 예외처리
* 정보
    * 사용자가 잘못된 값을 입력할 경우 애플리케이션 종료
* 구현 방법
    * IllegalArgumentException, , IllegalStateException 등과 같은 명확한 유형을 발생
