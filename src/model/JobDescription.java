package model;

import java.util.ArrayList;

public class JobDescription {

    private ArrayList<String> skills;

    public JobDescription() {
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }
}