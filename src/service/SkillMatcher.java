package service;

import java.util.ArrayList;

public class SkillMatcher {

    public double calculateScore(ArrayList<String> required, ArrayList<String> matched) {
        if (required.isEmpty()) return 0;
        return ((double) matched.size() / required.size()) * 100;
    }
}