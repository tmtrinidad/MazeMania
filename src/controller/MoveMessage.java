package controller;

public class MoveMessage implements Message {
    int keyCode;

    /**
     * Creates a move message
     *
     * @param keyCode the key code
     */
    public MoveMessage(int keyCode) {
        this.keyCode = keyCode;
    }
}
