package com.jdbc.project;
import java.sql.*;

public class SampleClass 
{
    public static void main(String args[]) throws SQLException 
      {
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	try
	  {
 
	           myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarys", "root" , "");
	           myStmt = myConn.createStatement();
                            myRs = myStmt.executeQuery("select * from book");
                            while (myRs.next()) 
	              {
	                  System.out.println(myRs.getString("Acc_no") + ", " + myRs.getString("Title") + ", " + myRs.getString("Author") + ", " + myRs.getString("Publisher")+ ", " + 
myRs.getString("Edition"));

	              }
                     }
	catch (Exception exc) 
	{
	         exc.printStackTrace();
	}
	finally
	 {
	         myRs.close();
                          myStmt.close();
                          myConn.close();
                   }
       }
}