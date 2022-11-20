package bridge;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        printAppInst();
        BridgeNumberGenerator generator = new BridgeRandomNumberGenerator();
        BridgeMaker newBridge = new BridgeMaker(generator);

        int bridgeLength = InputView.readBridgeSize();

        newBridge.makeBridge(bridgeLength);

        BridgeGame newGame = new BridgeGame();
        while (BridgeGame.bridge.size() < bridgeLength) {
            newGame.move(bridgeLength);
        }
    }

    public static void printAppInst() {
        System.out.println("다리 건너기 게임을 시작합니다.");
        System.out.println();
    }
}
