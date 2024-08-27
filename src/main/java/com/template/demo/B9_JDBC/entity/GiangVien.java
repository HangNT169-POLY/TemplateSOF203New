package com.template.demo.B9_JDBC.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hangnt
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class GiangVien {

    private String maGV;

    private String ten;

    private String loai;

    private int tuoi;

    private int bac;

    private boolean gioiTinh;

}
