import java.util.Scanner;

/*

 * ˳�����

 */

public class SeqSearch {
public static void main(String[] arg) {  
    int[] a={4,6,2,8,1,9,0,3};
    Scanner input=new Scanner(System.in);
    System.out.println("��������Ҫ���ҵ�����");
    //��ſ���̨��������
    int num=input.nextInt();
    //����searc()������������ֵ������result��
    int result=search(a, num);
    if(result==-1){
         System.out.println("����������������������С�");
    }
    else
         System.out.println("����������ִ��ڣ��������е�λ���ǵڣ�"+result+"��");
}
public static int search(int[] a, int num) {        
    for(int i = 0; i < a.length; i++) {
        if(a[i] == num){//������ݴ���
            return i+1;//�����������ڵ��±꣬Ҳ����λ��
        }
    } 
    return -1;//�����ڵĻ�����-1
}
}