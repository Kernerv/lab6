import java.util.*;

public class ListDemo {
    //TASK2
    public static ArrayList<Human> getPeopleWithSameSurname(ArrayList<Human> people, Human specPerson) {
        ArrayList<Human> result = new ArrayList<>(people.size());
        String specPersonsSurname = specPerson.getSurname();

        for (Human h : people) {
            if (h.getSurname().equals(specPersonsSurname)) {
                result.add(h);
            }
        }

        return result;
    }
    //TASK3
    public static ArrayList<Human> removeSpecifiedPerson(ArrayList<Human> people, Human specPerson) {
        ArrayList<Human> result = new ArrayList<>();
        for(Human h: people){
            if(!h.equals(specPerson)){
                result.add(new Human(h));
            }
        }
        return result;
    }
    //TASK4
    public static  List<Set<Integer>> getSetsWithoutIntersectionWith( List<Set<Integer>> sets, Set<Integer> set){
        List<Set<Integer>> result = new ArrayList<Set<Integer>>();
        for(Set<Integer> item: sets){
            if(Collections.disjoint(item, set))  result.add(item);
        }
        return result;
    }
    //TASK5
    public static <T extends Human> ArrayList<T> peopleWithMaxAge(ArrayList<T> humans) {
        ArrayList<T> result = new ArrayList<T>();
        int maxAge = -1;
        for(Human item: humans){
            if(item.getAge()>=maxAge) maxAge = item.getAge();
        }
        for(T item: humans){
            if(item.getAge()==maxAge) result.add(item);
        }
        return result;
    }
    //TASK7
    public static ArrayList<Human> findPeopleByID(Map<Integer, Human> map, Set<Integer> set) {
        ArrayList<Human> result = new ArrayList<>();
        for(Integer i: map.keySet()){
            if(set.contains(i)){
                result.add(map.get(i));
            }
        }
        return result;
    }
    //TASK8
    public static ArrayList<Integer> getAdultsIDs(Map<Integer, Human> map) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Human> e : map.entrySet()){
            if(e.getValue().getAge()>=18) result.add(e.getKey());
        }
        return result;
    }
    //TASK9
    public static Map<Integer, Integer> IDsToAges(Map<Integer, Human> map){
        Map<Integer, Integer> result = new HashMap<>();
        for(Map.Entry<Integer, Human> e : map.entrySet()){
            result.put(e.getKey(), e.getValue().getAge());
        }
        return result;
    }
    //TASK10
    public static Map<Integer,List<Human>> agesToPeople(Set<Human> map){
        Map<Integer, List<Human>> result = new LinkedHashMap<Integer, List<Human>>();
        for (Human h: map){
            if(result.containsKey(h.getAge())){
                result.get(h.getAge()).add(h);
            }else {
                result.put(h.getAge(), new ArrayList<Human>(Collections.singletonList(h)));
            }
        }
        return result;
    }

}

