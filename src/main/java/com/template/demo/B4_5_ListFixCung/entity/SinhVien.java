package com.template.demo.B4_5_ListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // contructor full ts
@NoArgsConstructor // contructor k tham so
@Builder // Tao contructor tuy y
public class SinhVien {

    private String mssv;

    private String ten;

    private int tuoi;

    private boolean gioiTinh;

    private String diaChi;

}
