/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.reparabyte.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Eldo
 */
public class DataBase {
    private static Properties loadProperties(){
        try(FileInputStream fs = new FileInputStream("db.properties")) {
            Properties ps = new Properties();
            ps.load(fs);
            return ps;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
    
}
