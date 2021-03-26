package ru.grigan.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.grigan.spring.rest.config.MyConfig;
import ru.grigan.spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployee = communication.getAllEmployee();
//        allEmployee.forEach(System.out::println);

//        Employee employee = communication.getEmployeeById(3);
//        System.out.println(employee);

//        Employee employee = new Employee("Gurgen", "Purgen", "HR", 500);
//        employee.setId(11);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(11);
    }
}
