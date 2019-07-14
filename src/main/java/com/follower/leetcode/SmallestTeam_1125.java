package com.follower.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by lin on 19-7-14.
 */
public class SmallestTeam_1125 {

    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        if (req_skills.length == 0) {
            return new int[]{};
        }

        Queue<IndexPerson> queue = new PriorityQueue<>((o1, o2) -> o2.skills.size() - o1.skills.size());
        Set<String> reqSkillSet = new HashSet<>(Arrays.asList(req_skills));
        for (int i = 0; i < people.size(); i ++) {
            IndexPerson person = new IndexPerson();
            person.index = i;
            person.skills = containsElement(people.get(i), reqSkillSet);
            queue.add(person);
        }

        List<Integer> resList = new ArrayList<>();

        while (!reqSkillSet.isEmpty()) {
            IndexPerson person = queue.remove();
            resList.add(person.index);
            removeElements(reqSkillSet, person.skills);
            Queue<IndexPerson> newQueue = new PriorityQueue<>((o1, o2) -> o2.skills.size() - o1.skills.size());
            newQueue.addAll(queue.stream().map(indexPerson -> {
                        IndexPerson newPerson = new IndexPerson();
                        newPerson.index = person.index;
                        newPerson.skills = containsElement(indexPerson.skills, reqSkillSet);
                        return newPerson;
                    }
            ).collect(Collectors.toList()));
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i ++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    private List<String> containsElement(List<String> skills, Set<String> reqSkillSet) {
        List<String> res = new ArrayList<>();
        for (String skill: reqSkillSet) {
            if (skills.contains(skill)) {
                res.add(skill);
            }
        }
        return res;
    }

    private void removeElements(Set<String> reqSkillSet, List<String> skills) {
        for (String i: skills) {
            if (reqSkillSet.contains(i)) {
                reqSkillSet.remove(i);
            }
        }
    }

    static class IndexPerson {
        List<String> skills;
        int index;
    }
}
