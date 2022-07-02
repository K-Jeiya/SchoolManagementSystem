/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.sql.*;

/**
 *
 * @author owais
 */
public class DBsms {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    DBsms(){
    
  try{
        Class.forName("com.mysql.cj.jdbc.Driver");
  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","");
  st = con.createStatement();  //allow//
  
    }
  catch(Exception e)
  {
  
      System.out.println(e);
  }
    
}
    //For Login
     public ResultSet matchUserDetails(String user, String pass){
        String sql="SELECT * FROM `user_login` WHERE username='"+user+"' AND password='"+pass+"'";
                try{
                rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
    
     //For Teacher
        public ResultSet DisplayUsers(){
        String sql="SELECT * FROM `teacherdata`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
     public ResultSet Searchuser(String search){
        String sql="SELECT * FROM `teacherdata` WHERE Firstname='"+search+"' or Lastname='"+search+"' or Phone='"+search+"' or Email='"+search+"' or Degree='"+search+"' or Address='"+search+"' or Id='"+search+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
        
    public void teacheradd(String fn,String ln,String gender1,String phone,String email,String de,String add,String id){
     String sql="INSERT INTO `teacherdata`(`Firstname`, `Lastname`, `Gender`, `Phone`, `Email`, `Degree`, `Address`, `Id`) VALUES ('"+fn+"','"+ln+"','"+gender1+"','"+phone+"','"+email+"','"+de+"','"+add+"','"+id+"')";
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
  
   
     }
     public void updateRecord(String Firstname, String Lastname,String Gender, String Phone,String Email, String Degree, String Address,int Id){
        
        
        try {
            String sql="UPDATE `teacherdata` SET Firstname='"+Firstname+"',Lastname='"+Lastname+"',Gender='"+Gender+"',Phone='"+Phone+"',Email='"+Email+"',Degree='"+Degree+"',Address='"+Address+"' WHERE Id='"+Id+"'";
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     public void Deletedata(int Id){
        try {
            
            System.out.println("Removed"+Id);
            String sql="delete from teacherdata where Id='"+Id+"'";
            
            st.executeUpdate(sql);
             System.out.println("Removed"+Id);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     
     //For Student
      public ResultSet DisplayStudent(){
        String sql="SELECT * FROM `studentdata`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
     public ResultSet SearchStudent(String search1){
        String sql="SELECT * FROM `studentdata` WHERE Firstname='"+search1+"' or Lastname='"+search1+"' or Phone='"+search1+"' or Address='"+search1+"' or Class='"+search1+"' or Id='"+search1+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
        
    public void StudentAdd(String fn1,String ln1,String gender,String phone1,String add1,String class1,String id1){
     String sql="INSERT INTO `studentdata`(`Firstname`, `Lastname`, `Gender`,`Phone`,  `Address`, `Class`, `Id`) VALUES ('"+fn1+"','"+ln1+"','"+gender+"','"+phone1+"','"+add1+"','"+class1+"','"+id1+"')";
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
  
   
     }
     public void UpdateStudent(String Firstname, String Lastname,String Gender, String Phone, String Address, String Class, int Id){
        
        
        try {
            String sql="UPDATE `studentdata` SET Firstname='"+Firstname+"',Lastname='"+Lastname+"',Gender='"+Gender+"',Phone='"+Phone+"',Address='"+Address+"',Class='"+Class+"' WHERE Id='"+Id+"'";
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     public void DeleteStudent(int Id){
        try {
            
            System.out.println("Removed"+Id);
            String sql="delete from studentdata where Id='"+Id+"'";
            
            st.executeUpdate(sql);
             System.out.println("Removed"+Id);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
    

     // For Fee
     public ResultSet Displayfeerecord(){
        String sql="SELECT * FROM `feesubmitrecord`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
     public void FeeAdd(String date,String feeid,String feenm,String feeft,String value,String feephone,String feeadd,String convence,String feesch,String feebus,String submission){
     String sql="INSERT INTO `feesubmitrecord`(`Date`,`StdId`, `StdName`, `StdFname`, `Class`, `Phone`, `Address`, `Convence`, `SchoolFee`, `BusFee`, `Paid/Unpaid`) VALUES ('"+date+"','"+feeid+"','"+feenm+"','"+feeft+"','"+value+"','"+feephone+"','"+feeadd+"','"+convence+"','"+feesch+"','"+feebus+"','"+submission+"')"; 
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
     }
     
      public ResultSet Searchfee(String searchfee){
        String sql="SELECT * FROM `feesubmitrecord` WHERE StdId='"+searchfee+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
      
     public void FeeUpdate(String Date,int StdId,String StdName,String StdFname,String Class,int Phone,String Address,String Convence,String SchoolFee,String BusFee,String submission){
     String sql="UPDATE `feesubmitrecord` SET `StdName`='"+StdName+"',`StdFname`='"+StdFname+"',`Class`='"+Class+"',`Phone`='"+Phone+"',`Address`='"+Address+"',`Convence`='"+Convence+"',`SchoolFee`='"+SchoolFee+"',`BusFee`='"+BusFee+"',`Paid/Unpaid`='"+submission+"' WHERE `StdId`='"+StdId+"' and `Date`='"+Date+"'"; 
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
     }
     
      public void Deletefee(String Date,String StdId){
        try {
            
            String sql="delete from feesubmitrecord where  Date='"+Date+"' and StdId='"+StdId+"'";
            
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     
     //For Courses
     public ResultSet DisplayCourses(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
     public void CoursesAdd(String counm,String coucode,String bkprize,String couchoose,String bkcoudes){
     String sql="INSERT INTO `courses`(`CourseName`, `CourseCode`, `BookPrize`, `ForClass`, `Note`) VALUES ('"+counm+"','"+coucode+"','"+bkprize+"','"+couchoose+"','"+bkcoudes+"')";
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
     
     }
      public void UpdateCourses(String CourseName,String CourseCode,String BookPrize,String choosecouclasss,String Note){
        
        
        try {
            String sql="UPDATE `courses` SET CourseName='"+CourseName+"',BookPrize='"+BookPrize+"',ForClass='"+choosecouclasss+"',Note='"+Note+"' WHERE CourseCode='"+CourseCode+"'";
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
      public void DeleteCourse(String CourseCode){
        try {
            
            System.out.println("Removed"+CourseCode);
            String sql="delete from courses where CourseCode='"+CourseCode+"'";
            
            st.executeUpdate(sql);
             System.out.println("Removed"+CourseCode);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
      public ResultSet SearchCourse(String Searchbook){
        String sql="SELECT * FROM `courses` WHERE CourseName='"+Searchbook+"' or CourseCode='"+Searchbook+"' or BookPrize='"+Searchbook+"' or ForClass='"+Searchbook+"' or Note='"+Searchbook+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
            // For Course Assign
      public ResultSet teacherlinkid(){
        String sql="SELECT * FROM `teacherdata`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
      
      public ResultSet teacherlinkcombo(){
        String sql="SELECT * FROM `teacherdata`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet coucombo1(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet coucombo2(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet coucombo3(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet coucombo4(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet coucombo5(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
       public ResultSet DisplayCourseAssign(){
        String sql="SELECT * FROM `courseassign`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
       }
       
       public void couassadd(String chooseteaidd,String chooseteaa,int Couass,int rms,int total,String cou1,String cou2,String cou3,String cou4,String cou5){
       String sql="INSERT INTO `courseassign`(`TeacherId`,`Teachername`, `Coursesassign`, `Remainingslots`, `Totalassign`, `Cou1`, `Cou2`, `Cou3`, `Cou4`, `Cou5`) VALUES ('"+chooseteaidd+"','"+chooseteaa+"','"+Couass+"','"+rms+"','"+total+"','"+cou1+"','"+cou2+"','"+cou3+"','"+cou4+"','"+cou5+"')";
       try{
       st.executeUpdate(sql);
       }catch(Exception e){
           System.out.println(e);
       }
       }
       
       public void couassupdate(String TeacherId,String Teachername,int Coursesassign,int Remainingslots,int Totalassign,String cou1,String cou2,String cou3,String cou4,String cou5){
       String sql="UPDATE `courseassign` SET `Teachername`='"+Teachername+"',`Coursesassign`='"+Coursesassign+"',`Remainingslots`='"+Remainingslots+"',`Totalassign`='"+Totalassign+"',`Cou1`='"+cou1+"',`Cou2`='"+cou2+"',`Cou3`='"+cou3+"',`Cou4`='"+cou4+"',`Cou5`='"+cou5+"' WHERE `TeacherId`='"+TeacherId+"'";
       try{
       st.executeUpdate(sql);
       }catch(Exception e){
           System.out.println(e);
       }
       }
       
        public ResultSet SearchCourseAssign(String searchcouass){
        String sql="SELECT * FROM `courseassign` WHERE TeacherId='"+searchcouass+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
        
        public void DeleteCourseAssign(String TeacherId){
        try {
            String sql="delete from courseassign where TeacherId='"+TeacherId+"'";
            
            st.executeUpdate(sql);
    
        } catch (Exception e) {
            System.out.println(e);
        }
     }

      
     
       // For Classes
      
      public ResultSet teacherlinkclass(){
        String sql="SELECT * FROM `teacherdata`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
      
      public ResultSet courselinkclass(){
        String sql="SELECT * FROM `courses`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
      
      public ResultSet DisplayClass(){
        String sql="SELECT * FROM `classes`";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    }
      
      public void classadd(String choclasss,String classteachoo,String classdayy,String timeclasss,String classchosubb){
     String sql="INSERT INTO `classes`(`Class`, `Teachername`, `Day`, `Timing`, `Subject`) VALUES ('"+choclasss+"','"+classteachoo+"','"+classdayy+"','"+timeclasss+"','"+classchosubb+"')";
     try{
      st.executeUpdate(sql);
     }catch(SQLException e){
         System.out.println(e);
     }
      }
      public ResultSet SearchClass(String searchclass,String classday1){
        String sql="SELECT * FROM `classes` WHERE Class='"+searchclass+"' and Day='"+classday1+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
      
       public ResultSet SearchClasstable(String tc){
        String sql="SELECT * FROM `classes` WHERE Timing='"+tc+"'";
                try{
                    rs=st.executeQuery(sql);
                }catch(Exception e){
                    System.out.println(e);
                }
                return rs;
    } 
       
       public void updateclass(String Class,String Teachername,String Day,String Timing,String Subject){ 
        try {
            String sql="UPDATE `classes` SET Class='"+Class+"',Teachername='"+Teachername+"',Day='"+Day+"',Timing='"+Timing+"',Subject='"+Subject+"' WHERE Class='"+Class+"' and Teachername='"+Teachername+"'" ;
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
 
       public void Deleteclass(String Class,String Teachername){
        try {
            
            String sql="delete from classes where Class='"+Class+"' and Teachername='"+Teachername+"'";
            
            st.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
     }
    
   
}

