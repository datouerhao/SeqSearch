import java.util.Arrays;
import java.util.Scanner;

public class DeleteTest {
	public static void main(String[] arg) {
		int[] a = { 4, 6, 2, 8, 1, 9, 0, 3 };
		System.out.println(Arrays.toString(a));
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫɾ��������");
		// ��ſ���̨��������
		int num = input.nextInt();
		// ����searc()������������ֵ������result��
		DeleteTest test = new DeleteTest();
		test.delete(num, a);
	}

	public void delete(int num, int a[]) {
		int length = a.length;
		int j;
		for (j = 0; j < length; j++) {
			if (a[j] == num)
				break;
		}
		for (int k = j + 1; k < length; k++) {
			a[k - 1] = a[k];
		}
		length--;
		for (j = 0; j < length; j++) {
			System.out.print(a[j]);
		}
	}
}
