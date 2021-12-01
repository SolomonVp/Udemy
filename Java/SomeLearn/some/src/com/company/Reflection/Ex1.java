package com.company.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("com.company.Reflection.Employee");

// Другие способы создания объекта класса класс
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("-----------------------------------------------------------------------------------------");

        Field [] fields = employeeClass.getFields();
        for(Field field : fields) {
            System.out.println("Type of " + field.getName() + " + " + field.getType());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Field [] allfields = employeeClass.getDeclaredFields();
        for(Field field : allfields) {
            System.out.println("Type of " + field.getName() + " + " + field.getType());
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increadeSalary = " + someMethod1.getReturnType() + ", " + "parameterTypes = " + Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("-----------------------------------------------------------------------------------------");
        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() + ", " + "parameterTypes = " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("-----------------------------------------------------------------------------------------");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameterTypes = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("-----------------------------------------------------------------------------------------");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameterTypes = " + Arrays.toString(method.getParameterTypes()));
        }
    }
}
