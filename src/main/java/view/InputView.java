package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);

	public static int inputMovieId() {
		try {
			System.out.println("## 예약할 영화를 선택하세요.");
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			return inputMovieId();
		}
	}

	public static int inputMovieTime() {
		try {
			System.out.println("## 예약할 시간표를 선택하세요.");
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			return inputMovieTime();
		}
	}

	public static int inputMoviePeepleNumber() {
		try {
			System.out.println("## 예약할 인원을 선택하세요.");
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			return inputMoviePeepleNumber();
		}
	}
	
	public static int inputReserveType() {
		try {
			System.out.println("## 예약을 종료하고 결제를 진행하려면 1번,추가예약을 진행하려면 2번");
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.nextLine();
			return inputReserveType();
		}
	}
}
