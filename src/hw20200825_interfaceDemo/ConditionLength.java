package hw20200825_interfaceDemo;

public class ConditionLength implements Condition {
    @Override
    public boolean test(String str) {
        return (str != null && str.length() > 4);
    }
}
