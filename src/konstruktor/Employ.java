/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author febri
 */
public class Employ extends Person{
    private String noKaryawan;
    public Employ (String noKaryawan,String nama,int usia)
    {
        super(nama,usia);
        this.noKaryawan = noKaryawan;
    }
    public void info()
    {
        System.out.println("No. karyawan : "+this.noKaryawan);
        super.info();
    }
}
