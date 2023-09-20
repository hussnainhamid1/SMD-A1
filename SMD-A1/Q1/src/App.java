interface Cricketer {
    void print();
}

interface Batsman extends Cricketer {
    void print();
    void setRanking(int ranking);
    int getRanking();
}

interface Bowler extends Cricketer {
    void setRanking(int ranking);
    int getRanking();
}

interface AllRounder extends Batsman, Bowler {
    void print();
}

class CricketPlayer implements Cricketer {
    char name;
    int age;
    char nationality;

    @Override
    public void print() {
        System.out.println("Playing cricket...");
    }
}

class BatsmanImpl extends CricketPlayer implements Batsman {
    int score;
    int batsmanRanking;

    @Override
    public void print() {
        System.out.println("Batsman is batting...");
    }

    @Override
    public void setRanking(int ranking) {
        batsmanRanking = ranking;
    }

    @Override
    public int getRanking() {
        return batsmanRanking;
    }
}

class BowlerImpl extends CricketPlayer implements Bowler {
    int wickets;
    int bowlerRanking;

    @Override
    public void print() {
        System.out.println("Bowler is bowling...");
    }

    @Override
    public void setRanking(int ranking) {
        bowlerRanking = ranking;
    }

    @Override
    public int getRanking() {
        return bowlerRanking;
    }
}

class AllRounderImpl extends CricketPlayer implements AllRounder {
    int ranking;
    @Override
    public void setRanking(int allRounderRanking) {
        ranking = allRounderRanking;
    }

    @Override
    public int getRanking() {
        return ranking;
    }

    @Override
    public void print() {
        System.out.println("All-Rounder is doing all-rounder stuff...");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        AllRounder allRounder = new AllRounderImpl();
        allRounder.setRanking(123);
        System.out.print(allRounder.getRanking() );
        allRounder.print();
    }
}
