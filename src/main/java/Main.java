import facade.BinOpsFacade;

public class Main {

    public static void main(String[] args) {
        BinOpsFacade binOpsFacade = new BinOpsFacade();
        try {
            System.out.println(binOpsFacade.sumAndMult("", "10"));
        } catch (NullPointerException e) {
            throw new RuntimeException("В аргументы метода передан null!");
        }
    }
}
