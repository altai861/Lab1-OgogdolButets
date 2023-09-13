import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		MyArrayLinearList mainList = null;
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1. Shine shugaman jagsaalt uusgeh");
			System.out.println("2. Shugaman jagsaalt hevleh");
			System.out.println("3. Shugaman jagsaaltiin maximum");
			System.out.println("4. Shugaman jagsaaltiin minimum");
			System.out.println("5. Shugaman jagsaaltiin dundaj");
			System.out.println("6. Shugaman jagsaalt urvuu haruulj hevleh");
			System.out.println("7. Shugaman jagsaalt randomoor bairluulj hevleh");
			System.out.println("8. Osohoor erembeleh");
			System.out.println("9. Sondgoi elementuudiig ustgah");
			System.out.println("10. Davtagdsan elementuudiig ustgaj hevleh");
			System.out.println("11. Dahin neg shugaman jagsaalt araas ni zalgah");
			System.out.println("12. Programaas garah");
			
			int songolt = scanner.nextInt();
			
			if (songolt == 1) {
				System.out.println("Shugaman jagsaaltiin hemjeeg oruulna uu: ");
				int hemjee = scanner.nextInt();
				if (hemjee > 0) {
					MyArrayLinearList newList = new MyArrayLinearList(hemjee);
					for (int i = 0; i < hemjee; i++) {
						System.out.println((i+1) + " dahi elementiig ogno uu: ");
						int element = scanner.nextInt();
						newList.add(i, element);
					}
					mainList = newList;
				} else {
					System.out.println("Hemjee 0 buyu tuunees baga baij bolohgui");
				}
			}
			else if (songolt == 2) {
				if (mainList != null) {
					System.out.println("Tanii list: " + mainList.toString());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 3) {
				if (mainList != null) {
					System.out.println("Maximum element: " + mainList.max());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 4) {
				if (mainList != null) {
					System.out.println("Minimum element: " + mainList.min());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 5) {
				if (mainList != null) {
					System.out.println("Dundaj element: " + mainList.average());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 6) {
				if (mainList != null) {
					System.out.println("Urvuugaar hevleh: " + mainList.reverse());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 7) {
				if (mainList != null) {
					System.out.println("Randomoor hevleh: " + mainList.rand());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 8) {
				if (mainList != null) {
					mainList.sort();
					System.out.println("Osohoor erembeleh: " + mainList.toString());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 9) {
				if (mainList != null) {
					mainList.removeOdd();
					System.out.println("Sondgoi elementuudiig ustgasan: " + mainList.toString());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 10) {
				if (mainList != null) {
					mainList = mainList.unique();
					System.out.println("Davhatssan elementuudiig ustgasan: " + mainList.toString());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 11) {
				if (mainList != null) {
					System.out.println("Nemj zalgah listiin hemjeeg oruulna uu: ");
					int hemjee = scanner.nextInt();
					MyArrayLinearList newList = new MyArrayLinearList(hemjee);
					for (int i = 0; i < hemjee; i++) {
						System.out.println("Nemeh jagsaaltiin " + (i+1) + " dahi elementiig ogno uu: ");
						int element = scanner.nextInt();
						newList.add(i, element);
					}
					mainList = mainList.merge(newList);
					System.out.println("Araas ni shine jagsaalt nemsen: " + mainList.toString());
				} else {
					System.out.println("Tand uusgesen list baihgui baina. ");
				}
			}
			else if (songolt == 12) {
				break;
			}
			else {
				System.out.println("Ta buruu utga oruulsan baina. ");
			}
 		}
		
		
		return;
	}
}
