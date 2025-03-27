package org.example;
import java.util.*;
public class Club {
        private String name;
        private int id;

        public Club(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() { return id; }
        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name;
        }
    }

