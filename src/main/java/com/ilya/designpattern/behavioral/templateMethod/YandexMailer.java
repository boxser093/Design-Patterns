package com.ilya.designpattern.behavioral.templateMethod;

public class YandexMailer {
    public static void main(String[] args) {
        Addressee addressee = new Addressee("Emmy");
        Sender sender = new Sender("Petr");
        sender.setEnd("Lots of love,\n"+sender.getName());
        Mail mail = new Email(sender,addressee,"Hi my dear, I had a great summer. I'm all good.");
        mail.sendMail();
        System.out.println("________________________________________________________________________________");
        Sender sender1 = new Sender("Alfred");
        Mail mail1 = new Email(sender1,addressee,"Hi sister, I'm fine. Yesterday I was hunting and shot a huge deer, right with an arrow in the eye. Can you imagine?\n" +
                "Herald Hans asked about you, he's so pushy. He wants me to marry you.");
        sender1.setEnd("You lover brother.");
        mail1.sendMail();
    }
}
