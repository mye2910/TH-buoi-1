package bai1b;

import java.util.Scanner;

public class Main {
	
		static Scanner sc = new Scanner(System.in);
		static void nhapXe(vehicle xe){
			System.out.print("Nhap ten chu xe: ");
		    xe.setChuXe(sc.nextLine());
		    System.out.print("Nhap loai xe: ");
		    xe.setLoaiXe(sc.nextLine());
		    System.out.print("Nhap dung tich xe: ");
		    xe.setDungTich(sc.nextInt());
		    System.out.print("Nhap tri gia xe: ");
		    xe.setTriGia(sc.nextDouble());sc.nextLine();       
		  } 
		public static void  main(String[] args){
			vehicle v[]= null;
			int a, n = 0;
			boolean flag = true;
			do {
				System.out.println(" lua chon 1 hoac 2");
				System.out.println("1 nhap thong tin xe");  
				System.out.println("2 xuat so tien thue");
				System.out.println("nhap so khac de thoat");
				a = sc.nextInt();
			switch (a) {
			 case 1:
		         System.out.print("Nhap so luong xe ban muon khai bao thue: ");
		         n=sc.nextInt();
		         v= new vehicle[n];
		         for (int i = 0; i < n; i++) {
		             System.out.println("Xe thu " + (i+1));
		             v[i] = new vehicle();
		             nhapXe(v[i]);
		         }
		         break;
				case 2:
		         System.out.printf("%5s %5s %5s %10s %10s %8s \n","loai xe","Chu xe","Dung tich","Tri gia","Thue");
		         for (int i = 0; i < n; i++) {
		             v[i].inThue();
		         }
		         break;
		     default:
		         System.out.println("bye");
		         flag=false;
		         break;
			}
		}while (flag);
		}
		}

