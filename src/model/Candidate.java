package model;

import java.util.ArrayList;

public class Candidate {

    private String name;
    private ArrayList<String> skills;
    private ArrayList<String> missingSkills;
    private double score;

    public Candidate(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
        this.missingSkills = new ArrayList<>();
    }

    public String getName() { return name; }

    public ArrayList<String> getSkills() { return skills; }
    public void setSkills(ArrayList<String> skills) { this.skills = skills; }

    public ArrayList<String> getMissingSkills() { return missingSkills; }
    public void setMissingSkills(ArrayList<String> missingSkills) { this.missingSkills = missingSkills; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }
}