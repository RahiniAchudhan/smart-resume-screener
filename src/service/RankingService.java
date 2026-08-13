package service;

import model.Candidate;
import java.util.ArrayList;
import java.util.Collections;

public class RankingService {

    public static void rankCandidates(ArrayList<Candidate> candidates) {
        Collections.sort(candidates, (a, b) -> Double.compare(b.getScore(), a.getScore()));
    }
}