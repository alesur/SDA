package cleanCodeExercise;


import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.lang.Math;


public class Main {
    private static final String RESULTS_PATH = "C:/Users/ABC/Documents/Athlete_Results.csv";
    static SortedMap<String, Integer> points = new TreeMap<>(Collections.reverseOrder());
    static SortedMap<Integer, String> finalScore = new TreeMap<>();
    static Map<String, Integer> finalTime = new HashMap<String, Integer>();
    static List<String> names = new ArrayList<String>();
    static int maxPoints = 0;

    public static void main(String[] args) throws IOException {
        try (

                Reader reader = Files.newBufferedReader(Paths.get(RESULTS_PATH));
                Reader reader1 = Files.newBufferedReader(Paths.get(RESULTS_PATH));
                CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
                CSVParser csvParser1 = new CSVParser(reader1, CSVFormat.DEFAULT);) {
            int games = 0;
            for (CSVRecord csvRecord : csvParser1) {

                games++;
            }
            for (CSVRecord csvRecord : csvParser) {
                int totalScore = 0;
                String name = csvRecord.get(0);
                String victories = csvRecord.get(1);
                String swimTime = csvRecord.get(2);
                String knocking = csvRecord.get(3);
                String refusal = csvRecord.get(4);
                String disobedience = csvRecord.get(5);
                String score = csvRecord.get(6);
                String time = csvRecord.get(7);
                String[] parts = swimTime.split(":|\\.");

                int min = Integer.valueOf(parts[0]) * 600;
                int sec = Integer.valueOf(parts[1]) * 10;
                int milisec = Integer.valueOf(parts[2]);
                int time = min + sec + milisec;
                String[] parts1 = time.split(":|\\.");
                int min1 = Integer.valueOf(parts1[0]) * 600;
                int sec1 = Integer.valueOf(parts1[1]) * 10;
                int milisec1 = Integer.valueOf(parts1[2]);
                int time1 = min1 + sec1 + milisec1;
                int time = 1500;

                names.add(csvRecord.get(0));


                if (Integer.valueOf(score) >= 172) {
                    totalScore = 1000 + (Integer.valueOf(score) - 172) * 12;
                }
                if (Integer.valueOf(score) < 172) {
                    totalScore = 1000 - (Integer.valueOf(score) - 172) * 12;
                }
                if (Integer.valueOf(victories) >= Math.ceil(Integer.valueOf(games) * 0.7)) {
                    totalScore = (int) (totalScore + 1000 + (Integer.valueOf(victories) - Math.ceil(Integer.valueOf(games) * 0.7)) * 40);
                }
                if (Integer.valueOf(victories) < Math.ceil(Integer.valueOf(games) * 0.7)) {
                    totalScore = (int) (totalScore + 1000 - (Math.ceil(Integer.valueOf(games) * 0.7) - Integer.valueOf(victories)) * 40);
                }
                if (Integer.valueOf(time) <= time) {
                    totalScore = (int) (totalScore + 1000 + (time - Integer.valueOf(time)) * 4 / 3);
                }
                if (Integer.valueOf(time) > time) {
                    totalScore = (int) (totalScore + 1000 - (Integer.valueOf(time) - time) * 4 / 3);
                }

                totalScore = totalScore + 1200 - Integer.valueOf(knocking) * 28 - Integer.valueOf(refusal) * 40 - Integer.valueOf(disobedience) * 60;
                points.put(name, totalScore);
                finalPoint.put(name, time1);

                if (totalScore > makspoints) makspoints = totalScore;


                System.out.println("Competitor No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("Name : " + name);
                System.out.println("victories : " + victories);
                System.out.println("swimTime : " + swimTime);
                System.out.println("knocking : " + knocking);
                System.out.println("refusal : " + refusal);
                System.out.println("disobedience : " + disobedience);
                System.out.println("score : " + score);
                System.out.println("time : " + time);
                System.out.println("Total score : " + totalScore);
                System.out.println("---------------\n\n");
            }
        }
        int length = names.size() - 1;
        int i = 0;
        while (i != length) {
            int wow = finalPoint.get(names.get(i));
            int wow1 = points.get(names.get(i));
            if (wow1 < makspoints) {
                int minusas = makspoints - wow1; //pagal surinktus taskus prideda laiko
                int dabartinislaikas = wow + minusas;
                finalPoint.put(names.get(i), dabartinislaikas);
            }
            i++;

        }
        int b = 0;
        while (b != length) {
            String name = names.get(b);
            int time = finalPoint.get(names.get(b)); // sudaro laiko ir vardo lentele
            finalScore.put(time, name);
            b++;

        }
        int place = 1;
        while (finalScore.size() != 0) {
            int minute = Math.round(Integer.valueOf(finalScore.firstKey() / 600));
            int seconds = Math.round((Integer.valueOf(finalScore.firstKey()) - (minute * 600)) / 10);
            int milisecs = Integer.valueOf(finalScore.firstKey() - minute * 600 - seconds * 10);
            String time = minute + ":" + seconds + "." + milisecs;
            System.out.println("Vieta: " + place + " Vardas:  " + finalScore.remove(finalScore.firstKey()) + " Laikas: " + time);
            place++;

        }
    }
}