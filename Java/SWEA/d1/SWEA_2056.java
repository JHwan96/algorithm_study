package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2056 {
	// 문제이름: 연월일 달력
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String tempStr = br.readLine();
			String changeCalender = changeCalender(tempStr);

			if (changeCalender == "no") {
				System.out.println("#" + (i + 1) + " "+ -1);
			} else {
				System.out.println("#" + (i + 1) + " " + changeCalender);
			}
		}
	}

	public static String changeCalender(String calender) {
		String result = "";

		String year = calender.substring(0, 4);
		String month = calender.substring(4, 6);
		String day = calender.substring(6, 8);
		String first = day.substring(0, 1);

		switch (month) {
		case "01":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "02":
			if (!first.equals("0") && Integer.parseInt(day) > 28) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "03":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "04":
			if (!first.equals("0") && Integer.parseInt(day) > 30) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "05":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "06":
			if (!first.equals("0") && Integer.parseInt(day) > 30) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "07":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "08":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "09":
			if (!first.equals("0") && Integer.parseInt(day) > 30) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "10":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "11":
			if (!first.equals("0") && Integer.parseInt(day) > 30) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		case "12":
			if (!first.equals("0") && Integer.parseInt(day) > 31) {
				result = "no";
			} else if (day.substring(1, 2).equals("0")) {
				result = "no";
			} else {
				result = year + "/" + month + "/" + day;
			}
			break;
		default:
			result = "no";
		}
		return result;
	}
}
