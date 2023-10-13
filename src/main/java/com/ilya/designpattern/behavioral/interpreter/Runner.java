package com.ilya.designpattern.behavioral.interpreter;

public class Runner {
    public static void main(String[] args) {
        Expression wife = getGoodWifeExpression();
        Expression girl = getGoodGirlExpression();
        System.out.println("A good wife should be kind and caring: "+wife.interpret("Kind and Caring"));
        System.out.println("A good girl should be attentive: "+girl.interpret("attentive"));
    }

    public static Expression getGoodWifeExpression(){
        Expression kinds = new TerminalExpression("Kind and");
        Expression caring = new TerminalExpression("Сaring");
        return new AndExpression(kinds,caring);
    }

    public static Expression getGoodGirlExpression(){
        Expression obedient = new TerminalExpression("obedient");
        Expression attentive = new TerminalExpression("attentive");
        return new OrExpression(attentive,obedient);
    }
}
