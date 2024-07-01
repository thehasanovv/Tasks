package classtasks.happyfamily;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;

    private String surname;

    private int year;

    private int iq;

    private String[][] schedule;

    private Family family;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }



    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

//    void describePet() {
//        System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + ", he is " +
//                (getPet().getAge() > 50 ? "very sly" : "almost not sly")
//        );
//    }

//    void greetPet() {
//        System.out.println("Hello, " + this.pet.getNickname());
//    }

//    public void printInfo() {
//        System.out.println("Name: " + name);
//        System.out.println("Surname: " + surname);
//        System.out.println("Year of Birth: " + year);
//        System.out.println("IQ: " + iq);
//        System.out.println("Pet: " + (pet != null ? pet.getNickname() + " the " + pet.getSpecies() : "No pet"));
//        System.out.println("Mother: " + (mother != null ? mother.getName() + " " + mother.getSurname() : "Unknown"));
//        System.out.println("Father: " + (father != null ? father.getName() + " " + father.getSurname() : "Unknown"));
//        System.out.println("Schedule:");
//        logical();
//    }

//    private void logical() {
//        if (schedule != null) {
//            for (int i = 0; i < schedule.length; i++) {
//                System.out.println(DAYS_OF_WEEK[i] + ":");
//                for (String activity : schedule[i]) {
//                    System.out.println("  - " + activity);
//                }
//            }
//        } else {
//            System.out.println("No schedule");
//        }
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year
                && iq == human.iq
                && Objects.equals(name, human.name)
                && Objects.equals(surname, human.surname)
                && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
