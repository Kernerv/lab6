import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListDemoTest {


    @org.junit.jupiter.api.Test
    void getPeopleWithSameSurname() {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Дмитрий", "Николаевич", "Иванов", 12));
        people.add( new Human("Игорь", "Николаевич", "Петроа", 12));
        people.add( new Human("Алеша", "Николаевич", "Иванов", 12));
        people.add( new Human("Валя", "Николаевич", "НеИванов", 12));
        Human h = new Human("Костя", "Николаевич", "Иванов", 12);

        ArrayList<Human> rez = new ArrayList<>();
        rez.add( new Human("Дмитрий", "Николаевич", "Иванов", 12));
        rez.add(new Human("Алеша", "Николаевич", "Иванов", 12));
        assertEquals(ListDemo.getPeopleWithSameSurname(people, h), rez);
    }

    @org.junit.jupiter.api.Test
    void removeSpecifiedPerson() {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Дмитрий", "Николаевич", "Иванов", 12));
        people.add(new Human("Игорь", "Николаевич", "Петроа", 12));
        people.add(new Human("Алеша", "Николаевич", "Иванов", 12));
        people.add( new Human("Валя", "Николаевич", "НеИванов", 12));
        Human h = new Human("Валя", "Николаевич", "НеИванов", 12);

        ArrayList<Human> rez = new ArrayList<>();
        rez.add(new Human("Дмитрий", "Николаевич", "Иванов", 12));
        rez.add( new Human("Игорь", "Николаевич", "Петроа", 12));
        rez.add( new Human("Алеша", "Николаевич", "Иванов", 12));

        List<Human> f = ListDemo.removeSpecifiedPerson(people, h);

        assertEquals(f, rez);

        people.get(0).setAge(100);
        assertNotEquals(people.get(0).getAge(), f.get(0).getAge());
    }

    @org.junit.jupiter.api.Test
    void getSetsWithoutIntersectionWith() {
        Set<Integer> set1 = new TreeSet<>();
        for (int i=1; i<15; i++){
            set1.add(i);
        }
        Set<Integer> set2 = new TreeSet<>();
        for (int i=16; i<30; i++){
            set2.add(i);
        }
        Set<Integer> set3 = new TreeSet<>();
        for (int i=31; i<35; i++){
            set3.add(i);
        }
        List<Set<Integer>> sets = new ArrayList<Set<Integer>>();
        sets.add(set1); sets.add(set2); sets.add(set3);

        Set<Integer> setcheck = new TreeSet<>();//набор чисел
        for (int i=27; i<39; i++){
            setcheck.add(i);
        }

        List<Set<Integer>> setschecksList = new ArrayList<Set<Integer>>();
        setschecksList.add(set1); //sets.add(set3);
        assertEquals(ListDemo.getSetsWithoutIntersectionWith(sets, setcheck), setschecksList);

    }

    @org.junit.jupiter.api.Test
    void peopleWithMaxAge() {
        ArrayList<Human> people = new ArrayList<>();
        people.add(new Human("Дмитрий", "Николаевич", "Иванов", 15));
        people.add(new Human("Игорь", "Николаевич", "Петроа", 17));
        people.add(new Human("Алеша", "Николаевич", "Иванов", 14));
        people.add(new Student("Валя", "Николаевич", "НеИванов", 17, "imit"));

        ArrayList<Human> check = new ArrayList<>();
        check.add(new Human("Игорь", "Николаевич", "Петроа", 17));
        check.add(new Student("Валя", "Николаевич", "НеИванов", 17, "imit"));
        assertEquals(ListDemo.peopleWithMaxAge(people), check);
    }

    @org.junit.jupiter.api.Test
    void findPeopleByID() {
        Map<Integer, Human> map;
        map = new HashMap<Integer, Human>();
        map.put(1, new Human("Дмитрий", "Николаевич", "Иванов", 15));
        map.put(2, new Human("Дмитрий", "Николаевич", "Иванов", 15));
        map.put(3, new Human("Дмитрий", "Николаевич", "Иванов", 15));
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);

        ArrayList<Human> result = new ArrayList<>();
        result.add(new Human("Дмитрий", "Николаевич", "Иванов", 15));
        result.add(new Human("Дмитрий", "Николаевич", "Иванов", 15));

        assertEquals(ListDemo.findPeopleByID(map, set), result);
    }

    @org.junit.jupiter.api.Test
    void getAdultsIDs() {
        Map<Integer, Human> map;
        map = new HashMap<Integer, Human>();
        map.put(1, new Human("Дмитрий", "Николаевич", "Иванов", 25));
        map.put(2, new Human("Дмитрий", "Николаевич", "Иванов", 17));
        map.put(3, new Human("Дмитрий", "Николаевич", "Иванов", 147));
        map.put(4, new Human("Дмитрий", "Николаевич", "Иванов", 27));

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(4);


        assertEquals(ListDemo.getAdultsIDs(map), result);
    }

    @org.junit.jupiter.api.Test
    void IDsToAges() {
        Map<Integer, Human> map;
        map = new HashMap<Integer, Human>();
        map.put(1, new Human("Дмитрий", "Николаевич", "Иванов", 25));
        map.put(2, new Human("Дмитрий", "Николаевич", "Иванов", 17));
        map.put(3, new Human("Дмитрий", "Николаевич", "Иванов", 135));
        map.put(4, new Human("Дмитрий", "Николаевич", "Иванов", 27));

        Map<Integer, Integer> result;
        result = new HashMap<Integer, Integer>();
        result.put(1,25);
        result.put(2,17);
        result.put(3,135);
        result.put(4,27);


        assertEquals(ListDemo.IDsToAges(map), result);
    }

    @org.junit.jupiter.api.Test
    void agesToPeople() {
        Set<Human> map = new LinkedHashSet<>(Arrays.asList(
                new Human("u1", "Николаевич", "Иванов", 25),
                new Human("u2", "Николаевич", "Иванов", 17),
                new Human("u3", "Николаевич", "Иванов", 135),
                new Human("u4", "Николаевич", "Иванов", 25)
        ));


        Map<Integer, List<Human>> result = new HashMap<>();
        result.put(25, new ArrayList<>(Arrays.asList(
                new Human("u1", "Николаевич", "Иванов", 25),
                new Human("u4", "Николаевич", "Иванов", 25)
        )));

        result.put(17, new ArrayList<>(Arrays.asList(
                new Human("u2", "Николаевич", "Иванов",17)
        )));

        result.put(135, new ArrayList<>(Collections.singletonList(new Human("u3", "Николаевич", "Иванов", 135))));
        assertEquals(result, ListDemo.agesToPeople(map));
    }
}