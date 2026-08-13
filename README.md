# Smart Resume Screening System 🎯

A Java console application that automatically screens resumes 
against a job description and ranks candidates by skill match score.

## 🛠️ Tech Stack
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-007396?style=for-the-badge&logo=java&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

## Features
- Parses job description dynamically (no hardcoded skills)
- Matches candidate skills against requirements
- Shows matched and missing skills per candidate
- Ranks all candidates from highest to lowest score

## Project Structure
```
src/
├── Main.java
├── model/
│   ├── Candidate.java
│   └── JobDescription.java
├── service/
│   ├── ResumeParser.java
│   ├── SkillMatcher.java
│   └── RankingService.java
└── util/
    └── FileReaderUtil.java
```

## Sample Output
```
Rahul : 100.0%
  Matched : [Java, SQL, Spring Boot, React, HTML, CSS]
  Missing : []

Arun : 50.0%
  Matched : [Java, SQL, HTML]
  Missing : [Spring Boot, React, CSS]
```
