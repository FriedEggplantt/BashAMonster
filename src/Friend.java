public class Friend {
    String name = "A friend";
    int hp = 100;
    boolean isFriend = true;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int hp, boolean isFriend) {
        this.name = name;
        this.hp = hp;
        this.isFriend = false;
    }

    public void hit(int damage) {
        this.hp = this.hp - damage;
    }
}
