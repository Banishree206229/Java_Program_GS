package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaEight{
        public static void main(String[] args){
List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> liNew = li.stream().filter(i -> i%2 != 0).toList(); // [1, 3, 5, 7, 9]
        Map<Boolean,List<Integer>> map = li.stream().collect(Collectors.partitioningBy(i -> i%2 != 0));
        //{false=[2, 4, 6, 8, 10], true=[1, 3, 5, 7, 9]}
        int sum = li.stream().collect(Collectors.summingInt(Integer::intValue)); //55
        int maxNum = li.stream().max(Integer::compare).get(); //10
        List<String> stringList = Arrays.asList("Apple","Banana","Avocado","Peach","Apricot","Berry");
        long count = stringList.stream().filter(s -> s.startsWith("A")).count(); //3
        Double average = li.stream().filter(i -> i%2 == 0).mapToInt(Integer::intValue).average().getAsDouble(); //6.0
        List<String> liUppperCase = stringList.stream().map(s -> s.toUpperCase()).toList(); //[APPLE, BANANA, AVOCADO, PEACH, APRICOT, BERRY]
        List<Integer> li1 = Arrays.asList(5,3,9,5,1,3,8);
        List<Integer> result = li1.stream().distinct().sorted().toList(); //[1, 3, 5, 8, 9]
        List<String> stList = Arrays.asList("applee","bat","batman","cherry","dog","elephant");//group string by length
        Map<Integer,List<String>> map1 = stList.stream().collect(Collectors.groupingBy(String::length)); //{3=[bat, dog], 5=[apple], 6=[batman, cherry], 8=[elephant]}
        //Convert all string to a single string with a space separating each word
        List<String> stList1 = Arrays.asList("Hello","World","Java","Stream");
        String stList2 = stList1.stream().collect(Collectors.joining(" ")); //Hello World Java Stream
        String stList3 = stList1.stream().collect(Collectors.joining(" ","[","]")); //[Hello World Java Stream]
        //Find the first element on basis of matching predicate (i.e word having more than 5 character)
        String str = stList.stream().filter(s -> s.length() > 5).findFirst().get(); //applee
        //Flatten the list and print all elements
        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("Apple", "Banana"), Arrays.asList("Orange", "Grape"), Arrays.asList("Peach", "Plum"));
        List<String> liii = listOfLists.stream().flatMap(List::stream).toList();//can use for each also//[Apple, Banana, Orange, Grape, Peach, Plum]
        //Create a new list where each integer is doubled
        li1.stream().map(i -> i*i).toList();
        //Find the 1st element devided by 3
        int i1 =  li.stream().filter(i -> i%3 == 0).findFirst().get();//3

       /* List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "HR", 5000.0), new Employee(2, "Bob", "IT", 7000.0), new Employee(3, "Charlie", "Finance", 6000.0),
                                                   new Employee(4, "David", "HR", 4000.0), new Employee(5, "Eve", "IT", 8000.0), new Employee(6, "Frank", "Finance", 5500.0));

        //Find the employee with the highest salary in each department.
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                .forEach((department,emp) -> {System.out.println(department +" : "+emp.map(e -> e.getName()).get());}); //Finance : Charlie, HR : Alice, IT : Eve

        //2nd highest salary
        double secHighestSal = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get().salary; //7000.0

        //Calculate the average salary of employees in the entire company.
        double avgSal = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary)).doubleValue(); //5916.666666666667

        //List the names of employees who earn above the average salary, sorted in descending order of their salaries.
        List<String> liss = employees.stream().filter(e -> e.getSalary()>avgSal).sorted(Comparator.comparingDouble(Employee::getSalary)).map(e -> e.getName()).toList(); //[Charlie, Bob, Eve]

       //Group employees by their departments.
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())))); //{Finance=[Charlie, Frank], HR=[Alice, David], IT=[Bob, Eve]}
    */
}
        }
//Collectors.averagingDouble(Employee::getSalary)
//Collectors.summingInt(Integer::intValue)
//Collectors.partitioningBy
//Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
// Collectors.mapping(Employee::getName, Collectors.toList()