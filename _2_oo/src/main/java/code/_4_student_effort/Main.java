package code._4_student_effort;

import code._4_student_effort.animal_hierarchy.TestAnimals;
import code._4_student_effort.movie_database.Actor;
import code._4_student_effort.movie_database.Film;
import code._4_student_effort.movie_database.Premiu;
import code._4_student_effort.movie_database.Studio;
import code._4_student_effort.two_fighters_one_winner.BoxingMatch;

public class Main {

    public static void main(String[] args) {

        // Challenge 1
        System.out.println("\n\tThe winner is " + BoxingMatch.fight());

        // Challenge 2
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

        Film film1 = new Film("film cu actori de oscar", 1990, new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film("film cu actori fara premii2", 2010, new Actor[]{actorFaraPremii02, actorFaraPremii01, actorFaraPremii03});
        Film film3 = new Film("film cu actori fara premii3", 2010, new Actor[]{actorFaraPremii02, actorFaraPremii01, actorFaraPremii03});
        Film film4 = new Film("film cu actori de oscar", 2018, new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film("film cu actori fara premii5", 2018, new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        // Query no.1
        System.out.println();
        for (Studio studio : studioDatabase) {
            if (studio.getFilme().length > 2) {
                System.out.println("Studiourile care au publicat peste 2 filme sunt: " + studio.getNume());
            }
        }

        // Query no.2
        System.out.println();
        for (Studio studio : studioDatabase) {
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getNume().equals("actor cu 2 oscaruri")) {
                        System.out.println("Studiorile care au un actor cu 2 oscaruri sunt: " + studio.getNume());
                    }
                }
            }
        }

        // Query no.3
        System.out.println();
        for (Studio studio : studioDatabase) {
            StringBuilder filme = new StringBuilder();
            for (Film film : studio.getFilme()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getVarsta() > 50) {
                        filme.append(film.getNume() + ", ");
                    }
                }
            }
            System.out.println("Filmele in care joaca un actor de peste 50 de ani sunt: " + filme);
        }

        // Challenge 3
        System.out.println();
        TestAnimals testAnimals = new TestAnimals();
        testAnimals.cat.eat();
        testAnimals.cat.play();
        testAnimals.cat.walk();
        testAnimals.fish.eat();
        testAnimals.fish.walk();
        testAnimals.a.eat();
        testAnimals.a.walk();
        testAnimals.b.walk();
        testAnimals.b.eat();
        testAnimals.p.play();
    }
}
