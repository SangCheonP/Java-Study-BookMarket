import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = sc.next();

		System.out.print("연락처를 입력하세요 : ");
		int userMobile = sc.nextInt();

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market";

		boolean quit = false;

		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);

//			System.out.println("***********************************************");
//			System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
//			System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
//			System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
//			System.out.println(" 7. 영수증 표시하기 \t8. 종료");
//			System.out.println("***********************************************");

			menuIntroduction();

			System.out.print("메뉴 번호를 선택해주세요 ");
			int n = sc.nextInt();
			System.out.println(n + "번을 선택했습니다.");

			if (n < 1 || n > 8) {
				System.out.println("1번부터 8번까지의 숫자를 입력하세요.");

			} else {
				switch (n) {
				case 1:
//					System.out.println("현재 고객 정보 : ");
//					System.out.println("이름 " + name + " 연락처 " + mobile);
					menuGuestInfo(userName, userMobile);
					break;

				case 2:
//					System.out.println("2. 장바구니 상품 목록 보기 : ");
					menuCartItemList();
					break;

				case 3:
//					System.out.println("3. 장바구니 비우기 : ");
					menuCartClear();
					break;

				case 4:
//					System.out.println("4. 장바구니에 항목 추가하기 : ");
					menuCartAddItem();
					break;

				case 5:
//					System.out.println("5. 장바구니의 항목 수량 줄이기 : ");
					menuCartRemoveItemCount();
					break;

				case 6:
//					System.out.println("6. 장바구니의 항목 삭제하기 : ");
					menuCartRemoveItem();
					break;

				case 7:
//					System.out.println("7. 영수증 표시하기 : ");
					menuCartBill();
					break;

				case 8:
//					System.out.println("8. 종료 ");
					menuExit();
					quit = true;
					break;
				}
			}
		}

	}

	public static void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		System.out.println(" 7. 영수증 표시하기 \t8. 종료");
		System.out.println("***********************************************");
	}

	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 " + name + " 연락처 " + mobile);
	}

	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기 : ");
	}

	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기 : ");
	}

	public static void menuCartAddItem() {
		System.out.println("4. 장바구니에 항목 추가하기 : ");
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기 : ");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기 : ");
	}

	public static void menuCartBill() {
		System.out.println("7. 영수증 표시하기 : ");
	}

	public static void menuExit() {
		System.out.println("8. 종료 ");
	}
}
