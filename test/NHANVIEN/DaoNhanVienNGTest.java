/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package NHANVIEN;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author dauxu
 */
public class DaoNhanVienNGTest {
    
    public DaoNhanVienNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getOjectById method, of class DaoNhanVien.
     */
    @Test
    public void testGetOjectById() {
        System.out.println("getOjectById");
        String Ma = "";
        DaoNhanVien instance = new DaoNhanVien();
        NhanVienOOP expResult = null;
        NhanVienOOP result = instance.getOjectById(Ma);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllNHANVIEN method, of class DaoNhanVien.
     */
    @Test
    public void testGetAllNHANVIEN() {
        System.out.println("getAllNHANVIEN");
        DaoNhanVien instance = new DaoNhanVien();
        ArrayList expResult = null;
        ArrayList result = instance.getAllNHANVIEN();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dangnhap method, of class DaoNhanVien.
     */
    @Test
    public void testDangnhap() {
        System.out.println("dangnhap");
        String email = "";
        String pass = "";
        DaoNhanVien instance = new DaoNhanVien();
        instance.dangnhap(email, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ManvAUTO method, of class DaoNhanVien.
     */
    @Test
    public void testManvAUTO() {
        System.out.println("ManvAUTO");
        DaoNhanVien instance = new DaoNhanVien();
        String expResult = "";
        String result = instance.ManvAUTO();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tongnv method, of class DaoNhanVien.
     */
    @Test
    public void testTongnv() {
        System.out.println("tongnv");
        DaoNhanVien instance = new DaoNhanVien();
        String expResult = "";
        String result = instance.tongnv();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ADDNhanvien method, of class DaoNhanVien.
     */
    @Test
    public void testADDNhanvien() {
        System.out.println("ADDNhanvien");
        String ma = "";
        String hoten = "";
        boolean gt = false;
        String sdt = "";
        String email = "";
        String diachi = "";
        String password = "";
        String role = "";
        String vitri = "";
        DaoNhanVien instance = new DaoNhanVien();
        instance.ADDNhanvien(ma, hoten, gt, sdt, email, diachi, password, role, vitri);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNhanVienByTen method, of class DaoNhanVien.
     */
    @Test
    public void testFindNhanVienByTen() {
        System.out.println("findNhanVienByTen");
        String ten = "";
        DaoNhanVien instance = new DaoNhanVien();
        ArrayList expResult = null;
        ArrayList result = instance.findNhanVienByTen(ten);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteNhanvien method, of class DaoNhanVien.
     */
    @Test
    public void testDeleteNhanvien() throws Exception {
        System.out.println("deleteNhanvien");
        String manv = "";
        DaoNhanVien instance = new DaoNhanVien();
        instance.deleteNhanvien(manv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Manv method, of class DaoNhanVien.
     */
    @Test
    public void testManv() {
        System.out.println("Manv");
        DaoNhanVien instance = new DaoNhanVien();
        String expResult = "";
        String result = instance.Manv();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UPdateMk method, of class DaoNhanVien.
     */
    @Test
    public void testUPdateMk() {
        System.out.println("UPdateMk");
        String mk = "";
        String email = "";
        DaoNhanVien instance = new DaoNhanVien();
        instance.UPdateMk(mk, email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DaoNhanVien.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVienOOP nv = null;
        DaoNhanVien instance = new DaoNhanVien();
        boolean expResult = false;
        boolean result = instance.update(nv);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class DaoNhanVien.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        NhanVienOOP nv = null;
        DaoNhanVien instance = new DaoNhanVien();
        boolean expResult = false;
        boolean result = instance.save(nv);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetArrayList method, of class DaoNhanVien.
     */
    @Test
    public void testGetArrayList() {
        System.out.println("GetArrayList");
        DaoNhanVien instance = new DaoNhanVien();
        ArrayList expResult = null;
        ArrayList result = instance.GetArrayList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
