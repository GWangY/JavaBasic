
public class GetTest {

	public static void main(String[] args) {
		//�ж���ֵ
		int x =20;
		if(x%2==0) {
			System.out.println("x��ż��");
		}else {
			System.out.println("x������");
		}
		//��ӡ����
		int y=5;
		for(int n=1;n<=y;n++) {
			for(int a=1;a<=y+1-n;a++)
			{System.out.print(" ");}
			for(int b=1;b<=2*n-1;b++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		for(int n=1;n<=y-1;n++) {
			for(int a=1;a<=n+1;a++)
			{System.out.print(" ");}
			for(int b=1;b<=2*(y-n)-1;b++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		//ʹ��while������ 1+1/2!+����
		float sum=0;
		for(int i=1;i<=20;i++) {
			float s=1f;
			for(int k=1;k<=i;k++) {
				s=s*k;
			}
		sum=sum+1/s;
		}
		System.out.println(sum);
		//����һ�ַ�ʽ����
		double j=1.0,sum1=0.0,k;
		for(int i2=1;i2<=20;i2++) {
			j=j*i2;
			k=1/j;
			sum1=sum1+k;
		}
		System.out.println(sum1);
	}

}
