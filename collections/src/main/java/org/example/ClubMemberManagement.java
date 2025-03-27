package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClubMemberManagement {
        private static List<Club> members = new ArrayList<>();
        private static int memberIdCounter = 1;

        public static void addMember(String name) {
            members.add(new Club(memberIdCounter++, name));
            System.out.println(name + " has been added.");
        }

        public static void deleteMember(int id) {
            members.removeIf(member -> member.getId() == id);
            System.out.println("Member with ID " + id + " has been removed.");
        }

        public static void listMembers() {
            if (members.isEmpty()) {
                System.out.println("No registered members.");
            } else {
                members.forEach(System.out::println);
            }
        }

        public static void searchMember(String name) {
            for (Club member : members) {
                if (member.getName().equalsIgnoreCase(name)) {
                    System.out.println("Found: " + member);
                    return;
                }
            }
            System.out.println("Member not found.");
        }

        public static void updateMember(int id, String newName) {
            for (Club member : members) {
                if (member.getId() == id) {
                    member.setName(newName);
                    System.out.println("Member updated: " + member);
                    return;
                }
            }
            System.out.println("Member not found.");
        }

        public static void sortMembers() {
            members.sort(Comparator.comparing(Club::getName));
            System.out.println("Members sorted alphabetically.");
        }

        public static void main(String[] args) {
            addMember("Rahul");
            addMember("Bunny");
            addMember("Sunny");
            listMembers();
            deleteMember(2);
            listMembers();
            searchMember("Sunny");
            updateMember(1, "Rahul");
            listMembers();
            sortMembers();
            listMembers();
        }
    }
