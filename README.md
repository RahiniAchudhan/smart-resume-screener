# Smart Resume Screening System 🎯

A Java console application that automatically screens resumes 
against a job description and ranks candidates by skill match score.

## Tech Stack
Java | OOP | Collections | File I/O | Layered Architecture

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
