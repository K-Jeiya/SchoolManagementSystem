/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;


import java.awt.Color;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author owais
 */
public class Dashboard extends javax.swing.JFrame {
    Color DefaultColor,ClickedColor;
    
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskBarSize = scnMax.bottom;
        
        this.setSize(xsize,ysize);
         DefaultColor= new Color(13,36,51);
        ClickedColor= new Color(240,151,57);
        
        Home.setBackground(DefaultColor);  
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);

        
        
        // Display table for teacher
        DBsms db=new DBsms();
        ResultSet rs=db.DisplayUsers();
        DefaultTableModel tb=(DefaultTableModel)Table1.getModel();
        
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Gender"),rs.getString("Phone"),rs.getString("Email"),rs.getString("Degree"),rs.getString("Address"),rs.getString("Id")};
        tb.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        //for student 
        DBsms db1=new DBsms();
        ResultSet rs1=db1.DisplayStudent();
        DefaultTableModel tb1=(DefaultTableModel)Table2.getModel();
        
        try{
        while(rs1.next()){
        String []data={rs1.getString("Firstname"),rs1.getString("Lastname") , rs1.getString("Gender"),rs1.getString("Phone"),rs1.getString("Address"),rs1.getString("Class"),rs1.getString("Id")};
        tb1.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        //For courses
        DBsms db2=new DBsms();
        ResultSet rs2=db2.DisplayCourses();
        DefaultTableModel tb2=(DefaultTableModel)Tablecou3.getModel();
        
        try{
        while(rs2.next()){
        String []data={rs2.getString("CourseName"),rs2.getString("CourseCode"),rs2.getString("BookPrize"),rs2.getString("ForClass"),rs2.getString("Note")};
        tb2.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        // For Courses assign
        DBsms db3=new DBsms();
        ResultSet rs3=db3.DisplayCourseAssign();
        DefaultTableModel tb3=(DefaultTableModel)Tablecouass.getModel();
        
        try{
        while(rs3.next()){
        String []data={rs3.getString("TeacherId"),rs3.getString("Teachername"),rs3.getString("Coursesassign"),rs3.getString("Remainingslots"),rs3.getString("Totalassign")};
        tb3.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        //////////////////////////////////
        DBsms dbb6=new DBsms();
        ResultSet rss6=dbb6.teacherlinkcombo();
        try{
        while(rss6.next()){
        chooseteaid.addItem(rss6.getString("Id"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        DBsms dbb=new DBsms();
        ResultSet rss=dbb.teacherlinkcombo();
        try{
        while(rss.next()){
        choosetea.addItem(rss.getString("Firstname"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        ResultSet rss1=dbb.coucombo1();
        try{
           
        while(rss1.next()){
        couselect1.addItem(rss1.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        ResultSet rss2=dbb.coucombo1();
        try{
        while(rss2.next()){
        couselect2.addItem(rss2.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        }

        ResultSet rss3=dbb.coucombo1();
        try{
        while(rss3.next()){
        couselect3.addItem(rss3.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        ResultSet rss4=dbb.coucombo1();
        try{
        while(rss4.next()){
        couselect4.addItem(rss4.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        ResultSet rss5=dbb.coucombo1();
        try{
        while(rss5.next()){
        couselect5.addItem(rss5.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        //for classses
        DBsms dbc=new DBsms();
        ResultSet rsc=dbc.DisplayClass();
        DefaultTableModel tbc=(DefaultTableModel)Tableclass.getModel();
        
        try{
        while(rsc.next()){
        String []data={rsc.getString("Class"),rsc.getString("Teachername"),rsc.getString("Day"),rsc.getString("Timing"),rsc.getString("Subject")};
        tbc.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        DBsms db4=new DBsms();
        ResultSet rs4=db4.teacherlinkclass();
        try{
        while(rs4.next()){
        classteacho.addItem(rs4.getString("Firstname"));
        }
        }catch(Exception e){
            System.out.println(e);
        } 
        
        DBsms dbc4=new DBsms();
        ResultSet rsc4=dbc4.courselinkclass();
        try{
        while(rsc4.next()){
        classchosub.addItem(rsc4.getString("CourseName"));
        }
        }catch(Exception e){
            System.out.println(e);
        } 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        teachers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        students = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fee = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        classs = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        course = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        courseassign = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jlabell = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        manu = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TabbedPanel = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        teachersdata = new javax.swing.JPanel();
        setmenu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        ln = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        de = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        insertdatat = new javax.swing.JButton();
        updatedata = new javax.swing.JButton();
        Deletedata = new javax.swing.JButton();
        resetteacherbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        searchdata = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        studentsdata = new javax.swing.JPanel();
        male1 = new javax.swing.JRadioButton();
        female1 = new javax.swing.JRadioButton();
        ln1 = new javax.swing.JTextField();
        phone1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fn1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        add1 = new javax.swing.JTextField();
        class1 = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        insertstudent = new javax.swing.JButton();
        updatestudent = new javax.swing.JButton();
        Deletestudent = new javax.swing.JButton();
        resetstudent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        searchstudent = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        feee = new javax.swing.JPanel();
        feenm = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        feeid = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        feeft = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        choose = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        feeadd = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        feephone = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        bus = new javax.swing.JRadioButton();
        per = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        feearea = new javax.swing.JTextArea();
        genfee = new javax.swing.JButton();
        resetfee = new javax.swing.JButton();
        Printfee = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        feesch = new javax.swing.JComboBox<>();
        feebus = new javax.swing.JComboBox<>();
        paid = new javax.swing.JRadioButton();
        unpaid = new javax.swing.JRadioButton();
        addfee = new javax.swing.JButton();
        viewrecord = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        classes = new javax.swing.JPanel();
        choclass = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        classteacho = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        timeclass = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        classday = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        classchosub = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        Tableclass = new javax.swing.JTable();
        insertclass = new javax.swing.JButton();
        updateclass = new javax.swing.JButton();
        deleteclass = new javax.swing.JButton();
        resetclass = new javax.swing.JButton();
        searchclasss = new javax.swing.JButton();
        searchclass = new javax.swing.JTextField();
        classday1 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        Courses = new javax.swing.JPanel();
        coucode = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        counm = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bkcoudes = new javax.swing.JTextArea();
        choosecouclass = new javax.swing.JComboBox<>();
        bkprize = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tablecou3 = new javax.swing.JTable();
        InsertCourse = new javax.swing.JButton();
        DeleteCourse = new javax.swing.JButton();
        ResetCourse = new javax.swing.JButton();
        UpdateCourses = new javax.swing.JButton();
        searchbook = new javax.swing.JButton();
        Searchbook = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        CoursesAssign = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        choosetea = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        couselect1 = new javax.swing.JComboBox<>();
        couselect2 = new javax.swing.JComboBox<>();
        couselect3 = new javax.swing.JComboBox<>();
        couselect4 = new javax.swing.JComboBox<>();
        couselect5 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tablecouass = new javax.swing.JTable();
        submitcouassign = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        chooseteaid = new javax.swing.JComboBox<>();
        Searchcouass = new javax.swing.JButton();
        searchcouass = new javax.swing.JTextField();
        updatecouass = new javax.swing.JButton();
        Deletecouass = new javax.swing.JButton();
        resetcouass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        teachers.setBackground(new java.awt.Color(0, 0, 0));
        teachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teachersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teachersMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teachers");

        javax.swing.GroupLayout teachersLayout = new javax.swing.GroupLayout(teachers);
        teachers.setLayout(teachersLayout);
        teachersLayout.setHorizontalGroup(
            teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teachersLayout.setVerticalGroup(
            teachersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        students.setBackground(new java.awt.Color(0, 0, 0));
        students.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentsMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Students");

        javax.swing.GroupLayout studentsLayout = new javax.swing.GroupLayout(students);
        students.setLayout(studentsLayout);
        studentsLayout.setHorizontalGroup(
            studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentsLayout.setVerticalGroup(
            studentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        fee.setBackground(new java.awt.Color(0, 0, 0));
        fee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                feeMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fee Submission");

        javax.swing.GroupLayout feeLayout = new javax.swing.GroupLayout(fee);
        fee.setLayout(feeLayout);
        feeLayout.setHorizontalGroup(
            feeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        feeLayout.setVerticalGroup(
            feeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        classs.setBackground(new java.awt.Color(0, 0, 0));
        classs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                classsMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Class");

        javax.swing.GroupLayout classsLayout = new javax.swing.GroupLayout(classs);
        classs.setLayout(classsLayout);
        classsLayout.setHorizontalGroup(
            classsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        classsLayout.setVerticalGroup(
            classsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        course.setBackground(new java.awt.Color(0, 0, 0));
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                courseMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Courses");

        javax.swing.GroupLayout courseLayout = new javax.swing.GroupLayout(course);
        course.setLayout(courseLayout);
        courseLayout.setHorizontalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        courseLayout.setVerticalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        courseassign.setBackground(new java.awt.Color(0, 0, 0));
        courseassign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseassignMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                courseassignMousePressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Courses Assign");

        javax.swing.GroupLayout courseassignLayout = new javax.swing.GroupLayout(courseassign);
        courseassign.setLayout(courseassignLayout);
        courseassignLayout.setHorizontalGroup(
            courseassignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        courseassignLayout.setVerticalGroup(
            courseassignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });

        jlabell.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        jlabell.setForeground(new java.awt.Color(255, 255, 255));
        jlabell.setText("Home");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jlabell, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(students, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(classs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(course, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(courseassign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(classs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseassign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 760));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        manu.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        manu.setForeground(new java.awt.Color(255, 255, 255));
        manu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manu.setText("Home");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/smslogo.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("SCHOOL MANAGEMENT SYSTEM");

        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/loginlogo.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(manu, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel27)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel27)))
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 120));

        home.setBackground(new java.awt.Color(204, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/studentlogo.png"))); // NOI18N
        jLabel25.setText("Students View");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(317, 112));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/feesubmissionlogo.png"))); // NOI18N
        jLabel26.setText("Fee Submission");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.setPreferredSize(new java.awt.Dimension(317, 112));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(317, 112));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/teacherlogo.png"))); // NOI18N
        jLabel8.setText("Teachers View");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setPreferredSize(new java.awt.Dimension(317, 112));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(317, 112));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/classlogo.png"))); // NOI18N
        jLabel28.setText("Class");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.setPreferredSize(new java.awt.Dimension(317, 112));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 110));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(317, 112));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/courseslogo.png"))); // NOI18N
        jLabel57.setText("Courses");
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel57.setPreferredSize(new java.awt.Dimension(317, 112));
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(317, 112));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/couasslogo.png"))); // NOI18N
        jLabel58.setText("Courses Assign");
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel58.setPreferredSize(new java.awt.Dimension(317, 112));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 110));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab5", home);

        teachersdata.setBackground(new java.awt.Color(204, 255, 255));

        setmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        setmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setmenu.setText("Teachers Data");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Last Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Phone");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Degree");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Address");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        insertdatat.setBackground(new java.awt.Color(255, 255, 255));
        insertdatat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insertdatat.setText("Insert");
        insertdatat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertdatatActionPerformed(evt);
            }
        });

        updatedata.setBackground(new java.awt.Color(255, 255, 255));
        updatedata.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatedata.setText("Update");
        updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedataActionPerformed(evt);
            }
        });

        Deletedata.setBackground(new java.awt.Color(255, 255, 255));
        Deletedata.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Deletedata.setText("Delete");
        Deletedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletedataActionPerformed(evt);
            }
        });

        resetteacherbutton.setBackground(new java.awt.Color(255, 255, 255));
        resetteacherbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetteacherbutton.setText("Reset");
        resetteacherbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetteacherbuttonActionPerformed(evt);
            }
        });

        Table1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "lastname", "Gender", "phone", "email", "degree", "address", "id"
            }
        ));
        jScrollPane1.setViewportView(Table1);

        searchdata.setBackground(new java.awt.Color(255, 255, 255));
        searchdata.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchdata.setText("Search");
        searchdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdataActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Id");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Gender");

        javax.swing.GroupLayout teachersdataLayout = new javax.swing.GroupLayout(teachersdata);
        teachersdata.setLayout(teachersdataLayout);
        teachersdataLayout.setHorizontalGroup(
            teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersdataLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teachersdataLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(teachersdataLayout.createSequentialGroup()
                        .addComponent(setmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchdata)
                        .addGap(100, 100, 100))
                    .addGroup(teachersdataLayout.createSequentialGroup()
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ln, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, teachersdataLayout.createSequentialGroup()
                                .addComponent(male)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(female))
                            .addComponent(de, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teachersdataLayout.createSequentialGroup()
                                .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resetteacherbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(teachersdataLayout.createSequentialGroup()
                                        .addComponent(insertdatat, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updatedata, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(Deletedata, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        teachersdataLayout.setVerticalGroup(
            teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersdataLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchdata)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(teachersdataLayout.createSequentialGroup()
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(de, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(teachersdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertdatat)
                            .addComponent(updatedata)
                            .addComponent(Deletedata))))
                .addGap(18, 18, 18)
                .addComponent(resetteacherbutton)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab1", teachersdata);

        studentsdata.setBackground(new java.awt.Color(204, 255, 255));

        male1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male1);
        male1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        male1.setText("Male");

        female1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female1);
        female1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        female1.setText("Female");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("First Name");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("Last Name");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Phone");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Gender");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Address");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Class");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("Id");

        insertstudent.setBackground(new java.awt.Color(255, 255, 255));
        insertstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insertstudent.setText("Insert");
        insertstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertstudentActionPerformed(evt);
            }
        });

        updatestudent.setBackground(new java.awt.Color(255, 255, 255));
        updatestudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatestudent.setText("Update");
        updatestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestudentActionPerformed(evt);
            }
        });

        Deletestudent.setBackground(new java.awt.Color(255, 255, 255));
        Deletestudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Deletestudent.setText("Delete");
        Deletestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletestudentActionPerformed(evt);
            }
        });

        resetstudent.setBackground(new java.awt.Color(255, 255, 255));
        resetstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetstudent.setText("Reset");
        resetstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetstudentActionPerformed(evt);
            }
        });

        Table2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "lastname", "Gender", "phone", "address", "class", "id"
            }
        ));
        Table2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Table2);

        searchstudent.setBackground(new java.awt.Color(255, 255, 255));
        searchstudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchstudent.setText("Search");
        searchstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstudentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Students Registration");

        javax.swing.GroupLayout studentsdataLayout = new javax.swing.GroupLayout(studentsdata);
        studentsdata.setLayout(studentsdataLayout);
        studentsdataLayout.setHorizontalGroup(
            studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsdataLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471)
                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchstudent)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsdataLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsdataLayout.createSequentialGroup()
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentsdataLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(male1)
                                .addGap(18, 18, 18)
                                .addComponent(female1))
                            .addGroup(studentsdataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(studentsdataLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fn1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ln1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(studentsdataLayout.createSequentialGroup()
                            .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsdataLayout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(studentsdataLayout.createSequentialGroup()
                                    .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)))
                            .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(id1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(class1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(add1)))
                        .addGroup(studentsdataLayout.createSequentialGroup()
                            .addGap(0, 44, Short.MAX_VALUE)
                            .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsdataLayout.createSequentialGroup()
                                    .addComponent(insertstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updatestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(resetstudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Deletestudent, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        studentsdataLayout.setVerticalGroup(
            studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsdataLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchstudent))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentsdataLayout.createSequentialGroup()
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(female1)
                            .addComponent(male1)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentsdataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertstudent)
                            .addComponent(updatestudent)
                            .addComponent(Deletestudent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetstudent))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab2", studentsdata);

        feee.setBackground(new java.awt.Color(204, 255, 255));
        feee.setPreferredSize(new java.awt.Dimension(1167, 770));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Student Id");
        jLabel31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel32.setText("Student Name");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel33.setText("Father Name");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel34.setText("Class");

        choose.setBackground(new java.awt.Color(0, 102, 102));
        choose.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel35.setText("Address");

        feeadd.setColumns(20);
        feeadd.setRows(5);
        jScrollPane3.setViewportView(feeadd);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel36.setText("Phone");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel37.setText("Convence ");

        bus.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup3.add(bus);
        bus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bus.setText("Bus");

        per.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup3.add(per);
        per.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        per.setText("Personal");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel38.setText("School Fee");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel39.setText("Bus Fee");

        feearea.setColumns(20);
        feearea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        feearea.setRows(5);
        feearea.setText("\n\n");
        jScrollPane4.setViewportView(feearea);

        genfee.setBackground(new java.awt.Color(255, 255, 255));
        genfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genfee.setText("Generate Receipt");
        genfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genfeeActionPerformed(evt);
            }
        });

        resetfee.setBackground(new java.awt.Color(255, 255, 255));
        resetfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetfee.setText("Reset");
        resetfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetfeeActionPerformed(evt);
            }
        });

        Printfee.setBackground(new java.awt.Color(255, 255, 255));
        Printfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Printfee.setText("Print");
        Printfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintfeeActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Fee Submission");

        feesch.setBackground(new java.awt.Color(0, 102, 102));
        feesch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        feesch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1200", "1800", "2500" }));

        feebus.setBackground(new java.awt.Color(0, 102, 102));
        feebus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        feebus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "500", "800", "1200" }));

        buttonGroup2.add(paid);
        paid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        paid.setText("Paid");

        buttonGroup2.add(unpaid);
        unpaid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        unpaid.setText("Unpaid");

        addfee.setBackground(new java.awt.Color(255, 255, 255));
        addfee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addfee.setText("Add in record");
        addfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfeeActionPerformed(evt);
            }
        });

        viewrecord.setBackground(new java.awt.Color(255, 255, 255));
        viewrecord.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewrecord.setText("View Record");
        viewrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrecordActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1 - 4", "1200", "500"},
                {"5 - 7", "1800", "800"},
                {"8 - 10", "2500", "1200"}
            },
            new String [] {
                "Class", "School Fees", "Bus Fees"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane9.setViewportView(jTable1);

        javax.swing.GroupLayout feeeLayout = new javax.swing.GroupLayout(feee);
        feee.setLayout(feeeLayout);
        feeeLayout.setHorizontalGroup(
            feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feeeLayout.createSequentialGroup()
                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feeeLayout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(feeeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(genfee)
                                .addGap(18, 18, 18)
                                .addComponent(resetfee, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Printfee, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(feeeLayout.createSequentialGroup()
                                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(feeeLayout.createSequentialGroup()
                                        .addComponent(bus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(per))
                                    .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3)
                                        .addComponent(feephone)
                                        .addComponent(feeft)
                                        .addComponent(feenm)
                                        .addComponent(feeid, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(feeeLayout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(feeeLayout.createSequentialGroup()
                                        .addComponent(feesch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(feebus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feeeLayout.createSequentialGroup()
                                        .addComponent(paid)
                                        .addGap(88, 88, 88)
                                        .addComponent(unpaid)
                                        .addGap(76, 76, 76))))))
                    .addGroup(feeeLayout.createSequentialGroup()
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(feeeLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(feeeLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(addfee)
                                .addGap(18, 18, 18)
                                .addComponent(viewrecord)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(feeeLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(218, 218, 218))
        );
        feeeLayout.setVerticalGroup(
            feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feeeLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
            .addGroup(feeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feeid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feeeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feenm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feeft, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(feephone, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bus)
                            .addComponent(per)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feesch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(feebus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paid)
                            .addComponent(unpaid))
                        .addGap(9, 9, 9)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genfee)
                            .addComponent(resetfee)
                            .addComponent(Printfee))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(feeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewrecord)
                            .addComponent(addfee))
                        .addGap(183, 183, 183))))
        );

        TabbedPanel.addTab("tab3", feee);

        classes.setBackground(new java.awt.Color(204, 255, 255));

        choclass.setBackground(new java.awt.Color(0, 102, 102));
        choclass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel51.setText("For Class");

        classteacho.setBackground(new java.awt.Color(0, 102, 102));
        classteacho.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classteacho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel52.setText("Teacher Name");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel53.setText("Timing");

        timeclass.setBackground(new java.awt.Color(0, 102, 102));
        timeclass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        timeclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "8:00am - 9:00am", "8:00am - 8:45am", "9:00am - 9:30am", "8:45am - 9:15am", "9:30am - 10:00am", "9:15am - 9:45am", "10:00am - 10:30am", "9:45am - 10:15am", "10:30am - 11:15am", "10:15am - 10:45am", "11:15am - 11:45am", "10:45am - 11:15am", "11:45am - 12:30pm", "11:15am - 12:00pm", "12:30pm - 1:00pm" }));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel54.setText("Day");

        classday.setBackground(new java.awt.Color(0, 102, 102));
        classday.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " ", "      " }));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel55.setText("Subject");

        classchosub.setBackground(new java.awt.Color(0, 102, 102));
        classchosub.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classchosub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Break" }));

        Tableclass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tableclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class", "Teachername", "Day", "Timing", "Subject"
            }
        ));
        Tableclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableclassMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(Tableclass);

        insertclass.setBackground(new java.awt.Color(255, 255, 255));
        insertclass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insertclass.setText("Insert");
        insertclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertclassActionPerformed(evt);
            }
        });

        updateclass.setBackground(new java.awt.Color(255, 255, 255));
        updateclass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateclass.setText("Update");
        updateclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateclassActionPerformed(evt);
            }
        });

        deleteclass.setBackground(new java.awt.Color(255, 255, 255));
        deleteclass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteclass.setText("Delete");
        deleteclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteclassActionPerformed(evt);
            }
        });

        resetclass.setBackground(new java.awt.Color(255, 255, 255));
        resetclass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetclass.setText("Reset");
        resetclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetclassActionPerformed(evt);
            }
        });

        searchclasss.setBackground(new java.awt.Color(255, 255, 255));
        searchclasss.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchclasss.setText("Search Class and day");
        searchclasss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchclasssActionPerformed(evt);
            }
        });

        classday1.setBackground(new java.awt.Color(0, 102, 102));
        classday1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        classday1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", " ", "      " }));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Classes");

        javax.swing.GroupLayout classesLayout = new javax.swing.GroupLayout(classes);
        classes.setLayout(classesLayout);
        classesLayout.setHorizontalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(classesLayout.createSequentialGroup()
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(classesLayout.createSequentialGroup()
                                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52))
                                .addGap(24, 24, 24)
                                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(choclass, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classteacho, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeclass, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classday, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classchosub, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(classesLayout.createSequentialGroup()
                                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                                        .addComponent(insertclass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateclass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(resetclass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteclass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(classesLayout.createSequentialGroup()
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classday1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(searchclasss)))
                .addGap(32, 32, 32))
        );
        classesLayout.setVerticalGroup(
            classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classesLayout.createSequentialGroup()
                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(classesLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(classesLayout.createSequentialGroup()
                                .addComponent(searchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classday1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchclasss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(classesLayout.createSequentialGroup()
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choclass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classteacho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classday, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeclass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classchosub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(classesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertclass)
                            .addComponent(updateclass)
                            .addComponent(deleteclass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetclass)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab4", classes);

        Courses.setBackground(new java.awt.Color(204, 255, 255));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel40.setText("Course Name");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel41.setText("Course Code");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel42.setText("For Class");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel43.setText("Note");

        bkcoudes.setColumns(20);
        bkcoudes.setRows(5);
        jScrollPane5.setViewportView(bkcoudes);

        choosecouclass.setBackground(new java.awt.Color(0, 102, 102));
        choosecouclass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choosecouclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel44.setText("Book Prize");

        Tablecou3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tablecou3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "course name", "course code", "book prize", "for class", "book description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Tablecou3);

        InsertCourse.setBackground(new java.awt.Color(255, 255, 255));
        InsertCourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        InsertCourse.setText("Insert");
        InsertCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertCourseActionPerformed(evt);
            }
        });

        DeleteCourse.setBackground(new java.awt.Color(255, 255, 255));
        DeleteCourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteCourse.setText("Delete");
        DeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCourseActionPerformed(evt);
            }
        });

        ResetCourse.setBackground(new java.awt.Color(255, 255, 255));
        ResetCourse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResetCourse.setText("Reset");
        ResetCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetCourseActionPerformed(evt);
            }
        });

        UpdateCourses.setBackground(new java.awt.Color(255, 255, 255));
        UpdateCourses.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateCourses.setText("Update");
        UpdateCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCoursesActionPerformed(evt);
            }
        });

        searchbook.setBackground(new java.awt.Color(255, 255, 255));
        searchbook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchbook.setText("Search");
        searchbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbookActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Courses");

        javax.swing.GroupLayout CoursesLayout = new javax.swing.GroupLayout(Courses);
        Courses.setLayout(CoursesLayout);
        CoursesLayout.setHorizontalGroup(
            CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbook))
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addComponent(coucode)
                            .addComponent(choosecouclass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(counm)
                            .addComponent(bkprize)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursesLayout.createSequentialGroup()
                                .addComponent(InsertCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ResetCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateCourses))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteCourse)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        CoursesLayout.setVerticalGroup(
            CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbook)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CoursesLayout.createSequentialGroup()
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(counm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coucode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bkprize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choosecouclass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InsertCourse)
                            .addGroup(CoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DeleteCourse)
                                .addComponent(UpdateCourses)))
                        .addGap(18, 18, 18)
                        .addComponent(ResetCourse)))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab6", Courses);

        CoursesAssign.setBackground(new java.awt.Color(204, 255, 255));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel47.setText("Teacher Name");

        choosetea.setBackground(new java.awt.Color(0, 102, 102));
        choosetea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        choosetea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel48.setText("Courses Select");

        couselect1.setBackground(new java.awt.Color(0, 102, 102));
        couselect1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        couselect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        couselect2.setBackground(new java.awt.Color(0, 102, 102));
        couselect2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        couselect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        couselect3.setBackground(new java.awt.Color(0, 102, 102));
        couselect3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        couselect3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        couselect4.setBackground(new java.awt.Color(0, 102, 102));
        couselect4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        couselect4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        couselect5.setBackground(new java.awt.Color(0, 102, 102));
        couselect5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        couselect5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        Tablecouass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tablecouass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Id", "Teacher Name", "Courses Assign", "Remaing Slots", "Total Assign"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Tablecouass);

        submitcouassign.setBackground(new java.awt.Color(255, 255, 255));
        submitcouassign.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submitcouassign.setText("Submit");
        submitcouassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitcouassignActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Courses Assign");

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel56.setText("Teacher Id");

        chooseteaid.setBackground(new java.awt.Color(0, 102, 102));
        chooseteaid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        chooseteaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        Searchcouass.setBackground(new java.awt.Color(255, 255, 255));
        Searchcouass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Searchcouass.setText("Search");
        Searchcouass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchcouassActionPerformed(evt);
            }
        });

        updatecouass.setBackground(new java.awt.Color(255, 255, 255));
        updatecouass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updatecouass.setText("Update");
        updatecouass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecouassActionPerformed(evt);
            }
        });

        Deletecouass.setBackground(new java.awt.Color(255, 255, 255));
        Deletecouass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Deletecouass.setText("Delete");
        Deletecouass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletecouassActionPerformed(evt);
            }
        });

        resetcouass.setBackground(new java.awt.Color(255, 255, 255));
        resetcouass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        resetcouass.setText("Reset");
        resetcouass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetcouassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CoursesAssignLayout = new javax.swing.GroupLayout(CoursesAssign);
        CoursesAssign.setLayout(CoursesAssignLayout);
        CoursesAssignLayout.setHorizontalGroup(
            CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesAssignLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CoursesAssignLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchcouass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Searchcouass))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CoursesAssignLayout.createSequentialGroup()
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CoursesAssignLayout.createSequentialGroup()
                                    .addGap(112, 112, 112)
                                    .addComponent(choosetea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CoursesAssignLayout.createSequentialGroup()
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chooseteaid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CoursesAssignLayout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(couselect1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(couselect2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couselect3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couselect4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(couselect5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CoursesAssignLayout.createSequentialGroup()
                                .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitcouassign)
                                    .addComponent(Deletecouass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updatecouass, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resetcouass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        CoursesAssignLayout.setVerticalGroup(
            CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CoursesAssignLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchcouass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchcouass))
                .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CoursesAssignLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chooseteaid, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choosetea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(couselect1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(couselect2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(couselect3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(couselect4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(couselect5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatecouass)
                            .addComponent(submitcouassign))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CoursesAssignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Deletecouass)
                            .addComponent(resetcouass)))
                    .addGroup(CoursesAssignLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("tab7", CoursesAssign);

        jPanel1.add(TabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 1170, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_teachersMouseClicked

    private void studentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(2);
    }//GEN-LAST:event_studentsMouseClicked

    private void feeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(3);
    }//GEN-LAST:event_feeMouseClicked

    private void classsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classsMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(4);
    }//GEN-LAST:event_classsMouseClicked

    private void insertdatatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertdatatActionPerformed
        // TODO add your handling code here:
        DBsms db= new DBsms();
        String gender1 = "";
        if(male.isSelected()){
            gender1 = "male";
        }else if (female.isSelected()){
            gender1 = "female";
        }
         db.teacheradd(fn.getText(), ln.getText(), gender1 , phone.getText(), email.getText(), de.getText(), add.getText(),id.getText());
        ResultSet rs=db.DisplayUsers();
        DefaultTableModel tb=(DefaultTableModel)Table1.getModel();
        tb.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname") ,rs.getString("Gender"), rs.getString("Phone"),rs.getString("Email"),rs.getString("Degree"),rs.getString("Address"),rs.getString("Id")};
        tb.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
             

    }//GEN-LAST:event_insertdatatActionPerformed

    private void searchdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdataActionPerformed
        // TODO add your handling code here:
        DBsms db= new DBsms();
        
        ResultSet rs=db.Searchuser(search.getText());
        DefaultTableModel tb1=(DefaultTableModel)Table1.getModel();
        tb1.setRowCount(0);
        System.out.println("searched");
        try{
        while(rs.next()){
            
         fn.setText(rs.getString("Firstname"));
         ln.setText(rs.getString("Lastname"));
         String gender1 = rs.getString("Gender");
        if(gender1.equals("male")){
            male.setSelected(true);
        }else if (gender1.equals("female")){
            female.setSelected(true);
        }
         phone.setText(rs.getString("Phone"));
         email.setText(rs.getString("Email"));
         de.setText(rs.getString("Degree"));
         add.setText(rs.getString("Address"));
         id.setText(rs.getString("Id"));      
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Gender"),rs.getString("Phone"),rs.getString("Email"),rs.getString("Degree"),rs.getString("Address"),rs.getString("Id")};
        tb1.addRow(data);
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchdataActionPerformed

    private void updatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedataActionPerformed
        // TODO add your handling code here:
        fn.getText();
        ln.getText();
        phone.getText();
        email.getText();
        de.getText();
        add.getText();
        

        DBsms db=new DBsms();
        String gender1 = "";
        if(male.isSelected()){
            gender1 = "male";
        }else if (female.isSelected()){
            gender1 = "female";
        }
       
        
        db.updateRecord(fn.getText(), ln.getText(), gender1, phone.getText(), email.getText(), de.getText(), add.getText(), Integer.parseInt(search.getText()));
        
        ResultSet rs=db.DisplayUsers();
        DefaultTableModel tb=(DefaultTableModel)Table1.getModel();
        tb.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Gender"),rs.getString("Phone"),rs.getString("Email"),rs.getString("Degree"),rs.getString("Address"),rs.getString("Id")};
        tb.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updatedataActionPerformed

    private void DeletedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletedataActionPerformed
        // TODO add your handling code here:
         DBsms db=new DBsms();
        db.Deletedata(Integer.parseInt(search.getText()));
         ResultSet rs=db.DisplayUsers();
        DefaultTableModel tb=(DefaultTableModel)Table1.getModel();
        tb.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Phone"),rs.getString("Email"),rs.getString("Degree"),rs.getString("Address"),rs.getString("Id")};
        tb.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DeletedataActionPerformed

    private void teachersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersMousePressed
        // TODO add your handling code here:
        manu.setText("Teachers");
        Home.setBackground(DefaultColor);
        teachers.setBackground(ClickedColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);

       
    }//GEN-LAST:event_teachersMousePressed

    private void studentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsMousePressed
        // TODO add your handling code here:
        manu.setText("Students");
        Home.setBackground(DefaultColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(ClickedColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);

    }//GEN-LAST:event_studentsMousePressed

    private void feeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feeMousePressed
        // TODO add your handling code here:
        manu.setText("Fee submission");
        Home.setBackground(DefaultColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(ClickedColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);

    }//GEN-LAST:event_feeMousePressed

    private void classsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classsMousePressed
        // TODO add your handling code here:
        manu.setText("Class");
        Home.setBackground(DefaultColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(ClickedColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);


    }//GEN-LAST:event_classsMousePressed

    private void insertstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertstudentActionPerformed
        // TODO add your handling code here:
        DBsms db1=new DBsms();
        String gender="";
        if(male1.isSelected()){
        gender="Male";
        }else if(female1.isSelected()){
        gender="Female";
        }
        db1.StudentAdd(fn1.getText(), ln1.getText(),gender, phone1.getText(), add1.getText(), class1.getText(), id1.getText());
        ResultSet rs=db1.DisplayStudent();
        DefaultTableModel tb=(DefaultTableModel)Table2.getModel();
        tb.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname") ,rs.getString("Gender"),rs.getString("Phone"),rs.getString("Address"),rs.getString("Class"),rs.getString("Id")};
        tb.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_insertstudentActionPerformed

    private void updatestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestudentActionPerformed
        // TODO add your handling code here: fn.getText();
         fn1.getText();
        ln1.getText();
        phone1.getText();
        add1.getText();
        class1.getText();
        

        DBsms db1=new DBsms();
        String gender="";
        if(male1.isSelected()){
        gender="Male";
        }else if(female1.isSelected()){
        gender="Female";
        }
        
        db1.UpdateStudent(fn1.getText(), ln1.getText(),gender, phone1.getText(), add1.getText(), class1.getText(),  Integer.parseInt(search1.getText()));
        ResultSet rs=db1.DisplayStudent();
        DefaultTableModel tb1=(DefaultTableModel)Table2.getModel();
        tb1.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname") , rs.getString("Gender"),rs.getString("Phone"),rs.getString("Address"),rs.getString("Class"),rs.getString("Id")};
        tb1.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    
    }//GEN-LAST:event_updatestudentActionPerformed

    private void DeletestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletestudentActionPerformed
        // TODO add your handling code here:
         DBsms db1=new DBsms();
        db1.DeleteStudent(Integer.parseInt(search1.getText()));
         ResultSet rs=db1.DisplayStudent();
        DefaultTableModel tb1=(DefaultTableModel)Table2.getModel();
        tb1.setRowCount(0);
        try{
        while(rs.next()){
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Gender"),rs.getString("Phone"),rs.getString("Address"),rs.getString("Class"),rs.getString("Id")};
        tb1.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DeletestudentActionPerformed

    private void searchstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstudentActionPerformed
        // TODO add your handling code here:;
        DBsms db1= new DBsms();
        
        ResultSet rs=db1.SearchStudent(search1.getText());
        DefaultTableModel tb1=(DefaultTableModel)Table2.getModel();
        tb1.setRowCount(0);
        System.out.println("searched");
        try{
        while(rs.next()){
            
         fn1.setText(rs.getString("Firstname"));
         ln1.setText(rs.getString("Lastname"));
         String gender = rs.getString("Gender");
        if(gender.equals("Male")){
            male1.setSelected(true);
        }else if (gender.equals("Female")){
            female1.setSelected(true);
        }
         phone1.setText(rs.getString("Phone"));
         add1.setText(rs.getString("Address"));
         class1.setText(rs.getString("Class"));
         id1.setText(rs.getString("Id"));      
        String []data={rs.getString("Firstname"),rs.getString("Lastname"),rs.getString("Gender"),rs.getString("Phone"),rs.getString("Address"),rs.getString("Class"),rs.getString("Id")};
        tb1.addRow(data);
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchstudentActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        teachersview tea=new teachersview();
        tea.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
        studentview sv = new studentview();
        sv.setVisible(true);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void resetteacherbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetteacherbuttonActionPerformed
        // TODO add your handling code here:
        fn.setText(null);
        ln.setText(null);
        buttonGroup1.clearSelection();
        male.setSelected(false);
        female.setSelected(false);
        add.setText(null);
        phone.setText(null);
        de.setText(null);
        email.setText(null);
        id.setText(null);
        
        search.setText(null);

    }//GEN-LAST:event_resetteacherbuttonActionPerformed

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(5);
    }//GEN-LAST:event_courseMouseClicked

    private void courseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMousePressed
        // TODO add your handling code here:
        manu.setText("Course");
        Home.setBackground(DefaultColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(ClickedColor);
        courseassign.setBackground(DefaultColor);

    }//GEN-LAST:event_courseMousePressed

    private void resetstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetstudentActionPerformed
        // TODO add your handling code here
        fn1.setText(null);
        ln1.setText(null);
        buttonGroup1.clearSelection();
        male1.setSelected(false);
        female1.setSelected(false);
        add1.setText(null);
        phone1.setText(null);
        class1.setText(null);
        id1.setText(null);
        search1.setText(null);

    }//GEN-LAST:event_resetstudentActionPerformed

    private void InsertCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertCourseActionPerformed
        // TODO add your handling code here:
        DBsms db2=new DBsms();
       String couchoose=(String)choosecouclass.getSelectedItem();
        db2.CoursesAdd(counm.getText(), coucode.getText(), bkprize.getText(),couchoose, bkcoudes.getText());
        ResultSet rs2=db2.DisplayCourses();
        DefaultTableModel tb2=(DefaultTableModel)Tablecou3.getModel();
        tb2.setRowCount(0);
        try{
        while(rs2.next()){
        String []data={rs2.getString("CourseName"),rs2.getString("CourseCode") ,rs2.getString("BookPrize"),rs2.getString("ForClass"),rs2.getString("Note")};
        tb2.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_InsertCourseActionPerformed

    private void UpdateCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCoursesActionPerformed
        // TODO add your handling code here:
        counm.getText();
        coucode.getText();
        bkprize.getText();
       bkcoudes.getText();        
       String choosecouclasss=(String)choosecouclass.getSelectedItem();
 
        DBsms db2=new DBsms();
        db2.UpdateCourses(counm.getText(), coucode.getText(), bkprize.getText(),choosecouclasss, bkcoudes.getText());
        ResultSet rs2=db2.DisplayCourses();
        DefaultTableModel tb2=(DefaultTableModel)Tablecou3.getModel();
        tb2.setRowCount(0);
        try{
        while(rs2.next()){
        String []data={rs2.getString("CourseName"),rs2.getString("CourseCode") ,rs2.getString("BookPrize"),rs2.getString("ForClass"),rs2.getString("Note")};
        tb2.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_UpdateCoursesActionPerformed

    private void DeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCourseActionPerformed
        // TODO add your handling code here:
        DBsms db2=new DBsms();
        db2.DeleteCourse((Searchbook.getText()));
         ResultSet rs2=db2.DisplayCourses();
        DefaultTableModel tb2=(DefaultTableModel)Tablecou3.getModel();
        tb2.setRowCount(0);
        try{
        while(rs2.next()){
        String []data={rs2.getString("CourseName"),rs2.getString("CourseCode"),rs2.getString("BookPrize"),rs2.getString("ForClass"),rs2.getString("Note")};
        tb2.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DeleteCourseActionPerformed

    private void searchbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbookActionPerformed
        // TODO add your handling code here:
        DBsms db2= new DBsms();
        
        ResultSet rs2=db2.SearchCourse(Searchbook.getText());
        DefaultTableModel tb2=(DefaultTableModel)Tablecou3.getModel();
        tb2.setRowCount(0);
        System.out.println("searched");
        try{
        while(rs2.next()){
            
         counm.setText(rs2.getString("CourseName"));
         coucode.setText(rs2.getString("CourseCode"));
         bkprize.setText(rs2.getString("BookPrize"));
         String choosecouclasss= rs2.getString("ForClass");
         choosecouclass.setSelectedItem(choosecouclasss);
         bkcoudes.setText(rs2.getString("Note"));
         
           
        String []data={rs2.getString("CourseName"),rs2.getString("CourseCode"),rs2.getString("BookPrize"),rs2.getString("ForClass"),rs2.getString("Note")};
        tb2.addRow(data);
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_searchbookActionPerformed

    private void ResetCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetCourseActionPerformed
        // TODO add your handling code here:
        counm.setText(null);
        coucode.setText(null);
        bkprize.setText(null);
        choosecouclass.setSelectedIndex(0);
        bkcoudes.setText(null);
        Searchbook.setText(null);
    }//GEN-LAST:event_ResetCourseActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login l=new Login();
        l.setVisible(true);
        
    }//GEN-LAST:event_jLabel27MouseClicked

    private void courseassignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseassignMouseClicked
        // TODO add your handling code here
        TabbedPanel.setSelectedIndex(6);
    }//GEN-LAST:event_courseassignMouseClicked

    private void courseassignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseassignMousePressed
        // TODO add your handling code here:
        manu.setText("Courses Assign");
        Home.setBackground(DefaultColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(ClickedColor);
    }//GEN-LAST:event_courseassignMousePressed

    private void submitcouassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitcouassignActionPerformed
        // TODO add your handling code here:
    DBsms db3=new DBsms();
    String chooseteaidd=(String) chooseteaid.getSelectedItem();
    String chooseteaa=(String) choosetea.getSelectedItem();
    String cou1=(String) couselect1.getSelectedItem();
    String cou2=(String) couselect2.getSelectedItem();
    if(!cou2.equals("Select")){
            cou2=(String) couselect2.getSelectedItem();
        }else{
            cou2="-";
        }
    String cou3=(String) couselect3.getSelectedItem();
    if(!cou3.equals("Select")){
            cou3=(String) couselect3.getSelectedItem();
        }else{
            cou3="-";
        }
    String cou4=(String) couselect4.getSelectedItem();
    if(!cou4.equals("Select")){
            cou4=(String) couselect4.getSelectedItem();
        }else{
            cou4="-";
        }
    String cou5=(String) couselect5.getSelectedItem();
    if(!cou5.equals("Select")){
            cou5=(String) couselect5.getSelectedItem();
        }else{
            cou5="-";
        }
    
    String str =(String) couselect1.getSelectedItem() + " " + (String) couselect2.getSelectedItem() + " " +(String) couselect3.getSelectedItem()+ " " + (String) couselect4.getSelectedItem()+ " " + (String) couselect5.getSelectedItem();
       String[] splited = str.split("\\s+");
       int Couass=0;
    for(String s : splited){
    if(!s.equals("Select")){
      Couass++;
    }
    }
    int total=5;
        int rms = total-Couass;
    db3.couassadd(chooseteaidd,chooseteaa, Couass, rms, total,cou1,cou2,cou3,cou4,cou5);
    ResultSet rs3=db3.DisplayCourseAssign();
    DefaultTableModel tb3=(DefaultTableModel)Tablecouass.getModel();
    tb3.setRowCount(0);
    try{
        while(rs3.next()){
        String []data={rs3.getString("TeacherId"),rs3.getString("Teachername"),rs3.getString("Coursesassign"),rs3.getString("Remainingslots"),rs3.getString("Totalassign")};
        tb3.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_submitcouassignActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        TabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        // TODO add your handling code here:
        manu.setText("Home");
        Home.setBackground(ClickedColor);
        teachers.setBackground(DefaultColor);
        students.setBackground(DefaultColor);
        fee.setBackground(DefaultColor);
        classs.setBackground(DefaultColor);
        course.setBackground(DefaultColor);
        courseassign.setBackground(DefaultColor);
    }//GEN-LAST:event_HomeMousePressed

    private void insertclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertclassActionPerformed
        // TODO add your handling code here:
    DBsms db4=new DBsms();
    String choclasss=(String) choclass.getSelectedItem();
    String classteachoo=(String) classteacho.getSelectedItem();
    String classdayy=(String) classday.getSelectedItem();
    String timeclasss=(String) timeclass.getSelectedItem();
    String classchosubb=(String) classchosub.getSelectedItem();
    db4.classadd(choclasss, classteachoo, classdayy, timeclasss, classchosubb);
    ResultSet rs4=db4.DisplayClass();
    DefaultTableModel tb4=(DefaultTableModel)Tableclass.getModel();
    tb4.setRowCount(0);
    try{
        while(rs4.next()){
        String []data={rs4.getString("Class"),rs4.getString("Teachername"),rs4.getString("Day"),rs4.getString("Timing"),rs4.getString("Subject")};
        tb4.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_insertclassActionPerformed

    private void updateclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateclassActionPerformed
        // TODO add your handling code here:
    DBsms db4=new DBsms();
    String choclasss=(String) choclass.getSelectedItem();
    String classteachoo=(String) classteacho.getSelectedItem();
    String classdayy=(String) classday.getSelectedItem();
    String timeclasss=(String) timeclass.getSelectedItem();
    String classchosubb=(String) classchosub.getSelectedItem();
    db4.updateclass(choclasss, classteachoo, classdayy, timeclasss, classchosubb);
    ResultSet rs4=db4.DisplayClass();
    DefaultTableModel tb4=(DefaultTableModel)Tableclass.getModel();
    tb4.setRowCount(0);
    try{
        while(rs4.next()){
        String []data={rs4.getString("Class"),rs4.getString("Teachername"),rs4.getString("Day"),rs4.getString("Timing"),rs4.getString("Subject")};
        tb4.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_updateclassActionPerformed

    private void deleteclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteclassActionPerformed
        // TODO add your handling code here:
         int row=Tableclass.getSelectedRow();
        String tc1=Tableclass.getModel().getValueAt(row, 0).toString();
        String tc2=Tableclass.getModel().getValueAt(row, 1).toString();  
        DBsms db4=new DBsms();
        db4.Deleteclass(tc1,tc2);
         ResultSet rs4=db4.DisplayClass();
        DefaultTableModel tb4=(DefaultTableModel)Tableclass.getModel();
        tb4.setRowCount(0);
        try{
        while(rs4.next()){
        String []data={rs4.getString("Class"),rs4.getString("Teachername"),rs4.getString("Day"),rs4.getString("Timing"),rs4.getString("Subject")};
        tb4.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteclassActionPerformed

    private void resetclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetclassActionPerformed
        // TODO add your handling code here:
        choclass.setSelectedIndex(0);        
        classteacho.setSelectedIndex(0);
        classday.setSelectedIndex(0);
        timeclass.setSelectedIndex(0);
        classchosub.setSelectedIndex(0);
        searchclass.setText(null);

    }//GEN-LAST:event_resetclassActionPerformed

    private void searchclasssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchclasssActionPerformed
        // TODO add your handling code here:
        DBsms db4= new DBsms();
        String classdayy=(String) classday1.getSelectedItem();
        ResultSet rs4=db4.SearchClass(searchclass.getText(),classdayy);
        DefaultTableModel tb4=(DefaultTableModel)Tableclass.getModel();
        tb4.setRowCount(0);
        System.out.println("searched");
        try{
        while(rs4.next()){     
        String []data={rs4.getString("Class"),rs4.getString("Teachername"),rs4.getString("Day"),rs4.getString("Timing"),rs4.getString("Subject")};
        tb4.addRow(data);
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_searchclasssActionPerformed

    private void TableclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableclassMouseClicked
        // TODO add your handling code here:
        int row=Tableclass.getSelectedRow();
        String tc=Tableclass.getModel().getValueAt(row, 3).toString();  
        DBsms db4= new DBsms();
        ResultSet rs4=db4.SearchClasstable(tc);
        try{
        if(rs4.next()){
        String choclasss= rs4.getString("Class");
         choclass.setSelectedItem(choclasss);
         String classteachoo= rs4.getString("Teachername");
         classteacho.setSelectedItem(classteachoo);
         String classdayy= rs4.getString("Day");
         classday.setSelectedItem(classdayy);
         String timeclasss= rs4.getString("Timing");
         timeclass.setSelectedItem(timeclasss);
         String classchosubb= rs4.getString("Subject");
         classchosub.setSelectedItem(classchosubb);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_TableclassMouseClicked

    private void SearchcouassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchcouassActionPerformed
        // TODO add your handling code here:
        DBsms db3= new DBsms();
        ResultSet rs3=db3.SearchCourseAssign(searchcouass.getText());
        DefaultTableModel tb3=(DefaultTableModel)Tablecouass.getModel();
        tb3.setRowCount(0);
        System.out.println("searched");
        try{
        while(rs3.next()){
         String chooseteaidd= rs3.getString("TeacherId");
         chooseteaid.setSelectedItem(chooseteaidd);
         String chooseteaa= rs3.getString("Teachername");
         choosetea.setSelectedItem(chooseteaa);
         String cou1= rs3.getString("Cou1");
         couselect1.setSelectedItem(cou1);
         String cou2= rs3.getString("Cou2");
         if(!cou2.equals("-")){
            couselect2.setSelectedItem(cou2);
        }else{
            cou2="Select";
            couselect2.setSelectedItem(cou2);
        }
         
         String cou3= rs3.getString("Cou3");
         if(!cou3.equals("-")){
            couselect3.setSelectedItem(cou3);
        }else{
            cou3="Select";
            couselect3.setSelectedItem(cou3);
        }
         
         String cou4= rs3.getString("Cou4");
         if(!cou4.equals("-")){
            couselect4.setSelectedItem(cou4);
        }else{
            cou4="Select";
            couselect4.setSelectedItem(cou4);
        }
         
         String cou5= rs3.getString("Cou5");
         if(!cou5.equals("-")){
            couselect5.setSelectedItem(cou5);
        }else{
            cou5="Select";
            couselect5.setSelectedItem(cou5);
        }
         
            
        String []data={rs3.getString("TeacherId"),rs3.getString("Teachername"),rs3.getString("Coursesassign"),rs3.getString("Remainingslots"),rs3.getString("Totalassign")};
        tb3.addRow(data);
        
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_SearchcouassActionPerformed

    private void updatecouassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecouassActionPerformed
        // TODO add your handling code here:
        DBsms db3=new DBsms();
    String chooseteaidd=(String) chooseteaid.getSelectedItem();
    String chooseteaa=(String) choosetea.getSelectedItem();    
    String cou1=(String) couselect1.getSelectedItem();
    String cou2=(String) couselect2.getSelectedItem();
    if(!cou2.equals("Select")){
            cou2=(String) couselect2.getSelectedItem();
        }else{
            cou2="-";
        }
    String cou3=(String) couselect3.getSelectedItem();
    if(!cou3.equals("Select")){
            cou3=(String) couselect3.getSelectedItem();
        }else{
            cou3="-";
        }
    String cou4=(String) couselect4.getSelectedItem();
    if(!cou4.equals("Select")){
            cou4=(String) couselect4.getSelectedItem();
        }else{
            cou4="-";
        }
    String cou5=(String) couselect5.getSelectedItem();
    if(!cou5.equals("Select")){
            cou5=(String) couselect5.getSelectedItem();
        }else{
            cou5="-";
        }
    String str =(String) couselect1.getSelectedItem() + " " + (String) couselect2.getSelectedItem() + " " +(String) couselect3.getSelectedItem()+ " " + (String) couselect4.getSelectedItem()+ " " + (String) couselect5.getSelectedItem();
       String[] splited = str.split("\\s+");
       int Couass=0;
    for(String s : splited){
    if(!s.equals("Select")){
      Couass++;
    }
    }
    int total=5;
        int rms = total-Couass;
    db3.couassupdate(chooseteaidd,chooseteaa, Couass, rms, total,cou1,cou2,cou3,cou4,cou5);
    ResultSet rs3=db3.DisplayCourseAssign();
    DefaultTableModel tb3=(DefaultTableModel)Tablecouass.getModel();
    tb3.setRowCount(0);
    try{
        while(rs3.next()){
        String []data={rs3.getString("TeacherId"),rs3.getString("Teachername"),rs3.getString("Coursesassign"),rs3.getString("Remainingslots"),rs3.getString("Totalassign")};
        tb3.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_updatecouassActionPerformed

    private void DeletecouassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletecouassActionPerformed
        // TODO add your handling code here:
        DBsms db3=new DBsms();
        db3.DeleteCourseAssign((searchcouass.getText()));
         ResultSet rs3=db3.DisplayCourseAssign();
        DefaultTableModel tb3=(DefaultTableModel)Tablecouass.getModel();
        tb3.setRowCount(0);
        try{
        while(rs3.next()){
        String []data={rs3.getString("TeacherId"),rs3.getString("Teachername"),rs3.getString("Coursesassign"),rs3.getString("Remainingslots"),rs3.getString("Totalassign")};
        tb3.addRow(data);
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_DeletecouassActionPerformed

    private void resetcouassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetcouassActionPerformed
        // TODO add your handling code here:
        chooseteaid.setSelectedIndex(0);
        choosetea.setSelectedIndex(0);
        couselect1.setSelectedIndex(0);
        couselect2.setSelectedIndex(0);
        couselect3.setSelectedIndex(0);
        couselect4.setSelectedIndex(0);
        couselect5.setSelectedIndex(0);
    }//GEN-LAST:event_resetcouassActionPerformed

    private void viewrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrecordActionPerformed
        // TODO add your handling code here:
        feerecordview fee=new feerecordview();
        fee.setVisible(true);
    }//GEN-LAST:event_viewrecordActionPerformed

    private void addfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfeeActionPerformed
        // TODO add your handling code here:
        DBsms db2 = new DBsms();
        Date thisDate=new Date();
        SimpleDateFormat dateform=new SimpleDateFormat("MMMM/dd/yyyy");
        String date = dateform.format(thisDate);
        String value=(String) choose.getSelectedItem();
        String feeschh=(String) feesch.getSelectedItem();
        String convence = "";
        if(bus.isSelected()){
            convence = "Bus";
        }else if (per.isSelected()){
            convence = "Personal";
        }
        String feebuss=(String) feebus.getSelectedItem();
        if(!feebuss.equals("Select")){
            feebuss=(String) feebus.getSelectedItem();
        }else{
            feebuss="-";
        }
        String submission = "";
        if(paid.isSelected()){
            submission = "Paid";
        }else if (unpaid.isSelected()){
            submission = "Unpaid";
        }
        db2.FeeAdd(date, feeid.getText(),feenm.getText() , feeft.getText(), value, feephone.getText(), feeadd.getText(), convence, feeschh, feebuss,submission);

    }//GEN-LAST:event_addfeeActionPerformed

    private void PrintfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintfeeActionPerformed
        // TODO add your handling code here:
        try{
            feearea.print();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_PrintfeeActionPerformed

    private void resetfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetfeeActionPerformed
        // TODO add your handling code here:
        feeid.setText(null);
        feenm.setText(null);
        feeft.setText(null);
        feeadd.setText(null);
        feephone.setText(null);
        feesch.setSelectedIndex(0);
        feebus.setSelectedIndex(0);
        feearea.setText(null);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        bus.setSelected(false);
        per.setSelected(false);
        choose.setSelectedIndex(0);
    }//GEN-LAST:event_resetfeeActionPerformed

    private void genfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genfeeActionPerformed
        // TODO add your handling code here:

        feearea.setText("********************************************\n");
        feearea.setText(feearea.getText()+"                   Fee Receipt\n\n\n");

        Date thisDate=new Date();
        SimpleDateFormat dateform=new SimpleDateFormat("MMMM/dd/yyyy");
        feearea.setText(feearea.getText() +"                                      Date :" + dateform.format(thisDate)+"\n");

        feearea.setText(feearea.getText() + "Student id :" + feeid.getText()+"\n");
        feearea.setText(feearea.getText() + "Student Name :" + feenm.getText()+"\n");
        feearea.setText(feearea.getText() + "Father Name :" + feeft.getText()+"\n");
        feearea.setText(feearea.getText() + "Class :" + choose.getSelectedItem()+"\n");
        feearea.setText(feearea.getText() + "Phone :" + feephone.getText()+"\n");
        feearea.setText(feearea.getText() + "Address :" + feeadd.getText()+"\n");
        String convence = "";
        if(bus.isSelected()){
            convence = "Bus";
        }else if (per.isSelected()){
            convence = "Personal";
        }
        feearea.setText(feearea.getText() + "Convence :" + convence+"\n");
        feearea.setText(feearea.getText() + "SchoolFee :" + feesch.getSelectedItem()+"\n");
        String select="Select";
        if(feebus.getSelectedItem()==select){
            select="-";
            feearea.setText(feearea.getText() + "BusFee :" + select+"\n");
        }else{
            feearea.setText(feearea.getText() + "BusFee :" + feebus.getSelectedItem()+"\n");
        }
        String submission = "";
        if(paid.isSelected()){
            submission = "Paid";
        }else if (unpaid.isSelected()){
            submission = "Unpaid";
        }
        feearea.setText(feearea.getText() + "Submission :" + submission+"\n");

    }//GEN-LAST:event_genfeeActionPerformed

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        feerecordview fee=new feerecordview();
        fee.setVisible(true);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        Classes cl=new Classes();
        cl.setVisible(true);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:
        Courses cou=new Courses();
        cou.setVisible(true);
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        // TODO add your handling code here:
        CoursesAssign couass=new CoursesAssign();
        couass.setVisible(true);
    }//GEN-LAST:event_jLabel58MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Courses;
    private javax.swing.JPanel CoursesAssign;
    private javax.swing.JButton DeleteCourse;
    private javax.swing.JButton Deletecouass;
    private javax.swing.JButton Deletedata;
    private javax.swing.JButton Deletestudent;
    private javax.swing.JPanel Home;
    private javax.swing.JButton InsertCourse;
    private javax.swing.JButton Printfee;
    private javax.swing.JButton ResetCourse;
    private javax.swing.JTextField Searchbook;
    private javax.swing.JButton Searchcouass;
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Tableclass;
    private javax.swing.JTable Tablecou3;
    private javax.swing.JTable Tablecouass;
    private javax.swing.JButton UpdateCourses;
    private javax.swing.JTextField add;
    private javax.swing.JTextField add1;
    private javax.swing.JButton addfee;
    private javax.swing.JTextArea bkcoudes;
    private javax.swing.JTextField bkprize;
    private javax.swing.JRadioButton bus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> choclass;
    private javax.swing.JComboBox<String> choose;
    private javax.swing.JComboBox<String> choosecouclass;
    private javax.swing.JComboBox<String> choosetea;
    private javax.swing.JComboBox<String> chooseteaid;
    private javax.swing.JTextField class1;
    private javax.swing.JComboBox<String> classchosub;
    private javax.swing.JComboBox<String> classday;
    private javax.swing.JComboBox<String> classday1;
    private javax.swing.JPanel classes;
    private javax.swing.JPanel classs;
    private javax.swing.JComboBox<String> classteacho;
    private javax.swing.JTextField coucode;
    private javax.swing.JTextField counm;
    private javax.swing.JPanel course;
    private javax.swing.JPanel courseassign;
    private javax.swing.JComboBox<String> couselect1;
    private javax.swing.JComboBox<String> couselect2;
    private javax.swing.JComboBox<String> couselect3;
    private javax.swing.JComboBox<String> couselect4;
    private javax.swing.JComboBox<String> couselect5;
    private javax.swing.JTextField de;
    private javax.swing.JButton deleteclass;
    private javax.swing.JTextField email;
    private javax.swing.JPanel fee;
    private javax.swing.JTextArea feeadd;
    private javax.swing.JTextArea feearea;
    private javax.swing.JComboBox<String> feebus;
    private javax.swing.JPanel feee;
    private javax.swing.JTextField feeft;
    private javax.swing.JTextField feeid;
    private javax.swing.JTextField feenm;
    private javax.swing.JTextField feephone;
    private javax.swing.JComboBox<String> feesch;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton female1;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField fn1;
    private javax.swing.JButton genfee;
    private javax.swing.JPanel home;
    private javax.swing.JTextField id;
    private javax.swing.JTextField id1;
    private javax.swing.JButton insertclass;
    private javax.swing.JButton insertdatat;
    private javax.swing.JButton insertstudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlabell;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField ln1;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton male1;
    private javax.swing.JLabel manu;
    private javax.swing.JRadioButton paid;
    private javax.swing.JRadioButton per;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JButton resetclass;
    private javax.swing.JButton resetcouass;
    private javax.swing.JButton resetfee;
    private javax.swing.JButton resetstudent;
    private javax.swing.JButton resetteacherbutton;
    private javax.swing.JTextField search;
    private javax.swing.JTextField search1;
    private javax.swing.JButton searchbook;
    private javax.swing.JTextField searchclass;
    private javax.swing.JButton searchclasss;
    private javax.swing.JTextField searchcouass;
    private javax.swing.JButton searchdata;
    private javax.swing.JButton searchstudent;
    private javax.swing.JLabel setmenu;
    private javax.swing.JPanel students;
    private javax.swing.JPanel studentsdata;
    private javax.swing.JButton submitcouassign;
    private javax.swing.JPanel teachers;
    private javax.swing.JPanel teachersdata;
    private javax.swing.JComboBox<String> timeclass;
    private javax.swing.JRadioButton unpaid;
    private javax.swing.JButton updateclass;
    private javax.swing.JButton updatecouass;
    private javax.swing.JButton updatedata;
    private javax.swing.JButton updatestudent;
    private javax.swing.JButton viewrecord;
    // End of variables declaration//GEN-END:variables
}
