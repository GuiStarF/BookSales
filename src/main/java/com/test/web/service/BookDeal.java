package com.test.web.service;

import com.test.web.ConnDB;
import com.test.web.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDeal {
    private Connection ct = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public static final String url = "jdbc:mysql://localhost:3306/sql";
    public static final String user = "root";
    public static final String password = "root";

    private ArrayList<Book> al = new ArrayList<Book>();
    private ArrayList<Book> al2 = new ArrayList<Book>();

    public ArrayList getResult(){
        ConnDB cd = new ConnDB();
        ct = cd.getCt();
        try {
            ps = ct.prepareStatement("select * from book");
            rs = ps.executeQuery();

            while(rs.next()) {
                Book bk = new Book();
                bk.setBookId(rs.getString(1));
                bk.setBookName(rs.getString(2));
                bk.setBookNum(rs.getString(3));
                bk.setBookA(rs.getString(4));
                bk.setBookB(rs.getString(5));

                al.add(bk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.close();
        }
        return al;
    }

    public ArrayList getABook(String id) {
        ConnDB cd = new ConnDB();
        ct = cd.getCt();
        try {
            ps = ct.prepareStatement("select * from book WHERE \"BookId\" = '"+ id +"'");
            rs = ps.executeQuery();

            while(rs.next()) {
                Book bk = new Book();
                bk.setBookId(rs.getString(1));
                bk.setBookName(rs.getString(2));
                bk.setBookNum(rs.getString(3));
                bk.setBookA(rs.getString(4));
                bk.setBookB(rs.getString(5));

                al2.add(bk);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return al2;
    }

    public boolean addeBook(String id, String name, String num, String a,String b){
        boolean bl = false;
        ConnDB cd = new ConnDB();
        ct = cd.getCt();
        try {
            ps = ct.prepareStatement("INSERT INTO book VALUES ('"+ id +"','"+ name +"','"+ num +"','"+ a +"','"+ b +"')");
            if (ps.executeUpdate() != 0){
                bl = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bl;
    }





    public void close() {
        try {
            if(rs != null) {
                rs.close();
                rs = null;
            }

            if(ps != null) {
                ps.close();
                ps = null;
            }

            if(ct != null) {
                ct.close();
                ct = null;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

}
