package Recursion.Reverse;

import javax.sound.sampled.ReverbType;

class Sentence {
    String name;

    public Sentence() {
        name = "";
    }

    public Sentence(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void reverse() {
        if (name.length() == 0) {
            return;
        }
        String firstChar = name.substring(0, 1);
        String remainingText = name.substring(1);
        Sentence s = new Sentence(remainingText);
        s.reverse();
        name = s.getName() + firstChar;
    }
}
