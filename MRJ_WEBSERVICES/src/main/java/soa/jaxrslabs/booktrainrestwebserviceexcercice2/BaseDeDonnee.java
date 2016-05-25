/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soa.jaxrslabs.booktrainrestwebserviceexcercice2;

/**
 *
 * @author Rom1
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class BaseDeDonnee
{
   public static void main(String[] args)
    {
        try
        {
            System.out.println("TEST \n");
            String url = "jdbc:mysql://localhost/EpreuveTechHitema";
            String user = "root";
            String passwd = "root";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");         
         
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Train");
            ResultSetMetaData resultMeta = rs.getMetaData();

            while(rs.next())
            {         
            	for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + rs.getObject(i).toString() + "\t |");

            	System.out.println("\n");
            }

            rs.close();
            stmt.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        } 
    }
}
