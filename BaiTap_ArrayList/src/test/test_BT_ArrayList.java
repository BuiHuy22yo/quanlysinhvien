package test;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test_BT_ArrayList {
	static ArrayList<String> dsSV = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Thêm sinh viên");
		System.out.println("2.Xuất danh sách sinh viên");
		System.out.println("3.Sửa tên sinh viên");
		System.out.println("4.Xóa sinh viên chứa tên bất kỳ");
		System.out.println("5.Tìm sinh viên tên có chữa An");
		System.out.println("6.Sắp xếp sinh viên");
		System.out.println("7.xuất ra số lượng sinh viên");
		// System.out.println("mời bạn chọn");
		while (true) {
			menu();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
//		System.out.println("1.Thêm sinh viên");

//		System.out.println("2.Xuất danh sách sinh viên");
//		System.out.println("3.Sửa tên sinh viên");
//		System.out.println("4.Xóa sinh viên chứa tên bất kỳ");
//		System.out.println("5.Tìm sinh viên tên có chữa An");
//		System.out.println("6.Sắp xếp sinh viên");
//		System.out.println("7.xuất ra số lượng sinh viên");
		System.out.println("mời bạn chọn");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			Them();
			break;
		case 2:
			Xuat();
			break;
		case 3:
			Sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			tim();
			break;
		case 6:
			SapXep();
			break;
		case 7:
			XuatSoSv();
			break;
		default: {
			System.out.println("bạn nhập sai mời nhập lại");
			System.out.println("nhập lại");
			break;
		}
		}
	}

	private static void XuatSoSv() {
		// TODO Auto-generated method stub
		System.out.println("Số lượng sinh viên là: " + dsSV.size());
	}

	private static void SapXep() {
		// TODO Auto-generated method stub
		Collections.sort(dsSV);
	}

	private static void tim() {
		// TODO Auto-generated method stub
		if (dsSV.contains("An")) {
			System.out.println("An có trong danh sách");
		} else {
			System.out.println("An không có trong danh sách");
		}
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("nhập ví trí muốn xóa");
		int vt = new Scanner(System.in).nextInt();
		if (vt < dsSV.size()) {
			dsSV.remove(vt);
		} else {
			System.out.println("vị trí " + vt + " ko tồn tại");
		}
	}

	private static void Sua() {
		// TODO Auto-generated method stub
		System.out.println("nhập ví trí muốn sửa tên");
		int vt = new Scanner(System.in).nextInt();
		if (vt < dsSV.size()) {
			System.out.println("nhập tên muốn sửa");
			String ten = new Scanner(System.in).nextLine();
			dsSV.set(vt, ten);
		} else {
			System.out.println("vị trí " + vt + " ko tồn tại");
		}
	}

	private static void Xuat() {
		// TODO Auto-generated method stub
		System.out.println("Danh sách sinh viên");
		for (int i = 0; i < dsSV.size(); i++) {
			System.out.print(dsSV.get(i) + "\t");
		}
		System.out.println();
	}

	private static void Them() {
		// TODO Auto-generated method stub
		System.out.println("nhập tên sinh viên muốn thêm:");
		String ten = new Scanner(System.in).nextLine();
		dsSV.add(ten);
	}

}
