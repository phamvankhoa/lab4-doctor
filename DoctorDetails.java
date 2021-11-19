/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class DoctorDetails 
{
    String code;
    String name;
    String specialization;
    int availability;

    public DoctorDetails(String code, String name, String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }
    public DoctorDetails()
    {
        
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap code: ");
        this.code = sc.nextLine();
        System.out.print("Nhap name: ");
        this.name = sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        this.specialization = sc.nextLine();
        System.out.print("Nhap : ");
        this.availability = sc.nextInt();
    }
    void xuat()
    {
        System.out.println("Ten code :" + this.getCode());
        System.out.println("Ten: "+this.getName());
        System.out.println("Ten chuyen nganh :" + this.getSpecialization());
        System.out.println("san sang: "+this.getAvailability());
    }
 @Override
    public String toString()
    {
        return "Doctor Code:" +code+"\n"+"Doctor Name:"+name+"\n"+"Specialization: " + specialization + "\n" + "Availability: " + availability;
 }
}
