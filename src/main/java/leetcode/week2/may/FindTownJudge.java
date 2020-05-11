package leetcode.week2.may;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

// pending...
//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/
public class FindTownJudge {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.findJudge(3, new int[][]{{1,3}, {2,3}});
        assertThat(result, is(3));
    }
}

class Solution {

    public int findJudge(int N, int[][] trust) {
        Town town = new Town();
        Arrays.stream(trust).forEach( (e) -> {
            Person person = new Person(e[0]);
            person.addNextNodes(new Person(e[1]));
            town.addPerson(e[0], person);
        });
        return town.findTownJudge();
    }

}

class Town {
    Map<Integer, Person> people = new HashMap<>();

    public void addPerson(int i, Person person) {
        if(people.containsKey(i)) {
            people.get(i).getNextTrusts().add(person);
        } else {
            people.put(i, person);
        }
    }

    public int findTownJudge() {
        Map.Entry<Integer, Person> result = people
                .entrySet()
                .stream()
                .filter(e -> e.getValue().getNextTrusts().isEmpty())
                .findFirst().orElse(null);

        return result == null ? -1 : result.getKey();
    }
}

class Person {
    int name;
    List<Person> nextTrusts = new ArrayList<>();

    public Person(int name) {
        this.name = name;
    }

    public void addNextNodes(Person person) {
        nextTrusts.add(person);
    }

    public List<Person> getNextTrusts() {
        return nextTrusts;
    }
}