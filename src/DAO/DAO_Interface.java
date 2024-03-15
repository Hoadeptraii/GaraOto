/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.util.ArrayList;

/**
 *
 * @author HOANG SANG
 */
public interface DAO_Interface <T>{
    public int Insert(T t);
    
    public int Update(T t);
    
    public int  Clear(T t);
    
    public ArrayList<T> selectAll();
    
    public T selectById(T t);
    
    public ArrayList<T> selectByCondition(String Condition);
}
