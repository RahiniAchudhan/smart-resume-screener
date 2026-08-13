package service;

import java.util.ArrayList;

public class ResumeParser {

    // Dynamically parses skills listed after "Required Skills:" in job.txt
    public ArrayList<String> extractSkillsList(String text) {
        ArrayList<String> skills = new ArrayList<>();
        String[] lines = text.split("\n");
        boolean reading = false;

        for (String line : lines) {
            line = line.trim();
            if (line.equalsIgnoreCase("Required Skills:")) {
                reading = true;
                continue;
            }
            if (reading && !line.isEmpty()) {
                skills.add(line);
            }
        }
        return skills;
    }

    // Returns skills from the required list that exist in the resume
    public ArrayList<String> findSkills(String resume, ArrayList<String> required) {
        ArrayList<String> matched = new ArrayList<>();
        for (String skill : required) {
            if (resume.toLowerCase().contains(skill.toLowerCase())) {
                matched.add(skill);
            }
        }
        return matched;
    }

    // Returns required skills missing from the candidate resume
    public ArrayList<String> findMissingSkills(ArrayList<String> required, ArrayList<String> matched) {
        ArrayList<String> missing = new ArrayList<>();
        for (String skill : required) {
            if (!matched.contains(skill)) {
                missing.add(skill);
            }
        }
        return missing;
    }
}