import java.util.ArrayList;

/**
 * Created by pauline on 21/02/17.
 */
public class Runner {

    static String activity = "Running";
    final static String favWeather = "sunny";
    char gender;
    String name;
    int age;
    ArrayList<Runner> team;

    Runner() {
        this.gender = 'u';
        this.name = "Unknown";
        this.age = 0;
    }

    Runner(char gender, String name, int age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    Runner(char gender, String name, int age, ArrayList<Runner> team) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void run() {
        System.out.println(this.name + " is running!");
    }

    public void runWithSomeone() {
        String name = "Someone";
        System.out.println(this.name + " and " + name + " are running");
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", " + this.gender + " butterfly";
    }

    public static void main(String[] args) {

        //Integer i = new Integer(0);
        Runner roger = new Runner('m', "Roger", 50);
        Runner mysteriousRunner = new Runner();
        ArrayList<Runner> daireTeam = new ArrayList<>();
        daireTeam.add(roger);
        daireTeam.add(mysteriousRunner);
        Runner daire = new Runner('m', "Daire", 32, daireTeam);

        System.out.println(daire.age);
        System.out.println(daire.name);
        System.out.println(daire.gender);
        System.out.println(roger.name);
        System.out.println(roger.age);
        System.out.println(mysteriousRunner.name);
        System.out.println(mysteriousRunner.age);
        System.out.println(mysteriousRunner.gender);
        System.out.println(mysteriousRunner.activity);
        roger.activity = "Super Running";
        System.out.println(daire.activity);

        daire.runWithSomeone();

        System.out.println(daire.team.toString());
        System.out.println(daire.favWeather);
        System.out.println(mysteriousRunner.favWeather);

        for (Runner pig: daireTeam) {
            System.out.println(pig);
        }
    }
}
