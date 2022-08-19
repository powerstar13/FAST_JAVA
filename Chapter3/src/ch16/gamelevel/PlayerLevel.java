package ch16.gamelevel;

public abstract class PlayerLevel {

    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    /**
     * 템플릿 메서드(시나리오)
     * @param count: 횟수
     */
    final public void go(int count) {

        run(); // 달린다.

        for (int i = 0; i < count; i++) {
            jump(); // count 횟수 만큼 jump()한다.
        }

        turn(); // 턴 한다.
    }
}
