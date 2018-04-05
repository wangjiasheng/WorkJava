import java.awt.Point;


public class DrawLine {
	static int width=4;
	static int height=4;
	public static void main(String[] args) {
		Point point_1=new Point(1, 2);
		Point point_2=new Point(2,3);
		drawLine(point_1.x, point_1.y, point_2.x, point_1.y); //���Ϻ��� �������  1 2 3 4
		drawLine(point_2.x, point_1.y, point_2.x, point_2.y); //�������� �������  4 8 12 16
		drawLine(point_1.x, point_2.y, point_2.x, point_2.y); //���º����������  13 14 15 16
		drawLine(point_1.x, point_1.y, point_1.x, point_2.y); //��������������� 1 5 9 13
			
	}
	/**@function      ����һ��ֱ��
	 * @param width   �������
	 * @param height  �����߶�
	 * @param p1x     ��һ����ĺ�����
	 * @param p1y     ��һ�����������
	 * @param p2x     �ڶ�����ĺ�����
	 * @param p2y     �ڶ������������
	 */
	public static void drawLine(int p1x,int p1y,int p2x,int p2y){
		int start=width*p1y+p1x;
		int end = width*p2y+p2x;
		int base=1;
		for(int x=start;x<end+1;x++){
		        int m=x/width;          //�����ά����ĵ�m����
		        int n=x%height;         //�����λ����ĵ�n����
		        boolean left=x%width<=(p2x);//��ֹ��Խ��
		        boolean right=x%width>=p1x; //��ֹ��Խ��
		        boolean top=x/width<=p2y;   //��ֹ��Խ��
		        boolean bottom=x/width>=p1y;//��ֹ��Խ��
		        boolean bool=left&&right&&top&&bottom;//��ֹԽ��
		        if(((m- p1y*base)*(p2x*base-p1x*base)==(n-p1x*base)*(p2y*base-p1y*base))&&bool)
		        {
		           System.out.print(x+" ");
		        }
		}
		System.out.println();
	}
}
