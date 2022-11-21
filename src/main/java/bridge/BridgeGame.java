package bridge;

import java.util.ArrayList;
import java.util.List;

import static bridge.Application.bridgeLength;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {
    static int allTryCount = 0;
    int thisTryCount = 0;
    List<String> bridge = new ArrayList<>();
    List<String> bridgeCheck = new ArrayList<>();

    List<String> upperBridge = new ArrayList<>(bridgeLength);
    List<String> lowerBridge = new ArrayList<>(bridgeLength);

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void move(int bridgeLength, BridgeGame newGame) {
        allTryCount++;

        UpperBridge upperBridge = new UpperBridge("U");
        LowerBridge lowerBridge = new LowerBridge("D");

        while (newGame.bridge.size() <= bridgeLength - 1) {

            String userUpDown = InputView.readMoving();

            // check the result
            BridgeGameManager gameManager = new BridgeGameManager();
            boolean gameStatus = gameManager.inputChanger(userUpDown, newGame, upperBridge, lowerBridge);

            if (!gameStatus) {
                break;
            }

            // send the result to printMap in a form
            System.out.println();
        }
        // maybe can do overriding instead
        if (newGame.equals(BridgeMaker.bridgeStructure)) {
            finish(newGame, true);
        }

    }


    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void retry(BridgeGame newGame) {
        String retryOrNot = InputView.readGameCommand();
        InputRetryOrNot.getRetryOrNot(retryOrNot, newGame);
        // check using inputRetryOrnot

//        if(InputView.readGameCommand().equals()){
//        }
    }

    public void finish(BridgeGame newGame, Boolean successOrFail) {
        OutputView.printResult(newGame, successOrFail);
    }
}
