public class FabrykaButow {
    public enum FabrykaButow{
        Zimowe, Letnie
    }
    private FabrykaButow() {
    }

    public static Buty getButy(String typButow) {
        switch (typButow) {
            case "Zimowe":
                return new ZimoweButy(159.99, 36);
            case "Letnie":
                return new LetnieButy(79.99, 38);
            default:
                return null;
        }
    }

}