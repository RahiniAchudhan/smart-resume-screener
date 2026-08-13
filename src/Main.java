import model.Candidate;
import model.JobDescription;
import service.RankingService;
import service.ResumeParser;
import service.SkillMatcher;
import util.FileReaderUtil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println(" Smart Resume Screening System");
        System.out.println("==============================");

        try {
            // Step 1: Read and validate job description
            String jobText = FileReaderUtil.readFile("resources/job.txt");

            if (jobText == null || jobText.trim().isEmpty()) {
                System.out.println("Error: Job description is empty.");
                return;
            }

            // Step 2: Extract required skills dynamically from job.txt
            ArrayList<String> requiredSkills = new ResumeParser().extractSkillsList(jobText);

            // Step 3: Build JobDescription object
            JobDescription jd = new JobDescription();
            for (String skill : requiredSkills) {
                jd.addSkill(skill);
            }

            System.out.println("\nRequired Skills : " + jd.getSkills());

            // Step 4: Process each resume
            String[] resumeFiles = {"rahul.txt", "arun.txt", "priya.txt"};
            ArrayList<Candidate> candidates = new ArrayList<>();

            for (String file : resumeFiles) {
                String resume = FileReaderUtil.readFile("resources/resumes/" + file);

                Candidate candidate = new Candidate(file.replace(".txt", ""));

                ArrayList<String> matchedSkills = new ResumeParser().findSkills(resume, jd.getSkills());
                candidate.setSkills(matchedSkills);

                ArrayList<String> missingSkills = new ResumeParser().findMissingSkills(jd.getSkills(), matchedSkills);
                candidate.setMissingSkills(missingSkills);

                double score = new SkillMatcher().calculateScore(jd.getSkills(), matchedSkills);
                candidate.setScore(score);

                candidates.add(candidate);
            }

            // Step 5: Rank and display results
            RankingService.rankCandidates(candidates);

            System.out.println("\nCandidate Ranking");
            System.out.println("------------------");

            for (Candidate c : candidates) {
                System.out.printf("%s : %.1f%%%n", c.getName(), c.getScore());
                System.out.println("  Matched : " + c.getSkills());
                System.out.println("  Missing : " + c.getMissingSkills());
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}