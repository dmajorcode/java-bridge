package bridge;

import java.util.Arrays;

public enum InputRetryOrNot {
    R,
    Q;


    public static void getRetryOrNot(BridgeGame newGame, UpperBridge upperBridge, LowerBridge lowerBridge){
        String retryOrNot = InputView.readGameCommand();
        if (retryOrNot.equals(String.valueOf(InputRetryOrNot.R))){
            BridgeGame retryGame = new BridgeGame();

            retryGame.move(Application.bridgeLength, retryGame);
            return;
        }
        BridgeGameManager.finish("실패",upperBridge,lowerBridge);
        return;
    }
}
