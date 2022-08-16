//
//package com.projectfiles.form;
//
//import com.projectfiles.model.Model_Card;
//import com.projectfiles.model.Model_db;
//import java.awt.Color;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.util.Vector;
//import javax.swing.ImageIcon;
//import javax.swing.table.DefaultTableModel;
//
///**
// *
// * @author BLANCO
// */
//public class Form_Home extends javax.swing.JPanel {
//
//    private final String prefix = "C:\\Users\\Admin\\Documents\\NetBeansProjects\\SDT-Student-Management\\ProjectFiles\\src\\main\\java\\com.projectfiles.icons\\";
//
//    Model_db data = new Model_db();
//
//    private String CYCLE_ID = "BTC";
//
//    public String Stud_count = "0";
//    public String Lect_count = "0";
//    public String Course_count = "0";
//
//    public String getCYCLE_ID() {
//        return CYCLE_ID;
//    }
//
//    public void setCYCLE_ID(String CYCLE_ID) {
//        this.CYCLE_ID = CYCLE_ID;
//    }
//
//
//
//    public Form_Home() {
//        initComponents();
//        getStudentCount();
//        getLecturerCount();
//        getCourseCount();
//        card1.setData(new Model_Card(new ImageIcon(prefix + "9.png"),"STUDENTS",Stud_count));
//        card2.setData(new Model_Card(new ImageIcon(prefix + "12.png"),"TEACHERS",Lect_count));
//        card3.setData(new Model_Card(new ImageIcon(prefix + "11.png"),"COURSES",Course_count));
//        jScrollPane1.getViewport().setBackground(Color.WHITE);
////        table1.setBackground(Color.WHITE);
//    }
//
//
//    public void getStudentCount(){
//        try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+data.getName(),data.getUname(),data.getPassword());
//                String sql = "SELECT COUNT(Stud_ID) AS Stud_Count from STUDENT where CYCLE_ID=?";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.setString(1,CYCLE_ID);
//                ResultSet rs = pst.executeQuery();
//
//                while(rs.next()){
//                    Stud_count = rs.getString("Stud_Count");
//                }
//            }
//            catch(Exception e){
//                System.out.println("Error::"+e.getMessage());
//         }
//    }
//
//    public void getLecturerCount(){
//        try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+data.getName(),data.getUname(),data.getPassword());
//                String sql = "SELECT COUNT(Lect_ID) AS Lect_Count from LECTURER where CYCLE_ID=?";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.setString(1,CYCLE_ID);
//                ResultSet rs = pst.executeQuery();
//
//                while(rs.next()){
//                    Lect_count = rs.getString("Lect_Count");
//                }
//            }
//            catch(Exception e){
//                System.out.println("Error::"+e.getMessage());
//         }
//    }
//
//    public void getCourseCount(){
//        try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+data.getName(),data.getUname(),data.getPassword());
//                String sql = "SELECT COUNT(COURSE_ID) AS Course_Count from COURSE where CYCLE_ID=?";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.setString(1,CYCLE_ID);
//                ResultSet rs = pst.executeQuery();
//
//                while(rs.next()){
//                    Course_count = rs.getString("Course_Count");
//                }
//            }
//            catch(Exception e){
//                System.out.println("Error::"+e.getMessage());
//         }
//
//    }
//
//
//    public void tableUpdate(String CycleId){
//        try{
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+data.getName(),data.getUname(),data.getPassword());
//                String sql = "SELECT * from STUDENT where CYCLE_ID=?";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.setString(1,CycleId);
//                ResultSet rs = pst.executeQuery();
//                ResultSetMetaData Rss = rs.getMetaData();
//                int c = Rss.getColumnCount();
//
//                DefaultTableModel Df = (DefaultTableModel) table1.getModel();
//                Df.setRowCount(0);
//
//                while(rs.next()){
//                    Vector v = new Vector();
//
//                    for(int a=1;a<=c;a++){
//                        v.add(rs.getString("Stud_ID"));
//                        v.add(rs.getString("Name")+" "+rs.getString("Surname"));
//                        v.add(rs.getString("Sex"));
//                        v.add(rs.getString("DOB"));
//                        v.add(rs.getString("LastLogin"));
//                    }
//
//                    Df.addRow(v);
//                }
//            }
//            catch(Exception e){
//                System.out.println("Error::"+e.getMessage());
//            }
//    }
//
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        panel = new javax.swing.JLayeredPane();
//        card3 = new com.projectfiles.components.Card();
//        card2 = new com.projectfiles.components.Card();
//        card1 = new com.projectfiles.components.Card();
//        panelBorder1 = new com.projectfiles.swingcomponents.PanelBorder();
//        jLabel1 = new javax.swing.JLabel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        table1 = new com.projectfiles.swingcomponents.Table();
//
//        setBackground(new java.awt.Color(231, 217, 217));
//
//        panel.setLayout(new java.awt.GridLayout(1, 0, 5, 0));
//
//        card3.setColor1(new java.awt.Color(17, 11, 119));
//        panel.add(card3);
//
//        card2.setColor1(new java.awt.Color(142, 11, 173));
//        panel.add(card2);
//
//        card1.setColor1(new java.awt.Color(115, 209, 42));
//        panel.add(card1);
//
//        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
//
//        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
//        jLabel1.setForeground(new java.awt.Color(158, 129, 129));
//        jLabel1.setText("STUDENTS IN YOUR CYCLE");
//
//        table1.setModel(new javax.swing.table.DefaultTableModel(
//            new Object [][] {
//                {null, null, null, null, null},
//                {null, null, null, null, null},
//                {null, null, null, null, null},
//                {null, null, null, null, null}
//            },
//            new String [] {
//                "Student ID", "Student Name", "Sex", "Date of Birth", "Last Login"
//            }
//        ));
//        jScrollPane1.setViewportView(table1);
//
//        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
//        panelBorder1.setLayout(panelBorder1Layout);
//        panelBorder1Layout.setHorizontalGroup(
//            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelBorder1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(panelBorder1Layout.createSequentialGroup()
//                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(0, 0, Short.MAX_VALUE))
//                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
//                .addContainerGap())
//        );
//        panelBorder1Layout.setVerticalGroup(
//            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(panelBorder1Layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(164, 164, 164))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
//        this.setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
//                .addContainerGap())
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(20, 20, 20)
//                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addContainerGap())
//        );
//    }// </editor-fold>//GEN-END:initComponents
//
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private com.projectfiles.components.Card card1;
//    private com.projectfiles.components.Card card2;
//    private com.projectfiles.components.Card card3;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JLayeredPane panel;
//    private com.projectfiles.swingcomponents.PanelBorder panelBorder1;
//    private com.projectfiles.swingcomponents.Table table1;
//    // End of variables declaration//GEN-END:variables
//}
