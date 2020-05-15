package com.codegym.task.task21.task2107;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Deep cloning of a map

*/
public class Solution implements Cloneable{

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }
    public Solution (){}

    public Solution(Map<String, User> users) {
        this.users = users;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Map<String, User> usersClone = new LinkedHashMap();
        for (Map.Entry<String,User> a: users.entrySet())
            usersClone.put(new String(a.getKey()),(User)a.getValue().clone());
Solution cl = new Solution(usersClone);
return cl;
        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return Objects.equals(users, solution.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new User ( age, new String(name));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
