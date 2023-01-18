package 요세푸스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuffer sb = new StringBuffer(); // 문자열 이어 붙이기
		int n = sc.nextInt(); // 7명
		int k = sc.nextInt(); // 3번째

		for (int i = 1; i <= n; i++) {
			que.add(i);// que에 1부터 7까지 들감
		}

		sb.append("<");
		String str = "";
		int sum = 0;
		while (!que.isEmpty()) {// 0~6 번

			for (int j = 0; j < k - 1; j++) { // 3만큼 돔

//				if (j != 2) {    ===========================> 이건 왜 안되누 (k가 그냥 k일때)
//					int tmp = que.poll(); // 맨앞에 버리고
//					que.add(tmp); // 버린거 뒤에다 넣기
//				} else {
//					sum = que.poll(); // 빠진거 넣기
//				}
				int tmp = que.poll();
				que.add(tmp);

			}
			sum = que.poll();// for문 다돌고 맨앞에거 3꺼내서 sum에 저장
			str += sum; // 빠져나온 숫자를 string 배열에 합치기

			if (!que.isEmpty()) { // queue가 안비었다면 ,붙이기 비었다면 마지막수뒤에 쉼표 안붙이기 위해

				str += ", ";
			}
			if (que.isEmpty()) { // queue가 비었다면 여태까지 합친거 플러스 마지막 꺽새 붙여주기
				sb.append(str);
				sb.append(">");
			}
		}
		System.out.println(sb);
	}

}
