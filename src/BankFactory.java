public class BankFactory {
    public BankFactory() {}
    public static Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBank:
                return new TPBank();
        }
    }
}
