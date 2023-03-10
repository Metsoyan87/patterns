package patterns.BehavioralDesignPatterns.interpreterPatternExample1;

public class SubtractionExpression implements Expression {

    private Expression num1;
    private Expression num2;

    public SubtractionExpression(Expression num1, Expression num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int interpret() {
        return num1.interpret() - num2.interpret();
    }
}
