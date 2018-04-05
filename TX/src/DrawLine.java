import java.awt.Point;


public class DrawLine {
	static int width=4;
	static int height=4;
	public static void main(String[] args) {
		Point point_1=new Point(1, 2);
		Point point_2=new Point(2,3);
		drawLine(point_1.x, point_1.y, point_2.x, point_1.y); //画上横线 期望结果  1 2 3 4
		drawLine(point_2.x, point_1.y, point_2.x, point_2.y); //画右竖线 期望结果  4 8 12 16
		drawLine(point_1.x, point_2.y, point_2.x, point_2.y); //画下横线期望结果  13 14 15 16
		drawLine(point_1.x, point_1.y, point_1.x, point_2.y); //画左竖线期望结果 1 5 9 13
			
	}
	/**@function      绘制一条直线
	 * @param width   画布宽度
	 * @param height  画布高度
	 * @param p1x     第一个点的横坐标
	 * @param p1y     第一个点的纵坐标
	 * @param p2x     第二个点的横坐标
	 * @param p2y     第二个点的纵坐标
	 */
	public static void drawLine(int p1x,int p1y,int p2x,int p2y){
		int start=width*p1y+p1x;
		int end = width*p2y+p2x;
		int base=1;
		for(int x=start;x<end+1;x++){
		        int m=x/width;          //算出二维数组的第m行数
		        int n=x%height;         //算出二位数组的第n个数
		        boolean left=x%width<=(p2x);//防止左越界
		        boolean right=x%width>=p1x; //防止右越界
		        boolean top=x/width<=p2y;   //防止上越界
		        boolean bottom=x/width>=p1y;//防止下越界
		        boolean bool=left&&right&&top&&bottom;//防止越界
		        if(((m- p1y*base)*(p2x*base-p1x*base)==(n-p1x*base)*(p2y*base-p1y*base))&&bool)
		        {
		           System.out.print(x+" ");
		        }
		}
		System.out.println();
	}
}
