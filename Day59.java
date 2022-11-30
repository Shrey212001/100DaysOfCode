/*
Topic:- Java Reflection - Attributes

Link:- https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true

Problem:-

JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. 
For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

You have to print all the methods of another class called Student in alphabetical order.
The Student class looks like this:

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
    some more methods
    ......
}
You have to print all the methods of the student class in alphabetical order like this:

anothermethod
getName
setEmail
setId
......
......
some more methods
......
There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs.

Hint: See the oracle docs for more details about JAVA Reflection Methods and Fields


Solution:-
*/
public class Solution {

          public static void main(String[] args){
        Class student = new Student().getClass();
        Method[] methods = student.getDeclaredMethods();
        
        ArrayList<String> methodList = new ArrayList<>();
        for(Method method:methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

    }
