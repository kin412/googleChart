package org.kin.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class test {
	
	@Autowired
    private DataSource ds;
 
    @Test
    public void test() throws Exception{
    	System.out.println("test");
        try(Connection conn = ds.getConnection()){
            System.out.println(conn);
            System.out.println("try");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("catch");
        }
    }
	
}
