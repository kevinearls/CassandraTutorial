package main.java.com.kevinearls.cassandratutorial;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CreateEmployeeTable {
    public static void main(String args[]){

        //Query
        String query = "CREATE TABLE employee(employee_id int PRIMARY KEY, "
                + "employee_name text, "
                + "employee_city text, "
                + "employee_sal varint, "
                + "employee_phone varint );";

        //Creating Cluster object
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();

        //Creating Session object
        Session session = cluster.connect("tp");

        //Executing the query
        session.execute(query);

        System.out.println("Table created");
    }
}
