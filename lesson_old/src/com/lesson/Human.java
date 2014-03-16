package com.lesson;

/*
 4 type incapsulation:
    publi
     protected
    - default "package locale"
    private
 */

public class Human {

    private final int minAge = 0;

    private final int maxAge = 80;

    private final int minNameLenght = 2;

    private String name;

    private boolean age;

    public boolean getAge(){
        return age;
    }

    public void setAge(boolean newAge){

            age = newAge;

    }

    public String getName(){ //public <type> <name>(...) <??> {...}
        return name;
    }

    public void setName(String newName){
        if (newName != null && newName.length() > minNameLenght){
            name = newName;
        }
    }
}



/*
    1) return
    2) input values
    3) incap
    4) if
 */
