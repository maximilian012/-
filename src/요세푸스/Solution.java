package �似Ǫ��;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuffer sb = new StringBuffer(); // ���ڿ� �̾� ���̱�
		int n = sc.nextInt(); // 7��
		int k = sc.nextInt(); // 3��°

		for (int i = 1; i <= n; i++) {
			que.add(i);// que�� 1���� 7���� �鰨
		}

		sb.append("<");
		String str = "";
		int sum = 0;
		while (!que.isEmpty()) {// 0~6 ��

			for (int j = 0; j < k - 1; j++) { // 3��ŭ ��

//				if (j != 2) {    ===========================> �̰� �� �ȵǴ� (k�� �׳� k�϶�)
//					int tmp = que.poll(); // �Ǿտ� ������
//					que.add(tmp); // ������ �ڿ��� �ֱ�
//				} else {
//					sum = que.poll(); // ������ �ֱ�
//				}
				int tmp = que.poll();
				que.add(tmp);

			}
			sum = que.poll();// for�� �ٵ��� �Ǿտ��� 3������ sum�� ����
			str += sum; // �������� ���ڸ� string �迭�� ��ġ��

			if (!que.isEmpty()) { // queue�� �Ⱥ���ٸ� ,���̱� ����ٸ� ���������ڿ� ��ǥ �Ⱥ��̱� ����

				str += ", ";
			}
			if (que.isEmpty()) { // queue�� ����ٸ� ���±��� ��ģ�� �÷��� ������ ���� �ٿ��ֱ�
				sb.append(str);
				sb.append(">");
			}
		}
		System.out.println(sb);
	}

}
