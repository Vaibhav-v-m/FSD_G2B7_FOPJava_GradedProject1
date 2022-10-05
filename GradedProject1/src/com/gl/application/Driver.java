package com.gl.application;

import com.gl.admin.AdminDepartment;
import com.gl.hr.HrDepartment;
import com.gl.super1.SuperDepartment;
import com.gl.tech.TechDepartment;

public class Driver {
    public static void main(String[] args) {

        SuperDepartment SD = new SuperDepartment();
        AdminDepartment AD = new AdminDepartment();
        HrDepartment HD = new HrDepartment();
        TechDepartment TD = new TechDepartment();

        System.out.println(AD.departmentName());
        System.out.println(AD.getTodaysWork());
        System.out.println(AD.getWorkDeadline());
        System.out.println(SD.isTodayAHoliday());
        System.out.println();

        System.out.println(HD.departmentName());
        System.out.println(HD.doActivity());
        System.out.println(HD.getTodaysWork());
        System.out.println(HD.getWorkDeadline());
        System.out.println(SD.isTodayAHoliday());
        System.out.println();

        System.out.println(TD.departmentName());
        System.out.println(TD.getTodaysWork());
        System.out.println(TD.getWorkDeadline());
        System.out.println(TD.getTechStackInformation());
        System.out.println(SD.isTodayAHoliday());


    }
}
