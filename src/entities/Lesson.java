package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Lesson {
    protected String title;

    public Lesson(String title) {
        this.title = title;
    }

    public abstract int duration();
}

