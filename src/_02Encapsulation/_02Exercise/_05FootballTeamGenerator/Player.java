package _02Encapsulation._02Exercise._05FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalStateException("A name should not be empty.");
        }

        this.name = name;
    }

    private void setEndurance(int endurance) {
        ensurePlayerStats(endurance, "Endurance");

        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        ensurePlayerStats(sprint, "Sprint");

        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        ensurePlayerStats(dribble, "Dribble");

        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        ensurePlayerStats(passing, "Passing");

        this.passing = passing;
    }

    private void setShooting(int shooting) {
        ensurePlayerStats(shooting, "Shooting");

        this.shooting = shooting;
    }

    private void ensurePlayerStats(int stat, String statName) {
        if(stat < 0 || stat > 100) {
            throw new IllegalStateException(String.format("%s should be between 0 and 100.", statName));
        }
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }
}
